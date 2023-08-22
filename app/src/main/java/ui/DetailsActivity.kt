package ui

import android.view.LayoutInflater
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ActivityDetailsBinding
import data.DataSource
import data.domain.Match
import util.Constant

class DetailsActivity : BaseActivity<ActivityDetailsBinding>() {
    override val LOG_TAG = this::class.java.simpleName
    override var bindingInflater: (LayoutInflater) -> ActivityDetailsBinding =
        ActivityDetailsBinding::inflate

    override fun setUp() {
        val match: Match? = intent.getSerializableExtra(Constant.Key.MATCH) as Match?
        match?.let { bindMatch(it) }
    }

    override fun addCallBacks() {}

    private fun bindMatch(match: Match) {
        bindingV.apply {
            bindingV.apply {
                homeTeam.text = match.homeTeam
                awayTeam.text = match.awayTeam
                resultHomeTeam.text = match.homTeamResult
                resultAwayTeam.text = match.awayTeamResult
                homeGoals.text = match.homTeamResult
                awayGoals.text = match.awayTeamResult
                homeShots.text = match.homeTeamShots
                awayShots.text = match.awayTeamShots
                homeShotsOnTarget.text = match.homeTeamShotsOnTarget
                awayShotsOnTarget.text = match.awayTeamShotsOnTarget
                homeCorners.text = match.homeTeamCorners
                awayCorners.text = match.awayTeamCorners
                homeYellowCards.text = match.homeTeamYellowCards
                awayYellowCards.text = match.awayTeamYellowCards
                homeRedCards.text = match.homeTeamRedCards
                awayRedCards.text = match.awayTeamRedCards
                homeFreeKicks.text = match.homeTeamFouls
                awayFreeKicks.text = match.awayTeamFouls
                ref.text = match.referee
                date.text = match.matchDate

                when (match.homeTeam) {
                    "Arsenal" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.ARSENAL_URL)
                            .into(homeTeamLogo)
                    }

                    "Man United" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.MAN_UNITED_URL)
                            .into(homeTeamLogo)
                    }

                    "Bournemouth" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.BOURNEMOUTH_URL)
                            .into(homeTeamLogo)
                    }

                    "Fulham" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.FULHAM_URL)
                            .into(homeTeamLogo)
                    }

                    "Huddersfield" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.HUDDERSHFILD_URL)
                            .into(homeTeamLogo)
                    }

                    "Newcastle" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.NEWCASTLE_URL)
                            .into(homeTeamLogo)
                    }

                    "Watford" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.WATFORD_URL)
                            .into(homeTeamLogo)
                    }

                    "Wolves" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.WOLVS_URL)
                            .into(homeTeamLogo)
                    }

                    "Liverpool" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.LIVERPOOL_URL)
                            .into(homeTeamLogo)
                    }

                    "Southampton" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.SOUTHAMPTON_URL)
                            .into(homeTeamLogo)
                    }

                    "Cardiff" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.CARDIFF_URL)
                            .into(homeTeamLogo)
                    }

                    "Chelsea" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.CHELSEA_URL)
                            .into(homeTeamLogo)
                    }

                    "Everton" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.EVERTON_URL)
                            .into(homeTeamLogo)
                    }

                    "Leicester" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.LEICESTER_CITY_URL)
                            .into(homeTeamLogo)
                    }

                    "Tottenham" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.TOTTENHAM_URL)
                            .into(homeTeamLogo)
                    }

                    "West Ham" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.WEST_HAM_URL)
                            .into(homeTeamLogo)
                    }

                    "Brighton" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.BRIGHTON_URL)
                            .into(homeTeamLogo)
                    }

                    "Burnley" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.BURNILY_URL)
                            .into(homeTeamLogo)
                    }

                    "Man City" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.MAN_CITY_URL)
                            .into(homeTeamLogo)
                    }

                    "Crystal Palace" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.CRYSTAL_PALACE_URL)
                            .into(homeTeamLogo)
                    }

                }
                when (match.awayTeam) {
                    "Arsenal" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.ARSENAL_URL)
                            .into(awayTeamLogo)
                    }

                    "Man United" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.MAN_UNITED_URL)
                            .into(awayTeamLogo)
                    }

                    "Bournemouth" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.BOURNEMOUTH_URL)
                            .into(awayTeamLogo)
                    }

                    "Fulham" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.FULHAM_URL)
                            .into(awayTeamLogo)
                    }

                    "Huddersfield" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.HUDDERSHFILD_URL)
                            .into(awayTeamLogo)
                    }

                    "Newcastle" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.NEWCASTLE_URL)
                            .into(awayTeamLogo)
                    }

                    "Watford" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.WATFORD_URL)
                            .into(awayTeamLogo)
                    }

                    "Wolves" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.WOLVS_URL)
                            .into(awayTeamLogo)
                    }

                    "Liverpool" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.LIVERPOOL_URL)
                            .into(awayTeamLogo)
                    }

                    "Southampton" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.SOUTHAMPTON_URL)
                            .into(awayTeamLogo)
                    }

                    "Cardiff" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.CARDIFF_URL)
                            .into(awayTeamLogo)
                    }

                    "Chelsea" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.CHELSEA_URL)
                            .into(awayTeamLogo)
                    }

                    "Everton" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.EVERTON_URL)
                            .into(awayTeamLogo)
                    }

                    "Leicester" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.LEICESTER_CITY_URL)
                            .into(awayTeamLogo)
                    }

                    "Tottenham" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.TOTTENHAM_URL)
                            .into(awayTeamLogo)
                    }

                    "West Ham" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.WEST_HAM_URL)
                            .into(awayTeamLogo)
                    }

                    "Brighton" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.BRIGHTON_URL)
                            .into(awayTeamLogo)
                    }

                    "Burnley" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.BURNILY_URL)
                            .into(awayTeamLogo)
                    }

                    "Man City" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.MAN_CITY_URL)
                            .into(awayTeamLogo)
                    }

                    "Crystal Palace" -> {
                        Glide.with(this@DetailsActivity).load(DataSource.CRYSTAL_PALACE_URL)
                            .into(awayTeamLogo)
                    }

                }

            }
        }
    }
}