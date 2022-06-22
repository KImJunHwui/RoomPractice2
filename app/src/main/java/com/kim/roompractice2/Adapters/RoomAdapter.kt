package com.kim.roompractice2.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.kim.roompractice2.R
import com.kim.roompractice2.datas.Room
import org.w3c.dom.Text

class RoomAdapter(
    val mContext : Context,
    val resID : Int,
    val mList : ArrayList<Room>) : ArrayAdapter<Room>(mContext, resID,mList) {

        val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if(tempRow == null){

            tempRow = inf.inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!

        val roomData = mList[position]

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloor = row.findViewById<TextView>(R.id.addressAndFloor)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)

        priceTxt.text = roomData.getFommattedprice()
        addressAndFloor.text = "${roomData.address},${roomData.getfommattedFloor()}"
        descriptionTxt.text = roomData.description

        return row

    }
}