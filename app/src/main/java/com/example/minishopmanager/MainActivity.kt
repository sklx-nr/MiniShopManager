package com.example.minishopmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCatalogue = findViewById<Button>(R.id.btncatalog)

        btnCatalogue.setOnClickListener {
            val intent = Intent(this, CatalogueActivity::class.java)
            startActivity(intent)
        }
    }
}
