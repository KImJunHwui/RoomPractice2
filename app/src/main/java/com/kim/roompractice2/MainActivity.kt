package com.kim.roompractice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kim.roompractice2.Adapters.RoomAdapter
import com.kim.roompractice2.datas.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<Room>()

    lateinit var mRoomAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    mRoomList.add( Room(8000, "경주시 동천동", 15, "20년된 구축 아파트"))
        mRoomList.add( Room(16000, "안양시 평안동", 8, "270년된 구축 아파트"))
        mRoomList.add( Room(24000, "동탄시 부영로", 0, "20년된 구축 아파트"))
        mRoomList.add( Room(12000, "세종시 도움로", -3, "10년된 신축 아파트"))
        mRoomList.add( Room(50000, "안동시 하회마을", -4, "30년된 전원주택"))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        roomlistView.adapter = mRoomAdapter


    }
}