package br.com.digitalhouse.aula.java.classes;

import java.util.HashMap;
import java.util.Map;

public class Estoque {

    private Map<Integer, Produto> estoque = new HashMap<>();

    public void adicionarEstoque(Integer idEstoque, Produto produto){
        try{
            this.estoque.put(idEstoque, produto);
        }catch (NullPointerException e){
            System.out.println("Listagem Vazia");
        }
    }

    public Produto buscaProduto(Integer idProduto) throws estoqueProdutoNaoEncontradoException {
            Produto produtoBuscado = this.estoque.get(idProduto);

            if (produtoBuscado == null){
                throw new estoqueProdutoNaoEncontradoException();
            }
            return produtoBuscado;
    }

    public void removerEstoque(Integer idEstoque){
        this.estoque.remove(idEstoque);
    }


    public Map<Integer, Produto> getEstoque() {
        return estoque;
    }
}
