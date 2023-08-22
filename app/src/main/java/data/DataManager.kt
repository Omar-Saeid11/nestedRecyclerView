package data

import data.domain.Match

object DataManager {
    private val matchesList = mutableListOf<Match>()
    val matches: List<Match>
        get() = matchesList.toList()
    private var matchIndex = 1
    fun addMatch(match: Match) = matchesList.add(match)
    fun addMatchAtIndex(match: Match, index: Int) {
        matchesList.add(index, match)
    }

    fun deleteMatchAtIndex(index: Int) {
        matchesList.removeAt(index)
    }

    fun getCurrentMatch(): Match = matchesList[matchIndex]
    fun getNextMatch(): Match {
        matchIndex++
        if (matchIndex == matchesList.size)
            matchIndex = 1
        return matchesList[matchIndex]
    }

    fun getPrevMatch(): Match {
        matchIndex--
        if (matchIndex == 0)
            matchIndex = matchesList.size - 1
        return matchesList[matchIndex]
    }
}