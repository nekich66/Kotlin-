package parser

import model.Player
import model.Position
import model.Team
import java.io.File
import java.util.Scanner

object CsvParser {

    fun parse(path: String): List<Player> {
        val result = mutableListOf<Player>()
        val file = File(path)
        val scanner = Scanner(file)

        scanner.nextLine()
        while (scanner.hasNextLine()) {
            val playerString = scanner.nextLine()
            val playerParts = playerString.split(";")
            result.add(
                Player(
                    name = playerParts[0],
                    team = Team(playerParts[1],playerParts[2]),
                    position = Position.getByValue(playerParts[3]),
                    nationality = playerParts[4],
                    agency = playerParts[5],
                    transfercost = playerParts[6].toIntOrNull().orZero(),
                    participationCount = playerParts[7].toIntOrNull().orZero(),
                    goalsCount = playerParts[8].toIntOrNull().orZero(),
                    assistsCount = playerParts[9].toIntOrNull().orZero(),
                    yellowCardsCount = playerParts[10].toIntOrNull().orZero(),
                    redCardsCount = playerParts[11].toIntOrNull().orZero(),
                )

                )
            )
        }


    }

    private fun Int?.orZero(): Int = this ?: Int.MIN_VALUE
}