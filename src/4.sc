//Functional Objects

//class Rational(n: Int, d: Int)

//class Rational(n: Int, d: Int) {
//  println("Created "+ n +"/"+ d)
//}

//class Rational(n: Int, d: Int) {
//  override def toString = n +"/"+ d
//}

//val oneHalf = new Rational(1, 2)
//val twoThirds = new Rational(2, 3)
//
//class Rational(n: Int, d: Int) {
//  require(d != 0)
//  override def toString = n +"/"+ d
//}
//
//val zeroDevisor = new Rational(5, 0)

//class Rational(n: Int, d: Int) {
//  require(d != 0)
//  val numer: Int = n
//  val denom: Int = d
//  override def toString = numer +"/"+ denom
//  def add(that: Rational): Rational =
//    new Rational(
//      numer * that.denom + that.numer * denom,
//      denom * that.denom
//    )
//}
//
//val oneHalf = new Rational(1, 2)
//val twoThirds = new Rational(2, 3)
//
//val result = oneHalf add twoThirds

//Auxiliary constructors >>>

class Rational(n: Int, d: Int) {
  require(d != 0)
  val numer: Int = n
  val denom: Int = d
  def this(n: Int) = this(n, 1) // auxiliary constructor
  override def toString = numer +"/"+ denom
  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

//  def + (that: Rational): Rational =
//    new Rational(
//      numer * that.denom + that.numer * denom,
//      denom * that.denom
//    )
//  def * (that: Rational): Rational =
//    new Rational(numer * that.numer, denom * that.denom)
}

val y = new Rational(3)

//Talk about access modifiers