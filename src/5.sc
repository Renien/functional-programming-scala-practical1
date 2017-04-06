//implicit explanation

//Eg:- “Hello”.printChar Not StringHelp.printChar(“Hello")

implicit class StringHelp(s: String) {
  def printChar = s.map(c => println(c))
}

"Hello".printChar


//Implicit arguments

def printImplicitly (implicit arg : String) = println(arg)
printImplicitly("Hello World - 1")

implicit val hello = "Hello World - 2"
implicit val hello2 = "Hello World - 3"
printImplicitly

//Implicits Defined in Current Scope
implicit val n: Int = 5
def add(x: Int)(implicit y: Int) = x + y
add(5) // takes n from the current scope, res: Int = 10

