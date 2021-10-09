package FastFood;
import java.util.*;
/**
 * A classe hamburguer cadastra,edita e deleta os Hamburgueres criados.
 * @author Fellipe e Emerson
 * @version 1.0 (out 2021)
 */
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
    /**
     * O método fazerHamburguer ele recebe os insumos do estoque o hamburguer e criado de acordo com os itens selecionados no estoque.
     * @author Fellipe e Emerson
     * @version 1.0 (out 2021)
     */
    public String fazerHamburguer(Estoque estoque) {
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