package problems

import java.util.Scanner

object Task2 {
    val scanner = Scanner(System.`in`)
    val parts =
        scanner.nextLine()
            .split("")
            .map { it.toIntOrNull () ?: 0 }
    val tariff =
        Tariff(
            eatCount = parts[0],
            lunchCost = parts[1],
            dayCost = parts[2],
            transfarCost = parts[3],
            dayCount = parts[4],
            sale = parts[5]
        )
    println( tariff.getSum())

}

class Tariff(
    private val eatCount: Int,
    private val lunchCost: Int,
    private val dayCost: Int,
    private val transfarCost: Int,
    private val dayCount: Int,
    private val sale: Int
) {
    fun getSum(): Int {
        (eatCount * lunchCost + dayCost) * dayCost + transfarCost * 2 - sale
    }
