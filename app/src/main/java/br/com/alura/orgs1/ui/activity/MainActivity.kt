package br.com.alura.orgs1.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs1.R
import br.com.alura.orgs1.ui.model.Produto
import br.com.alura.orgs1.ui.recyclerview.adapter.ListaProdutosAdapter

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activety_main)
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.setText("Cesta de frutas")
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.setText("Laranja, Maçã, Uva")
//        val valor     = findViewById<TextView>(R.id.valor)
//        valor.setText("19.90")
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.adapter = ListaProdutosAdapter(
            context = this, produtos = listOf(
                Produto(
                    nome = "teste",
                    descricao = "teste desc",
                    valor = "19.99"
                ),
                Produto(
                    nome = "teste_01",
                    descricao = "teste_01 desc",
                    valor = "29.99"
                ),
                Produto(
                    nome = "teste_02",
                    descricao = "teste_02 desc",
                    valor = "39.99"
                ),
            )
        )
        //recyclerView.layoutManager = LinearLayoutManager(this)
    }
}