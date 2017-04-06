//Basic Types and Operations

//Floating points

val big = 1.2345
val bigger = 1.2345e1
val biggerStill = 123E45


val a = 'A'
//provide an octal or hex number for the character
// code point preceded by a backslash
//ASCII code
val c = '\101'

/*
 Operations are methods
 */
// Scala invokes (1).+(2)
val sum = 1 + 2

val sumMore = (1).+(2)

val longSum = 1 + 2L // Scala invokes (1).+(2L)


val s = "Hello, world!"
s indexOf 'o' // Scala invokes s.indexOf(’o’)

s indexOf ('o', 5) // Scala invokes s.indexOf(’o’, 5)

s.toLowerCase
s toLowerCase

/*
  Arithmetic operations
 */
1.2 + 2.3
3 - 1
2L * 3L
11 / 4
11 % 4
11.0f / 4.0f
11.0 % 4.0

math IEEEremainder(11.0, 4.0)

//Negative
val neg = 1 + -3
val y = +3

//Relational and logical operations
1 >  2
1 < 2
1.0 <= 1.0
3.5f >= 3.6f

//boolean
val thisIsBoring = !true
!thisIsBoring

val toBe = true
val question = toBe || !toBe
val paradox = toBe && !toBe

def salt() = { println("salt"); false }
def pepper() = { println("pepper"); true }
pepper() && salt()
salt() && pepper()


//Object equality
1 == 2
1 != 2
2 == 2

List(1, 2, 3) == List(1, 2, 3)
List(1, 2, 3) == List(4, 5, 6)

List(1, 2, 3) == "hello"
List(1, 2, 3) == null

("he"+"llo") == "hello"

//Operator Procedence >> Need to google to easy way to remeber
3 << 4
2 << 2 + 2
2 + 2 << 2