package br.com.alura.orgs1.ui.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs1.R
import br.com.alura.orgs1.ui.model.Produto
import br.com.alura.orgs1.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activety_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        ListaProdutosAdapter(
            context = this, produtos = listOf(
                Produto(
                    nome = "teste",
                    descricao = "teste desc",
                    valor = "19.99"
//                    valor = BigDecimal("19.99")
                ),
                Produto(
                    nome = "teste_01",
                    descricao = "teste_01 desc",
                    valor = "29.99"
//                    valor = BigDecimal("29.99")
                ),
                Produto(
                    nome = "teste_02",
                    descricao = "teste_02 desc",
                    valor = "39.99"
//                    valor = BigDecimal("39.99")
                ),
            )
        ).also { recyclerView.adapter = it }
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            val intent = Intent(this, FormularioProdutoActivity::class.java)
            startActivity(intent)
        }
    }
}