package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val feedButton = findViewById<Button>(R.id.feedButton)
        val cleanButton = findViewById<Button>(R.id.cleanButton)
        val playButton = findViewById<Button>(R.id.playButton)
        var hungerView = findViewById<TextView>(R.id.hungerview)
        var cleanView = findViewById<TextView>(R.id.cleanlinessview)
        var moodView = findViewById<TextView>(R.id.moodview)
        var imageView2 = findViewById<ImageView>(R.id.imageView2)



            feedButton.setOnClickListener {
                imageView2.setImageDrawable(getDrawable(R.drawable.dogeating))



                cleanButton.setOnClickListener {
                    imageView2.setImageDrawable(getDrawable(R.drawable.dogwashing))

                    playButton.setOnClickListener {
                        imageView2.setImageDrawable(getDrawable(R.drawable.dogplaying))

                    }
                }
                }

                }
            }





