package FastFood.View;
import FastFood.*;
import java.util.ArrayList;
/**
 * DefaultValues sao os dados pre-cadastrados.
 * @author Fellipe e Emerson
 * @version 1.0 (out 2021)
 */
public class DefaultValues {
    ArrayList<Insumo> insumos = new ArrayList<>();
    ArrayList<Produto> produtos = new ArrayList<>();
    ArrayList<ArrayList<Insumo>> composicoes = new ArrayList<>();
    ArrayList<Insumo> composicao = new ArrayList<>();
    public DefaultValues(View view){
        insumos.add(new Insumo("Pão Brioche", 0.8f));
        insumos.add(new Insumo("Pão Australiano", 1.2f));
        insumos.add(new Insumo("Carne 150g", 8f));
        insumos.add(new Insumo("Smash burguer 100g", 5f));
        insumos.add(new Insumo("Laranja", 0.7f));
        insumos.add(new Insumo("Goiaba", 0.6f));
        insumos.add(new Insumo("Agua", 1f));
        for(Insumo insumo : insumos){
            view.estoque.cadastrar(insumo, 10);
        }

        composicao.add(insumos.get(0));
        composicao.add(insumos.get(2));
        composicoes.add(composicao);
        produtos.add(new Hamburguer("Big mac", 15, "Pequeno", composicoes.get(0)));

        composicao.clear();
        composicao.add(insumos.get(0));
        composicao.add(insumos.get(3));
        composicoes.add(composicao);
        produtos.add(new Hamburguer("Subway do dia", 12, "Médio", composicoes.get(1)));


        composicao.clear();
        composicao.add(insumos.get(1));
        composicao.add(insumos.get(3));
        composicoes.add(composicao);
        produtos.add(new Hamburguer("Whopper", 25, "Grande", composicoes.get(2)));

        composicao.clear();
        composicao.add(insumos.get(1));
        composicao.add(insumos.get(2));
        composicoes.add(composicao);
        produtos.add(new Hamburguer("Madero Supreme", 35, "Grande", composicoes.get(3)));

        composicao.clear();
        composicao.add(insumos.get(4));
        composicao.add(insumos.get(6));
        composicoes.add(composicao);
        produtos.add(new Bebida("Suco de laranja", 6, "Pequeno", composicoes.get(4)));

        composicao.clear();
        composicao.add(insumos.get(5));
        composicao.add(insumos.get(6));
        composicoes.add(composicao);
        produtos.add(new Bebida("Suco de goiaba", 12, "Médio", composicoes.get(5)));

        for(Produto produto : produtos){
            view.cardapio.cadastrar(produto);
        }
    }
}
