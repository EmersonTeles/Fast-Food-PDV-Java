package FastFood;
import java.util.ArrayList;
import java.util.Date;
/**
 * A classe caixa ela recebe a abertura com o valor inicial desejado e o fechamento com o valor final dos pedidos.
 * @author Fellipe e Emerson
 * @version 1.0 (out 2021)
 */
public class Caixa {
    private Date dataInicio;

    private Date dataTermino;
    private float valorAbertura;
    private float valorFechamento;
    private boolean isCaixaOpen;
    ArrayList<Venda> vendas = new ArrayList<>();

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
    public float getValorAbertura() {
        return valorAbertura;
    }
    public void setValorAbertura(float valorAbertura) {
        this.valorAbertura = valorAbertura;
    }
    public float getValorFechamento() {
        this.valorFechamento += valorAbertura;
        return valorFechamento;
    }
    public void setValorFechamento(float valor) {
        this.valorFechamento += valor;
    }
    public ArrayList<Venda> getVendas() {
        return vendas;
    }
    public void setVendas(Venda venda) {
        this.vendas.add(venda);
    }
}
