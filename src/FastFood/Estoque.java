package FastFood;
import java.util.ArrayList;
import java.util.Map;

public class Estoque {
    private String nome;
    private float custo;
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
    public void subtrairEstoque(int index, int quantidade_vendidos){
        this.quantidade.set(index, (this.quantidade.get(index) - quantidade_vendidos));
    }
    public void deletar(int index) {
        insumo.remove(index);
        quantidade.remove(index);
    }
    public ArrayList<Insumo> getInsumo(){
        return insumo;
    }
    public Insumo getInsumoByIndex(int index) {
        return this.insumo.get(index);
    }
    public void setQuantidade(int index, int quantidade) {
        this.quantidade.set(index, quantidade);
    }
    public void setInsumo(Insumo item) {
        this.insumo.add(item);
    }
    public void addQuantidade(int quantidade) {
        this.quantidade.add(quantidade);
    }
}