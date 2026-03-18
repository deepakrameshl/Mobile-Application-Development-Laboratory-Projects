package com.example.moviedetails

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    lateinit var btnBasic: Button
    lateinit var btnAdditional: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBasic = findViewById(R.id.btnBasic)
        btnAdditional = findViewById(R.id.btnAdditional)

        // Load default fragment
        loadFragment(BasicDetailsFragment())

        btnBasic.setOnClickListener {
            loadFragment(BasicDetailsFragment())
        }

        btnAdditional.setOnClickListener {
            loadFragment(AdditionalDetailsFragment())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}