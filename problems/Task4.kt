package problems


object Task4 {
    fun solve(condition: String){
        val a = "Hello"
        val words = condition.split("")
        print(words.joinToString(prefix = "[\"", postfix = "\"]", separator = "\", \""))
    }
}