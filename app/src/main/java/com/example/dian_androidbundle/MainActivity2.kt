package com.example.dian_androidbundle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity2 : AppCompatActivity() {


    private lateinit var namaView: TextView
    private lateinit var kelasView: TextView
    private lateinit var nisView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btn2: Button = findViewById(R.id.btn2)

        btn2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            namaView = findViewById(R.id.namaView)
            kelasView = findViewById(R.id.kelasView)
            nisView = findViewById(R.id.nisView)

            val extras = intent.extras
            namaView.text = extras?.getString("nama")
            kelasView.text = extras?.getString("kelas")
            nisView.text = extras?.getString("nis")

        }
    }
}
