package FastFood;
import java.util.ArrayList;
import java.util.Map;
/**
 * Estoque cadastra, edita e deleta os insumos desejados.
 * @author Fellipe e Emerson
 * @version 1.0 (out 2021)
 */
public class Estoque {
    ArrayList<Insumo> insumo = new ArrayList<Insumo>();
    ArrayList<Integer> quantidade = new ArrayList<Integer>();

    public void cadastrar(Insumo item, int quantidade) {
        setInsumo(item);
        addQuantidade(quantidade);
    }
    public void editar(int index, String novo_nome, int novo_custo) {
        getInsumoByIndex(index).setNome(novo_nome);
        getInsumoByIndex(index).setCusto(novo_custo);
    }
    public void deletar(int index) {
        insumo.remove(index);
        quantidade.remove(index);
    }
    public Insumo getInsumoByIndex(int index) {
        return this.insumo.get(index);
    }
    public void decreaseQuantidade(int index) {
        this.quantidade.set(index, quantidade.get(index) - 1 );
    }
    public void addQuantidade(int quantidade) {
        this.quantidade.add(quantidade);
    }
    public ArrayList<Integer> getQuantidade() {
        return quantidade;
    }
    public void setInsumo(Insumo item) {
        this.insumo.add(item);
    }
    public ArrayList<Insumo> getInsumo(){
        return insumo;
    }
}
