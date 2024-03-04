package resolver

import model.Player
import model.Position
import model.Team

class Resolver(private val players: List<Player>) : IResolver {
    override fun getCountWithoutAgency(): Int =
        players.count { it.agency.isEmpty() }


    override fun getBestScorerDefender(): Pair<String, Int> =
        players
            .filter { it.position == Position.DEFENDER }
            .maxBy { it.goalsCount }
            .let { player -> player.name to player.goalsCount }


    override fun getTheExpensiveGermanPlayerPosition() =
        players
            .filter { it.nationality == "Germany" }
            .maxBy { it.transfercost }
            .let {
                when (it.position) {
                    Position.GOALKEEPER -> "Вратарь"
                    Position.DEFENDER -> "Защитник"
                    Position.MIDFIELD -> "Полузащитник"
                    Position.FORWARD -> "Нападающий"
                    Position.OTHER -> ""
                }
            }

    override fun getTheRudestTeam(): Team =
        players
            .groupBy { it.team }
            .maxBy { (_, players) -> players.sumOf { it.redCardsCount } / players.size }
            .key

}

}