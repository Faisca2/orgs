package br.com.alura.orgs1

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activety_main)
        val nome = findViewById<TextView>(R.id.textView)
        val descricao = findViewById<TextView>(R.id.descricao)
        val valor     = findViewById<TextView>(R.id.valor)
        nome.setText("Cesta de frutas")
        descricao.setText("Laranja, Maçã, Uva")
        valor.setText("19.90")
    }
}