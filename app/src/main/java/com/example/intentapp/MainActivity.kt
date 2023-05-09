package com.example.intentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveeActivitywithData: Button =  findViewById(R.id.btn_move_activity_data)
        btnMoveeActivitywithData.setOnClickListener(this)

        val btnMoveeActivitywithObject: Button =  findViewById(R.id.btn_move_activity_with_object)
        btnMoveeActivitywithObject.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
           R.id.btn_move_activity -> {
               val moveIntent = Intent (this,MoveActivity::class.java)
               startActivity(moveIntent)
           }

            R.id.btn_move_activity_data -> {
                val moveIntentWithData = Intent(this,MoveActivityWithData::class.java)
                moveIntentWithData.putExtra(MoveActivityWithData.YOUR_NAME,"Mulifatkhul Rachiim")
                moveIntentWithData.putExtra(MoveActivityWithData.YOUR_CLASS,"TI.20.B1")
                moveIntentWithData.putExtra(MoveActivityWithData.YOUR_AGE,"23")
                startActivity(moveIntentWithData)
            }

            R.id.btn_move_activity_with_object -> {
                val objectmhs = Mahasiswa(
                    "Mulifatkhul Rachiim",
                    "TI.20.B1",
                    23,
                    "mulifatkhul.rach@gmail.com",
                    "Purbalingga"
                        )
                val moveWithObject = Intent(this, MoveActivityWithObject::class.java)
                 moveWithObject.putExtra(MoveActivityWithObject.EXTRA_MAHASISWA,objectmhs)
                 startActivity(moveWithObject)

            }


        }
    }
}