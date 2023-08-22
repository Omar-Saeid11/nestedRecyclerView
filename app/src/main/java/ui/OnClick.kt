package ui

import data.domain.Match

interface OnClick {
    fun onClickItem(match: Match)
    fun OnClickTeamName(name:String)
    fun onClickDelete(index:Int)
}