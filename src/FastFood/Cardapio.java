package FastFood;

import java.util.ArrayList;

public class Cardapio {
    private final ArrayList<Produto> produtos = new ArrayList<>();
    public void cadastrar(Produto produto) {
        this.addProduto(produto);
    }
    public void editar() {

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

