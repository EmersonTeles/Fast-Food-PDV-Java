package FastFood;

import FastFood.View.View;

public class main {

    static Bebida b1;
    static Hamburguer h1;
    static Cardapio C1;
    static Insumo I1;
    static Insumo I2;
    static Estoque E1;
    static FastFood.View.View View;
    public static void main(String[] args) {

        h1 = new Hamburguer("x-bacon","bomba", 10, 300);
        b1 = new Bebida("Suco de Laranja", "suco", 5, 100);
        I1 = new Insumo("Laranja", 2);
        I2 = new Insumo("Pão", 1);
        E1 = new Estoque(I1, 5);
        E1.cadastrar(I2, 5);
        new View();

        System.out.println("--------------");
        System.out.println(h1.toString());
        System.out.println("--------------");
        System.out.println(b1.toString());
        System.out.println("--------------");
        System.out.println(I1.toString());
        System.out.println("--------------");
        System.out.println(I2.toString());
        System.out.println("--------------");
        System.out.println(E1.toString());
    }

}