package chap07

open class Animal(val name: String)

class Dog(name: String, override var category: String) : Animal(name), Pet {
    override var species: String = "dog"

    override fun  feeding() {
        println("Feed the dog a bone")
    }
}

class Cat(name: String, override var category: String) : Animal(name), Pet {
    override var species: String = "cat"

    override fun  feeding() {
        println("Feed the cat a tuna can!")
    }
}

class Master {
//    fun playWithPet(dog: Dog) {
//        println("Enjoy with my dog.")
//    }
//    fun playWithPet(cat: Cat) {
//        println("Enjoy with my cat.")
//    }
    fun playWithPet(pet: Pet) {
        println("Enjoy with my ${pet.species}.")
    }
}

interface Pet{
    var category: String
    val msgTags: String
        get() = "I'm your lovely pet"

    var species: String
    fun feeding()
    fun patting() {
        println("Keep patting!")
    }
}

fun main() {
    val master = Master()
    val dog =  Dog("Toto", "Samll")
    val cat = Cat("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}

