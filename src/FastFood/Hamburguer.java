package FastFood;
import java.util.ArrayList;
import java.util.Arrays;

public class Hamburguer extends Produto {

    @Override
    public String toString() {
        return getNome();
   }

    public Hamburguer(String nome, float preco, String tamanho, ArrayList<Insumo> composicao) {
        super();
        cadastrar(nome, preco, tamanho, composicao);
    }
    public void editar(){
    }
    public void fazerHamburguer(int quantidade) {
    }
}