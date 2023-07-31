package chap03

open class A{
    open fun f() = println("A Class f()")
    fun a() = println("A Class a()")
}

interface B{
    fun f() = println("B Interface f()")
    fun b() = println("B Interface b()")
}

class C : A(), B{
    override fun f() {
        TODO("Not yet implemented")
    }

}