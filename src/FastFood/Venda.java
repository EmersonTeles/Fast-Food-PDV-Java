package FastFood;

import java.util.ArrayList;

public class Venda {
    private ArrayList<Produto> itensVendidos = new ArrayList<>();
    private float valorFinal;
    private float desconto;
    private String Cliente;
    public Venda(){
        this.desconto = 0;
    }


    public void adicionarProduto(Produto produto) {
        this.itensVendidos.add(produto);
    }
    public void retirarProduto(int index) {
        this.itensVendidos.remove(index);
    }
    public void adicionarCliente(String cliente) {
        setCliente(cliente);
    }
    public void desconto(float desconto) {
        setDesconto(desconto);
    }

    public float getvalorFinal() {
        setvalorFinal(0);
        for( Produto produto : itensVendidos){
            setvalorFinal(this.valorFinal + produto.getPreco());
        }
        setvalorFinal(this.valorFinal- (this.valorFinal  * (getDesconto()/100)));
        return this.valorFinal;
    }
    public void setvalorFinal(float valorFinal) {
        this.valorFinal = valorFinal;
    }
    public float getDesconto() {
        return desconto;
    }
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
    public String getCliente() {
        return Cliente;
    }
    public void setCliente(String cliente) {
        Cliente = cliente;
    }

}