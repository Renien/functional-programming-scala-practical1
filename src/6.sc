trait Fish {
  def eat
  def swim
  def speak
}

trait Animal {
  def eat(whatEats: String)
}


//Can do multiple inheritance
//class Dolphen extends Fish with Trait1 with Trait2 { ... }


trait Woman {
  def longHair { println("I have long hair") }
}

//Extends
class Dolphin extends Fish {
  override def eat: Unit = { println("I eat herring..") }

  override def swim: Unit = { println("I can swim in shallow water..")}

  override def speak: Unit = { println("I can whistle..")}

  def dance { println("I can dance..") }
}

class Shark extends Fish {
  override def eat: Unit = ???

  override def swim: Unit = ???

  override def speak: Unit = ???

  def kill { println("I can kill others..") }
}

class Mermaid extends Fish with Woman{
  override def eat: Unit = ???

  override def swim: Unit = ???

  override def speak: Unit = ???

  def sing { println("I can Sing..") }
}