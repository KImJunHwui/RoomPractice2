package com.kim.roompractice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kim.roompractice2.datas.Room
import kotlinx.android.synthetic.main.activity_room_view_detail.*

class RoomViewDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_view_detail)

        val roomData = intent.getSerializableExtra("room") as Room
        floorTxt.text = roomData.getfommattedFloor()
        addressTxt.text = roomData.address
        priceTxt.text = roomData.getFommattedprice()
        descriptionTxt.text = roomData.description

    }
}