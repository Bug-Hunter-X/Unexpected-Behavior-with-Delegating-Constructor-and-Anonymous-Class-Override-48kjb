```scala
class MyClass(val value: Int) {
  def this() = this(0) // Delegating constructor
}

object Main {
  def main(args: Array[String]): Unit = {
    val instance1 = new MyClass(10)
    val instance2 = new MyClass()

    println(instance1.value) // Output: 10
    println(instance2.value) // Output: 0

    // Solution: Use a different approach to create the instance, perhaps factory method
    val instance3 = new MyClass { override def value = 20 }
    println(instance3.value) // Output: 20, now it correctly uses the anonymous class override!

    //Another solution, using a factory method 
    val instance4 = createMyClassWithOverride(20)
    println(instance4.value) // Output: 20
  }

  def createMyClassWithOverride(overrideValue:Int) = new MyClass() { override val value = overrideValue }
}
```