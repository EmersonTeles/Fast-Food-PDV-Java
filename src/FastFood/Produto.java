package FastFood;

public abstract class Produto {
    public static String nome;
    private static float preco;
    private int id;
    private String tamanho;

    public void cadastrar(String nome, float preco, String tamanho) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setTamnho(tamanho);
    }
    public void editar() {
    }
    public void deletar() {
    }
    public static String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    private int getId() {
        return id;
    }
    private void setId(int id) {
        this.id = id;
    }
    public static float getPreco() {
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
}