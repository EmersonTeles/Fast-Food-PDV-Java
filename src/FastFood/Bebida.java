package FastFood;
import java.util.Arrays;

public class Bebida extends Produto {
    @Override
    public String toString() {
        return getNome();
        //return "Bebida: [nome=" + getNome() + ", preco=" + getPreco()  + ", tamanho=" + getTamanho() + "]";
    }
    private Insumo composicao[];

    public Bebida(String nome, float preco, String tamanho) {
        super();
        this.setNome(nome);
        this.setPreco(preco);
        this.setTamnho(tamanho);
    }
    public void fazerBebida() {
    }
    public Insumo[] getComposicao() {
        return composicao;
    }
    public void setComposicao(Insumo[] composicao) {
        this.composicao = composicao;
    }
}