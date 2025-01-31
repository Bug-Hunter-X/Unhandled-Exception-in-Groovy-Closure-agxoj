```groovy
def myMethod(Closure closure) {
  println "Before closure execution"
  try {
    closure()
  } catch (RuntimeException e) {
    println "Exception caught: "+ e.getMessage()
  }
  println "After closure execution"
}

myMethod { 
  println "Inside closure"
  throw new RuntimeException("Something went wrong")
}
println "This line will be reached"
```