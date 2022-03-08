package com.pusugames.snackbarcalismasi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.ContentView
import com.google.android.material.snackbar.Snackbar
import com.pusugames.snackbarcalismasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonnormal.setOnClickListener { view ->

            Snackbar.make(view,"Merhaba",Snackbar.LENGTH_SHORT).show()

        }
        binding.buttonGeriDonus.setOnClickListener { x ->
            Snackbar.make(x,"Mesaj Silinsin mi ?",Snackbar.LENGTH_SHORT)
                .setAction("Evet"){ y->
                    Snackbar.make(y,"Mesaj Silindi",Snackbar.LENGTH_SHORT).show()

                }
                .show()


        }
        binding.buttonozel.setOnClickListener { z ->

            val sb = Snackbar.make(z,"İnternet Bağlantısı Yok ",Snackbar.LENGTH_LONG)

            sb.setAction("Tekrar Dene"){

            }
            sb.setActionTextColor(Color.RED)
            sb.setTextColor(Color.CYAN)
            sb.setBackgroundTint(Color.WHITE)
            sb.show()



        }
    }
}