package FastFood;
import java.util.Date;

public class Insumo {
    @Override
    public String toString() {
        return "nome=" + nome + " Preço do insumo= R$" + custo;
    }
    private String nome;
    private int id;
    private float custo;
    private Date dataValidade;
    public Insumo (String nome, float custo) {
        this.nome = nome;
        this.custo = custo;
    }
    public void cadastrar() {

    }
    public void editar() {

    }
    public void deletar() {

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getCusto() {
        return custo;
    }
    public void setCusto(float custo) {
        this.custo = custo;
    }
    public Date getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
}