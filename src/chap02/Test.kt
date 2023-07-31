package chap02

fun main() {
    var test: Int = 12

    var y: Any? = null

    var x: String? = test as? String

    println(x)
}