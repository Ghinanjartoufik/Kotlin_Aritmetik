package com.example.uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun tambah(view: View){
        val angka1 =findViewById<EditText>(R.id.txtInput1)
        val angka2 =findViewById<EditText>(R.id.txtInput2)
        val angkaHasil =findViewById<TextView>(R.id.txtHasil)

        val jumlah = angka1.text.toString().toDouble() + angka2.text.toString().toDouble()
        angkaHasil.text=jumlah.toString()
    }
    fun kali(view: View){
        val angka1 =findViewById<EditText>(R.id.txtInput1)
        val angka2 =findViewById<EditText>(R.id.txtInput2)
        val angkaHasil =findViewById<TextView>(R.id.txtHasil)

        val jumlah = angka1.text.toString().toDouble() * angka2.text.toString().toDouble()
        angkaHasil.text=jumlah.toString()
    }
}