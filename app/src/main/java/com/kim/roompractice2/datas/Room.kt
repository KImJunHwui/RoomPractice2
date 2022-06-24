package com.kim.roompractice2.datas

import android.icu.text.NumberFormat
import android.os.Build
import androidx.annotation.RequiresApi
import java.io.Serializable
import java.text.DecimalFormat
import java.util.*

class Room(
    val price : Int,
    val address : String,
    val floor : Int,
    val description : String) : Serializable{

    @RequiresApi(Build.VERSION_CODES.N)
    fun getFommattedprice(): String {

        if(this.price >= 10000){

            val uk = this.price / 10000
            val rest = this.price % 10000

            return "${uk}억 ${NumberFormat.getNumberInstance(Locale.KOREA).format(rest)} "
        }


        else{

            return "${NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)}"
        }

    }

    fun getfommattedFloor() : String{

        if(this.floor >= 1){

            return "${this.floor}층"
        }

        else if(this.floor == 0){

            return "반지하"
        }

        else{

            return "지하 ${-this.floor}층"
        }
    }
}