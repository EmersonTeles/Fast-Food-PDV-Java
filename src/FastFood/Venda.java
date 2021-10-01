package FastFood;

import java.util.ArrayList;

public class Venda {
    private ArrayList<Produto> itensVendidos;
    private float valorFinal;
    private String formaDePagamento;
    private float desconto;
    private String Cliente;
    public Venda(){
        this.desconto = 0;
    }
    public void adicionarProduto(Produto produto) {

    }
    public void retirarProduto() {

    }
    public void adicionarCliente(String cliente) {
        setCliente(cliente);
    }
    public void desconto(int desconto) {
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