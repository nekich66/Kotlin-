package problems

import java.util.Scanner


val scan = Scanner(System.`in`)


fun main(args: Array<String>) {
    val cat = Cat(scan.next())
    val num = scan.nextInt()


    repeat(num) {
        cat.play()
    }
}
