package FastFood;

import java.util.ArrayList;

public class Cardapio {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private String categoria[];
    public void cadastrar() {
    }
    public void editar() {
    }
    public void deletar() {
    }
    public ArrayList<Produto> getProduto() {
        return produtos;
    }
    public String[] getCategoria() {
        return categoria;
    }
    public void setCategoria(String[] categoria) {
        this.categoria = categoria;
    }


}