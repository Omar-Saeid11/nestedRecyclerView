package ui

import androidx.recyclerview.widget.DiffUtil
import data.domain.Match

class MatchDiffUtil(private val mOldList: List<Match>, private val mNewList: List<Match>) :
    DiffUtil.Callback() {
    override fun getOldListSize() = mOldList.size

    override fun getNewListSize() = mNewList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return (
                mOldList[oldItemPosition].homeTeam == mNewList[newItemPosition].homeTeam
                        && mOldList[oldItemPosition].awayTeam == mNewList[newItemPosition].awayTeam
                )
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return true
    }
}