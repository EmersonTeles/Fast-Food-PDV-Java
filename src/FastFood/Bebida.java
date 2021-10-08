package FastFood;
import java.util.Arrays;

public class Bebida extends Produto {
    @Override
    public String toString() {
        return getNome();
    }

    public Bebida(String nome, float preco, String tamanho) {
        super();
        this.setNome(nome);
        this.setPreco(preco);
        this.setTamnho(tamanho);
    }
    public void fazerBebida() {
    }
}