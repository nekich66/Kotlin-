package problems

import java.util.Scanner

object Task1 {
    fun solve() {
        val list = mutableListOf<Int>()
        val scanner = Scanner(System.`in`)
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt())
        }
        val isMin = scanner.nextBoolean()
        print("Первое решение: ${if (isMin) list.min() else list.max()}")
    }
}