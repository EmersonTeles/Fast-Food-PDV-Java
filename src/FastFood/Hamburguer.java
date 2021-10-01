package FastFood;
import java.util.Arrays;

public class Hamburguer extends Produto {

    @Override
    public String toString() {
        return getNome();
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
    public Insumo[] getComposicao() {
        return composicao;
    }
    public void setComposicao(Insumo[] composicao) {
        this.composicao = composicao;
    }

}