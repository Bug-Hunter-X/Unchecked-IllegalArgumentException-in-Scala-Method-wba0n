```scala
class MyClass(val value: Int) {
  def myMethod(x: Int): Int = {
    if (x > value) {
      x + value 
    } else {
      throw new IllegalArgumentException("x must be greater than value")
    }
  }
}

val obj = new MyClass(10)
println(obj.myMethod(5)) // This line throws the exception
```