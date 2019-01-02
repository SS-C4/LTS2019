def sum1(l: List[Int]) : Int = {
  var tot = 0
  var lst = l
  while (lst.nonEmpty) {
    tot += lst.head
    lst = lst.tail
  }
  return tot
}

println(sum1(List(2, 3, 7, 9)))

def sum2(l: List[Int]) : Int =
  if (l.isEmpty) 0 else l.head + sum2(l.tail)


println(sum2(List(2, 3, 7, 9)))

val sum3 : List[Int] => Int = {
  case List() => 0
  case head :: tail => head + sum2(tail)
}

println(sum3(List(2, 3, 7, 9)))

@annotation.tailrec
def sum4(l: List[Int], accum: Int = 0) : Int =
  if (l.isEmpty) accum else sum4(l.tail, accum + l.head)

println(sum4(List(2, 3, 7, 9)))