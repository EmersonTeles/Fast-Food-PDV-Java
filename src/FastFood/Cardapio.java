package FastFood;

import java.util.ArrayList;
/**
 * A classe cardapio ela recebe os produtos cadastrados e lista eles na tela.
 * @author Fellipe e Emerson
 * @version 1.0 (out 2021)
 */

public class Cardapio {
    private final ArrayList<Produto> produtos = new ArrayList<>();
    public void cadastrar(Produto produto) {
        this.addProduto(produto);
    }
    public void editar(int index, String nome, float preco, String tamanho, ArrayList<Insumo> composicao) {
        produtos.get(index).editar(nome, preco, tamanho, composicao);
    }
    public void deletar(int index) {
        produtos.remove(index);
    }
    public void addProduto(Produto produto){
        produtos.add(produto);
    }
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}

