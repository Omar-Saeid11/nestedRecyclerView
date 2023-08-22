package ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemMatchBinding
import com.example.myapplication.databinding.ItemMatchesHeaderBinding
import data.domain.Match

class MatchAdapter(private var list: List<Match>, private val onClick: OnClick) :
    RecyclerView.Adapter<MatchAdapter.BaseViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        when (viewType) {
            VIEW_TYPE_HEADER -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_matches_header, parent, false)
                return HeaderMatchesItem(view)
            }

            VIEW_TYPE_MATCH -> {
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.item_match, parent, false)
                return MatchViewHolder(view)
            }
        }
        return super.createViewHolder(parent, viewType)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        val currentMatch = list[position]
        when (holder) {
            is MatchViewHolder -> {
                holder.binding.apply {
                    homeTeamName.text = currentMatch.homeTeam
                    awayTeamName.text = currentMatch.awayTeam
                    homeTeamGoals.text = currentMatch.homTeamResult
                    awayTeamGoals.text = currentMatch.awayTeamResult
                    date.text = currentMatch.matchDate

                    root.setOnClickListener {
                        onClick.onClickItem(currentMatch)
                    }
                }
            }

            is HeaderMatchesItem -> {

            }
        }

    }

    fun setData(newList: List<Match>) {
        list = newList
        notifyDataSetChanged()
//        val diffResult=DiffUtil.calculateDiff(MatchDiffUtil(list,newList))
//        list=newList
//        diffResult.dispatchUpdatesTo(this)
    }

    override fun getItemCount() = list.size

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) {
            VIEW_TYPE_HEADER
        } else {
            VIEW_TYPE_MATCH
        }
    }

    abstract class BaseViewHolder(viewItem: View) : RecyclerView.ViewHolder(viewItem)
    class MatchViewHolder(viewItem: View) : BaseViewHolder(viewItem) {
        val binding = ItemMatchBinding.bind(viewItem)
    }

    class HeaderMatchesItem(viewItem: View) : BaseViewHolder(viewItem) {
        val binding = ItemMatchesHeaderBinding.bind(viewItem)
    }

    companion object {
        const val VIEW_TYPE_HEADER = 11
        const val VIEW_TYPE_MATCH = 12
    }
}