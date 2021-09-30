package FastFood.View;
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import javax.swing.event.*;
public class View  {
    JFrame j= new JFrame();
    JButton insumo= new JButton("Insumo");
    JButton bebida= new JButton("Bebida");
    JButton Caixa= new JButton("Caixa");
    JButton Cardapio= new JButton("Cardápio");
    JButton Estoque= new JButton("Estoque");
    JLabel Tema = new JLabel("Menu");
    JButton Hamburguer= new JButton("Hamburguer");
    JButton produto= new JButton("Produto");
    JButton venda= new JButton("Venda");


    public View (){
        j.setLayout(null);
        j.add(Hamburguer);
        j.add(insumo);
        j.add(Caixa);
        j.add(Tema);
        j.add(bebida);
        j.add(Cardapio);
        j.add(Estoque);
        j.add(venda);
        j.add(produto);
        j.setTitle("Programa Frente Caixa");
        j.setSize(1000,600);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLocationRelativeTo(null);
        j.setVisible(true);


        Tema.setFont(new Font("Sans serif", Font.BOLD,20));
        Tema.setForeground(Color.BLACK);
        Tema.setBounds(465,10,150,30);


        insumo.setBounds(410, 60, 160, 30);
        insumo.setBackground(Color.WHITE);
        insumo.setFocusPainted(false);
        insumo.setVerticalTextPosition(SwingConstants.CENTER);
        insumo.setIconTextGap(20);
        insumo.setHorizontalTextPosition(SwingConstants.RIGHT);


        Caixa.setBounds(410,100,160,30);
        Caixa.setBackground(Color.white);
        Caixa.setFocusPainted(false);
        Caixa.setVerticalTextPosition(SwingConstants.CENTER);
        Caixa.setHorizontalTextPosition(SwingConstants.RIGHT);
        Caixa.setIconTextGap(5);

        bebida.setBounds(410, 140, 160, 30);
        bebida.setBackground(Color.WHITE);
        bebida.setFocusPainted(false);
        bebida.setVerticalTextPosition(SwingConstants.CENTER);
        bebida.setHorizontalTextPosition(SwingConstants.RIGHT);
        bebida.setIconTextGap(20);

        Cardapio.setBounds(410, 180, 160, 30);
        Cardapio.setBackground(Color.WHITE);
        Cardapio.setFocusPainted(false);
        Cardapio.setVerticalTextPosition(SwingConstants.CENTER);
        Cardapio.setHorizontalTextPosition(SwingConstants.RIGHT);
        Cardapio.setIconTextGap(20);

        Estoque.setBounds(410,220,160,30);
        Estoque.setBackground(Color.white);
        Estoque.setFocusPainted(false);
        Estoque.setVerticalTextPosition(SwingConstants.CENTER);
        Estoque.setHorizontalTextPosition(SwingConstants.RIGHT);
        Estoque.setIconTextGap(5);

        Hamburguer.setBounds(410,260,160,30);
        Hamburguer.setBackground(Color.WHITE);
        Hamburguer.setFocusPainted(false);
        Hamburguer.setVerticalTextPosition(SwingConstants.CENTER);
        Hamburguer.setHorizontalTextPosition(SwingConstants.RIGHT);
        Hamburguer.setIconTextGap(5);

        venda.setBounds(410, 300,160,30);
        venda.setBackground(Color.WHITE);
        venda.setFocusPainted(false);
        venda.setVerticalTextPosition(SwingConstants.CENTER);
        venda.setHorizontalTextPosition(SwingConstants.RIGHT);
        venda.setIconTextGap(5);

        produto.setBounds(410, 340,160,30);
        produto.setBackground(Color.WHITE);
        produto.setFocusPainted(false);
        produto.setVerticalTextPosition(SwingConstants.CENTER);
        produto.setHorizontalTextPosition(SwingConstants.RIGHT);
        produto.setIconTextGap(5);

    }
    //public static void main(String[] args){


    //}

    //@Override
   // public void actionPerformed(ActionEvent e) {
      //  Object saida= e.getSource();
       // if(saida ==  ){
        //}
   // }

    }

