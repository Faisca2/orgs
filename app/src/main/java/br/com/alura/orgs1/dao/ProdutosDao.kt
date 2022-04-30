package br.com.alura.orgs1.dao

import br.com.alura.orgs1.ui.model.Produto

class ProdutosDao {
    fun adiciona(produto: Produto){
        produtos.add(produto)
    }
    fun buscaTodos() : List<Produto>{
        return produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>()
    }

}