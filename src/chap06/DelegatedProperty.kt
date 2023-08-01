package chap06

import kotlin.properties.Delegates

class User1{
    var name: String by Delegates.observable("NONAME") {
        prop, old, new ->
        println("$old -> $new")
    }
}

fun main() {
    val user = User1()
    user.name = "Kildong"
    user.name = "Dooly"
}