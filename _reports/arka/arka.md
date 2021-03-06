---
author: Arka Ghosh
layout : report
---

## Groups

#### Definitions

1. Defined _Monoid_ in the file `Monoid.idr` by the type
   `IsMonoid` in the file `Monoid.idr`
2. Defined _Group_ in the file `Group.idr` by the type
   `IsGroup` in the file `Group.idr`.
3. Corrected the definition of _Image of a homomorphism_
   given by Chinmoy, in the file `Quotient_Group.idr`.
4. Defined _free group generated by a type_ in the file
   `FreeGroup.idr`.
5. Defined _kernel of a homomorphism_ in the file
   `Group_kernel.idr`.

#### Properties
Proved the following property for groups in the file
`Group_property.idr`.
1. Identity is unique for groups. (`Group_property_1`)
2. Inverse of an element is unique. (`Group_property_2`)
3. b = c implies a\*b = a\*c. (`Group_property_3`)
4. a\*b = a\*c implies b = c. (`Group_property_4`)
5. b = c implies b\*a = c\*a. (`_Group_property_5`)
6. b\*a = c\*a implies b = c. (`_Group_property_6`)
7. One sided inverse is two sided inverse. (`Group_property_7`)
8. If f : g -> h is group homomorphism then
 f(inv(a)) = inv(f(a)) (Proof has _holes_ to fill)
 (`Group_property_8`)
9. Proved that elements of a free group has inverses.

### Quotient Groups

All are done in the file `Quotient_Group.idr`.
2. Defined the type of `Coset` of an element.
1. Given the type which represents that a particular element is in the Coset of an element by `Is_in_Coset`.
3. Given the type of the proposition - If b is in the coset
   of a, then a is in the coset of b.
4. Given the type of the proposition - A proof that
  _Coset(a) * Coset(b)_ and _Coset(a*b)_ are equal as sets.



## Rings

Defined rings in the file `Ring.idr`.

## Sorting with proof

#### Type of sorted vectors
Defined the type of sorted vectors by the type
`SortedVect` in the file `sorting_with_proof.idr`


#### Permutation

1. Defined permutations as bijections by two functions `PermB`
   and `Perm2` in the file `Permutation.idr`.
2. Defined application of a permutation by the function
  `applyFun`in the file `Permutation.idr`.
3. Defined a type `Finite` and proved that it is _equivalent_
   to the type `Fin`. `Finite` is easier to work with as it
   makes the size explicit.
4. Defined permutations by constructors by the type `PermC`
   in the file `PermCons.idr`.
5. Proved that _permutations defined using constructors are
   bijections_ in the file `PermCons.idr`. Some helper functions
   are given in the file `PermConsProperties.idr`

#### Incomplete Proof of Sorting

Started a proof that the sorting algorithm is correct in the
file `InsertionProof.idr`. Had to stop working on it as the code
became very complicated and was taking too long to compile.

## Graph

Gave an alternate definition of graphs using adjacency matrix in the
file `Graph_alt.idr`. Gave a method (`fn_to_vect`) to convert a
function on `(Fin n, Fin n)` to a matrix. This is very useful to
define _identity matrices_.

## Quotient Types

1. _Quotient types_ are defined as types along with an equivalence
   relation.
2. _Type of non-dependent functions_ between two quotient types
   _(A,relA)_ and _(B,relB)_ isdefined as the function type
   _(A -> B)_ along with the condition of passing through the
   relations.
3. _Family of quotient types_ is defined to be a type family along
  with transports
4. Defined the _type of non_dependent function_ as a quotient
   type by defining a relation on _(A -> B)_ and proving that
   it is a equivalence relation.      

## Relations

Defined a addition operation on the type of relations on a type. Proved
the following
1. The type of relations form a commutative monoid.
2. If we consider only equivalence relations then each element is
   an idempotent.

## Parsers

1. Created a method to parse floating point numbers
2. Defined the type of expressions as _definitions_
   (assigning a value to a variable), _Expressions_
   (stands for constants), _Function_(Curried function on
     double)

## Integers

1. Defined Integers as the quotient type _(Nat, Nat)_ along
   with a relation _ZZ_rel_. Also proved it is an equivalence
   relation. (In the file `ZZ_alt.idr`)
2. Defined addition for Integers and proved that it respects
   the relation _ZZ_rel_.(In the file `ZZ_plus.idr`)
3. Defined substraction for Integers and proved that it
   respects the relation _ZZ_rel_.(In the file `ZZ_subs.idr`).

## Left Overs

1. Defined a more explicit version of `congruence` in the file
   `congruence.idr`
2. Proved that the equality for product type is generated by the
   equalities of components.
