package model

enum class Position {
    MIDFIELD,
    DEFENDER,
    FORWARD,
    GOALKEEPER,
    OTHER;
    companion object {
        fun getByValue(position: String) = entries.find { it.name == position } ?: OTHER
    }


}