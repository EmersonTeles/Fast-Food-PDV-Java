package FastFood;
import java.util.Scanner;

public class Insumo {
    private static int size = 0;
    private static int id;
    public String toString() {
        return "nome=" + nome + " Preço do insumo= R$" + custo;
    }
    private String nome;
    private float custo;
    private Scanner input = new Scanner(System.in);

    public Insumo (String nome, float custo) {
    }
    public static Insumo cadastrar(String nome, float custo) {
        setNome(nome);
        setCusto(custo);
        addSize();
        setId();
        return null;
    }
    public void editar() {

    }
    public void deletar() {

    }
    public static void addSize(){
        size++;
    }
    public String getNome() {
        return nome;
    }
    public static void setNome(String nome) {
        nome = nome;
    }
    public int getId() {
        return id;
    }
    public static void setId() {
       id = size;
    }
    public float getCusto() {
        return custo;
    }
    public static void setCusto(float custo) {
        custo = custo;
    }
    /*public Date getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }*/
}