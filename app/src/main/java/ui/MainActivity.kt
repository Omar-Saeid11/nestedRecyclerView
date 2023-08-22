package ui

import android.content.Intent
import android.view.LayoutInflater
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding
import data.DataManager
import data.domain.Match
import util.Constant
import util.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader


class MainActivity : BaseActivity<ActivityMainBinding>(), OnClick {
    override val LOG_TAG = this::class.java.simpleName
    override var bindingInflater: (LayoutInflater) -> ActivityMainBinding =
        ActivityMainBinding::inflate
    private lateinit var adapter: MatchAdapter
    override fun addCallBacks() {

    }

    override fun setUp() {
        parseFile()
        adapter = MatchAdapter(DataManager.matches, this)
        bindingV.recyclerMatch.adapter = adapter
    }

    private fun parseFile() {
        val inputStream = assets.open(FILE_NAME)
        val buffer = BufferedReader(InputStreamReader(inputStream))
        val parse = CsvParser()
        buffer.forEachLine {
            val currentMatch = parse.parse(it)
            DataManager.addMatch(currentMatch)
        }
    }

    override fun onClickItem(match: Match) {
        val myIntent = Intent(this, DetailsActivity::class.java)
        myIntent.putExtra(Constant.Key.MATCH, match)
        startActivity(myIntent)
    }

    override fun OnClickTeamName(name: String) {
        Toast.makeText(applicationContext, name, Toast.LENGTH_LONG).show()
    }

    override fun onClickDelete(index: Int) {
        DataManager.deleteMatchAtIndex(index)
        adapter.setData(DataManager.matches)
    }

    companion object {
        const val FILE_NAME = "primer.csv"
    }

}
