```groovy
def myMethod(Closure closure) {
  println "Before closure execution"
  closure()
  println "After closure execution"
}

myMethod { 
  println "Inside closure"
  throw new RuntimeException("Something went wrong")
}
println "This line won't be reached" 
```