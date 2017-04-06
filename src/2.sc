val s = "hello"; println(s)

var x = 0
var y = 1

if (x < 2)
  println("too small")
else
  println("not too small")

x+
y

/*
 Singleton objects
one way in which Scala is more object-oriented
than Java is that classes in Scala cannot have static members
 */
object Timer {
  var count = 0

  def currentCount(): Long = {
    count += 1
    count
  }
}

Timer.currentCount()
Timer.currentCount()


//Scala Application

object Hello {
  def main(args: Array[String]) {
    for (arg <- args)
      println(arg +": "+ args)

    println("Hello World!!")
  }
}

//object FallWinterSpringSummer extends Application {
//  for (season <- List("fall", "winter", "spring"))
//    println(season)
//}

/*
 This chapter has given you the basics of classes and objects in Scala,
 and shown you how to compile and run applications.
 */
