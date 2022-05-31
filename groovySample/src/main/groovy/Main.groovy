static void main(String[] args) {
    def person = new Person()
    person.name = "zhang san"
    println("Hello world! ${person.name}")
}

class Person {
    def name
}