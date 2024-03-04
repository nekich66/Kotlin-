package problems

object Task3 {
    fun solve(condition: String){
        val parts = condition.split("".toRegex(), 2)
        val line = parts.getOrNull(0).orEmpty()
        val spy = parts.getOrNull(1).orEmpty()

        val resultLine = line.replace(spy, "_")
        val spyCount = resultLine.count{ it == '_'}
        print("$resultLine $spyCount")
    }
}