package chap02

import com.example.edu.Person as User


fun main() {
    val user1 = User("Manuk", 26)
    val user2 = Person("Jisu", "jisu@mail.com")

    println(user1.name)
    println(user1.age)

    println(user2.name)
    println(user2.email)
}

class Person(val name: String, val email: String)