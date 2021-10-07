package FastFood;

import java.util.ArrayList;

public class Venda {
    private ArrayList<Produto> itensVendidos = new ArrayList<>();
    private float valorFinal;
    private String formaDePagamento;
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
    public void finalizarVenda() {
    }

    public ArrayList<Produto> getItensVendidos() {
        return itensVendidos;
    }
    public void setItensVendidos(ArrayList<Produto> itensVendidos) {
        this.itensVendidos = itensVendidos;
    }
    public float getvalorFinal() {
        return valorFinal;
    }
    public void setvalorFinal(float valorFinal) {
        this.valorFinal = valorFinal;
    }
    public String getFormaDePagamento() {
        return formaDePagamento;
    }
    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
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