package FastFood;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Ela cria uma nova bebida que é herdada pelo produto.
 * @author Fellipe e Emerson
 * @version 1.0 (out 2021)
 */

public class Bebida extends Produto {
    @Override
    public String toString() {
        return getNome();
    }

    public Bebida(String nome, float preco, String tamanho, ArrayList<Insumo> composicao) {
        super();
        cadastrar(nome, preco, tamanho, composicao);
    }

    /**
     *Fazer bebida ela recebe o insumo que está no estoque para poder ser feita a bebida desejada.
     * @author Fellipe e Emerson
     * @version 1.0 (out 2021)
     */
    public String fazerBebida(Estoque estoque) {
        for(int i = 0; i < getComposicao().size(); i++){
            for(int j = 0; j < estoque.getInsumo().size(); j++){
                if(estoque.getInsumo().get(j) == getComposicao().get(i)){
                    if(estoque.getQuantidade().get(j) > 0){
                        estoque.decreaseQuantidade(j);
                    }else{
                        return "Estoque indiponível.";
                    }
                }
            }
        }
        return "";
    }
}