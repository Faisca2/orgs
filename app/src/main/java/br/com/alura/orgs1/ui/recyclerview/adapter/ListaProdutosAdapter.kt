package br.com.alura.orgs1.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs1.R
import br.com.alura.orgs1.ui.model.Produto

class ListaProdutosAdapter(
    private val context: Context,
    private val produtos: List<Produto>
) : RecyclerView.Adapter<ListaProdutosAdapter.ViewHolder>() {
    class ViewHolder(view:View) : RecyclerView.ViewHolder(view) {
        fun vincular(produto: Produto) {
            val nome  = itemView.findViewById<TextView>(R.id.nome)
            val descricao  = itemView.findViewById<TextView>(R.id.descricao)
            val valor = itemView.findViewById<TextView>(R.id.valor)
            nome.text = produto.nome
            descricao.text = produto.descricao
            valor.text = produto.valor
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inFlater = LayoutInflater.from(context)
        val view = inFlater.inflate(R.layout.produto_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = produtos[position]
        holder.vincular(produto)
    }

    override fun getItemCount(): Int = produtos.size

}
