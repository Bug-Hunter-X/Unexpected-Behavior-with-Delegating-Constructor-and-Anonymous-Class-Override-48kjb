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

    // The bug is here: The following code doesn't work as expected!
    val instance3 = new MyClass { override val value = 20 }
    println(instance3.value) // Output: 20, but it should be 0 because of the constructor call! 
  }
}
```