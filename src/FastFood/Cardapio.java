package FastFood;

import java.util.ArrayList;

public class Cardapio {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<Float> prices;
    public void cadastrar() {
    }
    public void editar() {
    }
    public void deletar() {
    }
    public void setPrices(float price){
        prices.add(price);
    }
    public ArrayList<Float> getPricse() {
        return prices;
    }
    public void setProduto(Produto produto){
        produtos.add(produto);
    }
    public ArrayList<Produto> getProduto() {
        return produtos;
    }


}