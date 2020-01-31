package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    lateinit var diceImageTwo: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        diceImageTwo = findViewById(R.id.dice_image_two)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}

//        val countUpButton: Button = findViewById(R.id.countUp_button)
//        countUpButton.setOnClickListener{countUp()}
//
//        val resetButton: Button = findViewById(R.id.reset_button)
//        resetButton.setOnClickListener{reset()}
    }

    private fun rollDice(){
        diceImage.setImageResource(getRandomDiceImage())
        diceImageTwo.setImageResource(getRandomDiceImage())
    }
    private fun getRandomDiceImage() : Int {
        return when ((1..6).random()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
//    private fun countUp(){
//        val resultText: TextView = findViewById(R.id.result_text)
//
//        if (resultText.text.toString().equals("Hello World!")) {
//            resultText.text = "1"
//        }else{
//            var valor: Int = resultText.text.toString().toInt()
//            if(valor in 1..5 ){
//                valor ++
//
//            }
//            resultText.text = valor.toString()
//        }
//    }
//    private fun reset(){
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = "0"
//    }
}
