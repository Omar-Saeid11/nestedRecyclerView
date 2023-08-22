package util

import data.domain.Match

class CsvParser {
    fun parse(line: String): Match {
        val tokens = line.split(",")
        return Match(
            matchDate = tokens[Constant.ColumnIndex.DATE],
            homeTeam = tokens[Constant.ColumnIndex.HOME_TEAM],
            awayTeam = tokens[Constant.ColumnIndex.AWAY_TEAM],
            homTeamResult = tokens[Constant.ColumnIndex.HOME_TEAM_RESULT],
            awayTeamResult = tokens[Constant.ColumnIndex.AWAY_TEAM_RESULT],
            homeTeamShots = tokens[Constant.ColumnIndex.HOME_TEAM_SHOTS],
            awayTeamShots = tokens[Constant.ColumnIndex.AWAY_TEAM_SHOTS],
            homeTeamShotsOnTarget = tokens[Constant.ColumnIndex.HOME_TEAM_SHOTS_ON_TARGET],
            awayTeamShotsOnTarget = tokens[Constant.ColumnIndex.AWAY_TEAM_SHOTS_ON_TARGET],
            homeTeamFouls = tokens[Constant.ColumnIndex.HOME_TEAM_FOULS],
            awayTeamFouls = tokens[Constant.ColumnIndex.AWAY_TEAM_FOULS],
            homeTeamCorners = tokens[Constant.ColumnIndex.HOME_TEAM_CORNERS],
            awayTeamCorners = tokens[Constant.ColumnIndex.AWAY_TEAM_CORNERS],
            homeTeamYellowCards = tokens[Constant.ColumnIndex.HOME_TEAM_YELLOW_CARDS],
            awayTeamYellowCards = tokens[Constant.ColumnIndex.AWAY_TEAM_YELLOW_CARDS],
            homeTeamRedCards = tokens[Constant.ColumnIndex.HOME_TEAM_RED_CARDS],
            awayTeamRedCards = tokens[Constant.ColumnIndex.AWAY_TEAM_RED_CARDS],
            referee = tokens[Constant.ColumnIndex.REFEREE]
        )
    }
}