package com.example.mybrowser

import android.content.Intent
import android.net.Uri
import android.net.UrlQuerySanitizer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            intent = Intent(this, Browsers::class.java)

            var string = "";

            if (!string.startsWith("https://") || !string.startsWith("http://")) {
                string = "http://192.168.43.54:3000/$string"
            }

            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse(string)

            startActivity(intent)
        }
    }
}
