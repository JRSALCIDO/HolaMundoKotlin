package com.example.holamundo

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    private lateinit var btnSaludar: Button
    private lateinit var txtNombre: EditText
    private lateinit var lblSaludo: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)



        btnSaludar = findViewById(R.id.btnSaludo)
        txtNombre = findViewById(R.id.txtSaludo2)
        lblSaludo = findViewById(R.id.lblSaludo)

        btnSaludar.setOnClickListener {
            if (txtNombre.text.toString().isEmpty()) {
                Toast.makeText(this@MainActivity, "Favor de ingresar un nombre", Toast.LENGTH_SHORT).show()
            } else {
                val txtSaludar = txtNombre.text.toString()
                lblSaludo.text = "Hola $txtSaludar Como Estas ? <3"
            }
        }
    }
}
