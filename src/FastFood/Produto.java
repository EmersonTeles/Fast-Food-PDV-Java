package FastFood;

import java.util.ArrayList;
/**
 * A classe produto cadastra,edita e deleta os produtos que são criados. Os produtos são em geral Bebidas e Hamburguers.
 * @author Fellipe e Emerson
 * @version 1.0 (out 2021)
 */
public abstract class Produto {
    public String toString() {
        return  nome;
    }
    public String nome;
    private float preco;
    private static int size = 0;
    private int id;
    private String tamanho;
    private ArrayList<Insumo> composicao = new ArrayList<>();

    public void cadastrar(String nome, float preco, String tamanho, ArrayList<Insumo> composicao) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setTamnho(tamanho);
        this.setComposicao(composicao);
        addSize();
        setId();
    }
    public void editar(String nome, float preco, String tamanho, ArrayList<Insumo> composicao) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setTamnho(tamanho);
        this.setComposicao(composicao);
    }
    public void deletar() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    private int getId() {
        return id;
    }
    private static void addSize(){
        size ++;
    }
    private void setId() {
        this.id = size;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamnho(String tamanho) {
        this.tamanho = tamanho;
    }
    public ArrayList<Insumo> getComposicao() {
        return this.composicao;
    }
    public void setComposicao(ArrayList<Insumo> composicao) {
        this.composicao = composicao;
    }
}