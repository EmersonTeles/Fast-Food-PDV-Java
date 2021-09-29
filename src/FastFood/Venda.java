package FastFood;

public class Venda {
    private Produto itensVendidos[];
    private float price;
    private String formaDePagamento;
    private int desconto;
    private String Cliente;

    public void adicionarProduto() {
    }
    public void retirarProduto() {
    }
    public void adicionarCliente() {
    }
    public void desconto() {
    }
    public void finalizarVenda() {
    }
    public Produto[] getItensVendidos() {
        return itensVendidos;
    }
    public void setItensVendidos(Produto[] itensVendidos) {
        this.itensVendidos = itensVendidos;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public String getFormaDePagamento() {
        return formaDePagamento;
    }
    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
    public int getDesconto() {
        return desconto;
    }
    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
    public String getCliente() {
        return Cliente;
    }
    public void setCliente(String cliente) {
        Cliente = cliente;
    }

}