package FastFood;
import java.util.ArrayList;
import java.util.Date;

public class Caixa {
    private Date dataInicio;
    private Date dataTermino;
    private Venda vendas[];
    private float valorAbertura;
    private float valorFechamento;
    private boolean isCaixaOpen;
    ArrayList<Venda> Vendas = new ArrayList<>();

    public Caixa(){
        isCaixaOpen = false;
    }
    public void toggleIsCaixaOpen(){
        this.isCaixaOpen = !this.isCaixaOpen;
    }
    public boolean getIsCaixaOpen(){
        return isCaixaOpen;
    }
    public Date getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    public Date getDataTermino() {
        return dataTermino;
    }
    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }
    public Venda[] getVendas() {
        return vendas;
    }
    public void setVendas(Venda[] vendas) {
        this.vendas = vendas;
    }
    public float getValorAbertura() {
        return valorAbertura;
    }
    public void setValorAbertura(float valorAbertura) {
        this.valorAbertura = valorAbertura;
    }
    public float getValorFechamento() {
        return valorFechamento;
    }
    public void setValorFechamento(float valorFechamento) {
        this.valorFechamento = valorFechamento;
    }
    public ArrayList<Venda> getItensVendidos() {
        return Vendas;
    }
    public void setItensVendidos(ArrayList<Venda> vendas) {
        this.vendas = vendas.toArray(new Venda[0]);
    }

}
