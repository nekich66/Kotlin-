import model.Position
import parser.CsvParser

fun main(args: Array<String>) {
    val players = CsvParser.parse("src/main/resources/fakePlayers.csv")
//    print(players)
    val defender = players.find { it.position == Position.DEFENDER }
    print (defender?.name)

}