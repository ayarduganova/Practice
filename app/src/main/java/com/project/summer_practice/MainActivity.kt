package com.project.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import timber.log.Timber
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private var clickButton: Button? = null;
    private var textName : EditText? = null;
    private var textHeight : EditText? = null;
    private var textWeight : EditText? = null;
    private var textAge : EditText? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textName = findViewById(R.id.editTextText)
        textHeight = findViewById(R.id.editTextText2)
        textWeight = findViewById(R.id.editTextText3)
        textAge = findViewById(R.id.editTextText4)
        clickButton = findViewById(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        fun dataIsCorrect() : Boolean{
            return (textName?.text.toString().isEmpty() || textHeight?.text.toString().isEmpty() || textWeight?.text.toString().isEmpty() || textAge?.text.toString().isEmpty())
        }
        clickButton?.setOnClickListener {
            if(dataIsCorrect()){
                textView?.text = "Данные введены некорректно."
            }
            else{
                  val name = textName?.text.toString()
                  val height = textHeight?.text.toString().toInt()
                  val weight = textWeight?.text.toString().toDouble()
                  val age = textAge?.text.toString().toInt()
                  val count = (weight).roundToInt() * 10 + height * 6 - age * 5 - name.length * 30
                  if(height > 250 || height <= 0 || weight <= 0 || weight > 250 || age <= 0 || age > 150 ){
                      textView?.text = "Данные введены некорректно."
                  }
                  else{
                      textView?.text = "Ответ: $count"
                  }
            }
        }



    }

}


