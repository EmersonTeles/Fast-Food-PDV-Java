package FastFood;
import java.util.ArrayList;
import java.util.Date;

public class Caixa {
    private Date dataInicio;
    private Date dataTermino;
    private int horarioInicio;
    private int horarioTermino;
    private Venda vendas[];
    private float valorAbertura;
    private float valorFechamento;
    ArrayList<String> itensVendidos = new ArrayList<String>();


    public void abrirCaixa() {

    }
    public void fecharCaixa() {

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
    public int getHorarioInicio() {
        return horarioInicio;
    }
    public void setHorarioInicio(int horarioInicio) {
        this.horarioInicio = horarioInicio;
    }
    public int getHorarioTermino() {
        return horarioTermino;
    }
    public void setHorarioTermino(int horarioTermino) {
        this.horarioTermino = horarioTermino;
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
    public ArrayList<String> getItensVendidos() {
        return itensVendidos;
    }
    public void setItensVendidos(ArrayList<String> itensVendidos) {
        this.itensVendidos = itensVendidos;
    }

}
