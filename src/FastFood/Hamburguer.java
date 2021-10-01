package FastFood;
import java.util.Arrays;

public class Hamburguer extends Produto {

    @Override
    public String toString() {
        return "Hamburguer [nome=" + getNome() + ", preco=" + getPreco() + "peso=" + peso + "]";
    }
    private Insumo composicao[];
    public Hamburguer(String nome, float preco, String tamanho) {
        super();
        this.setNome(nome);
        this.setPreco(preco);
        this.setTamnho(tamanho);
    }
    public void FazerHamburguer() {

    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public Insumo[] getComposicao() {
        return composicao;
    }
    public void setComposicao(Insumo[] composicao) {
        this.composicao = composicao;
    }

}