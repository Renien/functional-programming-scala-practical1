//Classes and Objects

//class ChecksumAccumulator {
//  // class definition goes here
//}
//
//val obj1 = new ChecksumAccumulator

class ChecksumAccumulator {
  var sum = 0
}

val obj1 = new ChecksumAccumulator
val obj2 = new ChecksumAccumulator

println(s"obj1.sum = ${obj1.sum} , obj2.sum = ${obj2.sum}")

obj1.sum = 3
println(s"obj1.sum = ${obj1.sum} , obj2.sum = ${obj2.sum}")

//Wont compile, because obj1 is a val
//obj1 = new ChecksumAccumulator


class ChecksumAccumulatorPrivate {
  private var sum = 0
//  def add(b: Int): Unit = {
//    sum += b
//  }
//  def add(b: Int) = sum += b

  def add(b: Int) { sum += b }
}

// Won’t compile, because sum is private
//val obj1Private = new ChecksumAccumulatorPrivate
//obj1Private.sum = 5


def g() { "this String gets lost too" }
def h() = { "this String gets returned!" }
h