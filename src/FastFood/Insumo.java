package FastFood;

/**
 * A classe insumo ela cadastra,edita e deleta os insumos que estão dentro do estoque.
 * @author Fellipe e Emerson
 * @version 1.0 (out 2021)
 */
public class Insumo {
    public String toString() {
        return  nome;
    }
    private static int size = 0;
    private int id;
    private String nome;
    private float custo;

    public Insumo(String nome, float custo){

        cadastrar(nome, custo);
    }
    public void cadastrar(String nome, float custo) {
        setNome(nome);
        setCusto(custo);
        addSize();
        setId();
    }
    public void editar() {

    }
    public void deletar() {

    }
    private static void addSize(){
        size ++;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return this.id;
    }
    private void setId() {
       this.id = size;
    }
    public float getCusto() {
        return this.custo;
    }
    public void setCusto(float custo) {
        this.custo = custo;
    }
}