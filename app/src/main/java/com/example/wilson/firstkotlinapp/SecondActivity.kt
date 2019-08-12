package com.example.wilson.firstkotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

import java.util.Random

class SecondActivity : AppCompatActivity() {
  // NOTE Static variables
  companion object {
    const val TOTAL_COUNT = "total_count"
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_second)
    // render random number from first activity
    showRandomNumber()
  }

  fun returnHome(view: View) {
    val mainActivity = Intent(this, MainActivity::class.java)
    startActivity(mainActivity)
  }

  private fun showRandomNumber() {
    // Get the count from the intent extras
    val count = intent.getIntExtra(TOTAL_COUNT, 0)

    // Generate the random number
    val random = Random()
    var randomInt = 0
    // Add one because the bound is exclusive
    if (count > 0) {
      // Add one because the bound is exclusive
      randomInt = random.nextInt(count + 1)
    }

    // Display the random number.
    findViewById<TextView>(R.id.textview_random).text = Integer.toString(randomInt)

    // Substitute the max value into the string resource
    // for the heading, and update the heading
    findViewById<TextView>(R.id.textview_label).text = getString(R.string.second_activity_heading, count)
  }

}
