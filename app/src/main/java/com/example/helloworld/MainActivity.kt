package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Shoe this layout file: activity.main
        setContentView(R.layout.activity_main)

        // Get a reference to button and set up logic to know when user has tapped on button.
        findViewById<Button>(R.id.button).setOnClickListener {

            Log.i("Daniel", "Tapped on button")

            // Get a reference to the text view.
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }

        // Get a reference to button and set up logic to know when user has tapped on button.
        findViewById<Button>(R.id.button2).setOnClickListener {

            Log.i("Daniel", "Tapped on button")

            // Get a reference to the background view.
            findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.purple_200))
        }

        // Get a reference to background and set up logic to know when user has tapped on the background.
        findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.backgroundView).setOnClickListener {

            Log.i("Daniel", "Tapped on background")

            findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.some_pink))
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.black))
        }



        // Get a reference to button and set up logic to know when user has tapped on button.
        findViewById<Button>(R.id.button3).setOnClickListener {

            Log.i("Daniel", "Tapped on button")

            // Get a reference to the background view.
            //findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.purple_200))
            var new_text = findViewById<EditText>(R.id.et_simple).text.toString()
            if (new_text.length != 0) {
                Log.i("Daniel", new_text)
                findViewById<TextView>(R.id.textView).setText(new_text)
            }
            else {
                Log.i("Daniel", "Empty String")
                findViewById<TextView>(R.id.textView).setText("Hello from Daniel!")
            }


        }


    }
}