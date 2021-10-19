package com.creativeday.diceroller

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn: Button = findViewById(R.id.roll_button)
        rollBtn.setOnClickListener(View.OnClickListener {
            diceRoll()
        })
    }

    private fun diceRoll() {
        val diceImg: ImageView = findViewById(R.id.diceImage)
        val diceDrawable = when (Random.nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImg.setImageDrawable(getDrawable(diceDrawable))
    }
}