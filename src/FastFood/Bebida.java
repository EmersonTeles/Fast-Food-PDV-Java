package FastFood;
import java.util.ArrayList;
import java.util.Arrays;

public class Bebida extends Produto {
    @Override
    public String toString() {
        return getNome();
    }

    public Bebida(String nome, float preco, String tamanho, ArrayList<Insumo> composicao) {
        super();
        cadastrar(nome, preco, tamanho, composicao);
    }
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