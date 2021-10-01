package FastFood;
import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
    @Override
    public String toString() {
        return item;
    }
    private static String nome;
    private static float custo;
    ArrayList<Insumo> item = new ArrayList<Insumo>();
    ArrayList<Integer> quantidade = new ArrayList<Integer>();
    private Scanner input = new Scanner(System.in);

    public static void cadastrar(Insumo item, int quantidade) {
        nome= nome;
        custo= custo;
        //.add(item);
        //quantidade.add(quantidade);
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
    public ArrayList<Integer> getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(ArrayList<Integer> quantidade) {
        this.quantidade = quantidade;
    }

}