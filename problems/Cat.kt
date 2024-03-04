package problems

class Cat(private val name: String?) {
    init {
        println("Создан новый объект типа Cat с именем $name")
    }

    fun play() = println("Ура со мной поиграли!$name")
}
