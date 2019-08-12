package com.example.wilson.firstkotlinapp

import android.content.Intent
import android.os.Bundle
//import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    setSupportActionBar(toolbar)
  }
  fun toastMe(view: View) {
    // val myToast = Toast.makeText(this, message, duration);
    val myToast = Toast.makeText(this@MainActivity, "Hello Toast!", Toast.LENGTH_SHORT)
    myToast.show()
  }

  fun countMe(view: View) {
    // Get the textView
    val showCountTextView = findViewById<TextView>(R.id.counterView)

    // Get the value of the textView
    val countString = showCountTextView.text.toString()
    var count: Int = Integer.parseInt(countString)
    count++

    // Update text view with the value
    showCountTextView.text = count.toString()
  }

  fun randomMe (view: View) {
    // Create an Intent to start the second activity
    val randomIntent = Intent(this, SecondActivity::class.java)
    // select the counterView TextView in activity_main
    val showCountTextView = findViewById<TextView>(R.id.counterView)
    // Get the current value of the text view.
    val countString = showCountTextView.text.toString()

    // Convert the count to an int
    val count = Integer.parseInt(countString)

    // Add the count to the extras for the Intent.
    randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

    // Start the new activity.
    startActivity(randomIntent)
  }

}
