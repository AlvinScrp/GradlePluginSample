
static def  testClosure(String a, int b, Closure closure) {
    println("$a! $b")
    closure()
}
static def testClosure2( Closure closure) {
    closure()
}

static void main(String[] args) {
    testClosure("hello world", 1) {
        println "i am in closure 1"
    }
    testClosure2 {
        println "i am in closure 2"
    }
}


