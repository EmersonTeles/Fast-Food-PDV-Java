package FastFood.View;
import FastFood.*;

import javax.swing.*;
import java.awt.*;
public class View extends JFrame{
    JButton insumo_btn= new JButton("Insumo");
    JButton bebida_btn= new JButton("Bebida");
    JButton caixa_btn= new JButton("Caixa");
    JButton cardapio_btn= new JButton("Cardápio");
    JButton estoque_btn= new JButton("Estoque");
    JLabel Tema = new JLabel("Menu");
    JButton hamburguer_btn= new JButton("Hamburguer");
    JButton produto_btn= new JButton("Produto");
    JButton venda_btn= new JButton("Venda");
    CaixaView caixaView;
    VendaView vendaView;
    InsumoView insumoView;

    Caixa caixa;

    public View (){
        caixa = new Caixa();
        setLayout(null);
        add(hamburguer_btn);
        add(insumo_btn);
        add(caixa_btn);
        add(Tema);
        add(bebida_btn);
        add(cardapio_btn);
        add(estoque_btn);
        add(venda_btn);
        add(produto_btn);
        setTitle("Programa Frente Caixa");
        setSize(1000,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        Tema.setFont(new Font("Sans serif", Font.BOLD,20));
        Tema.setForeground(Color.BLACK);
        Tema.setBounds(465,10,150,30);


        insumo_btn.setBounds(410, 60, 160, 30);
        insumo_btn.setBackground(Color.WHITE);
        insumo_btn.setFocusPainted(false);
        insumo_btn.setVerticalTextPosition(SwingConstants.CENTER);
        insumo_btn.setIconTextGap(20);
        insumo_btn.setHorizontalTextPosition(SwingConstants.RIGHT);


        caixa_btn.setBounds(410,100,160,30);
        caixa_btn.setBackground(Color.white);
        caixa_btn.setFocusPainted(false);
        caixa_btn.setVerticalTextPosition(SwingConstants.CENTER);
        caixa_btn.setHorizontalTextPosition(SwingConstants.RIGHT);
        caixa_btn.setIconTextGap(5);

        bebida_btn.setBounds(410, 140, 160, 30);
        bebida_btn.setBackground(Color.WHITE);
        bebida_btn.setFocusPainted(false);
        bebida_btn.setVerticalTextPosition(SwingConstants.CENTER);
        bebida_btn.setHorizontalTextPosition(SwingConstants.RIGHT);
        bebida_btn.setIconTextGap(20);

        cardapio_btn.setBounds(410, 180, 160, 30);
        cardapio_btn.setBackground(Color.WHITE);
        cardapio_btn.setFocusPainted(false);
        cardapio_btn.setVerticalTextPosition(SwingConstants.CENTER);
        cardapio_btn.setHorizontalTextPosition(SwingConstants.RIGHT);
        cardapio_btn.setIconTextGap(20);

        estoque_btn.setBounds(410,220,160,30);
        estoque_btn.setBackground(Color.white);
        estoque_btn.setFocusPainted(false);
        estoque_btn.setVerticalTextPosition(SwingConstants.CENTER);
        estoque_btn.setHorizontalTextPosition(SwingConstants.RIGHT);
        estoque_btn.setIconTextGap(5);

        hamburguer_btn.setBounds(410,260,160,30);
        hamburguer_btn.setBackground(Color.WHITE);
        hamburguer_btn.setFocusPainted(false);
        hamburguer_btn.setVerticalTextPosition(SwingConstants.CENTER);
        hamburguer_btn.setHorizontalTextPosition(SwingConstants.RIGHT);
        hamburguer_btn.setIconTextGap(5);

        venda_btn.setBounds(410, 300,160,30);
        venda_btn.setBackground(Color.WHITE);
        venda_btn.setFocusPainted(false);
        venda_btn.setVerticalTextPosition(SwingConstants.CENTER);
        venda_btn.setHorizontalTextPosition(SwingConstants.RIGHT);
        venda_btn.setIconTextGap(5);

        produto_btn.setBounds(410, 340,160,30);
        produto_btn.setBackground(Color.WHITE);
        produto_btn.setFocusPainted(false);
        produto_btn.setVerticalTextPosition(SwingConstants.CENTER);
        produto_btn.setHorizontalTextPosition(SwingConstants.RIGHT);
        produto_btn.setIconTextGap(5);
        caixa_btn.addActionListener(
            e -> {
                abrirCaixaView();
            }
        );
        insumo_btn.addActionListener(
            e -> {
                
            }
        );
        venda_btn.addActionListener(
            e -> {
                abrirVendasView();
            }
        );
    }
    private void abrirCaixaView(){
        caixaView = new CaixaView(caixa, this);
        caixaView.setVisible(true);
        dispose();
    }

    private void abrirVendasView(){
        vendaView = new VendaView(this);
        vendaView.setVisible(true);
        dispose();

    }
   public static void main(String[] args){
    }
    }

