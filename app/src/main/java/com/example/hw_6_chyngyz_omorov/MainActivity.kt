package com.example.hw_6_chyngyz_omorov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private var btn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment(MainFragment())
    }
}
        /*btn = findViewById(R.id.btn)
        btn?.setOnClickListener{
           showToast("Click")
    }
    }
}

        /*btn = findViewById(R.id.btn)
        btn?.setOnClickListener {
            showToast("Click")
        }
    }
}*/

        /*val murka = Cat("Murka", 2, "Siam")
        val pushok = Cat("Pushok")
        pushok.type = "Italian"
        Cat(age = 0, type = "Bagam")

        val cars = arrayListOf("Lexus", "Mercedes", "Toyota", "Lamborghini")
        for (car in cars) {
            Log.e("olyalya", "onCreate: " + cars)
        }
        for (i in 0..cars.size){
        }*/