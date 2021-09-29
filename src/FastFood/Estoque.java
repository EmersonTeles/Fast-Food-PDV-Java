package FastFood;
import java.util.ArrayList;

public class Estoque {
    @Override
    public String toString() {
        return "Estoque [item=" + item + ", quantidade=" + quantidade + "]";
    }
    ArrayList<Insumo> item = new ArrayList<Insumo>();
    ArrayList<Integer> quantidade = new ArrayList<>();

    public Estoque(Insumo item, int quantidade) {
        super();
        this.item.add(item);
        this.quantidade.add(quantidade);
    }
    public void cadastrar(Insumo item, int quantidade) {
        this.item.add(item);
        this.quantidade.add(quantidade);
    }
    public void editar() {
    }
    public void deletar() {
    }
    public ArrayList<Insumo> getItem() {
        return item;
    }
    public void setItem(ArrayList<Insumo> item) {
        this.item = item;
    }
    public ArrayList<Integer>  getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(ArrayList<Integer>  quantidade) {
        this.quantidade = quantidade;
    }

}