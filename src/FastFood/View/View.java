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
    EstoqueView estoqueView;
    CardapioView cardapioView;

    public View (){
        this.setLayout(null);
        this.add(hamburguer_btn);
        this.add(insumo_btn);
        this.add(caixa_btn);
        this.add(Tema);
        this.add(bebida_btn);
        this.add(cardapio_btn);
        this.add(estoque_btn);
        this.add(venda_btn);
        this.add(produto_btn);
        this.setTitle("Programa de Frente Caixa");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);

        Tema.setFont(new Font("Sans serif", Font.BOLD,30));
        Tema.setForeground(Color.BLACK);
        Tema.setBounds(160,30,80,30);
        caixa_btn.setBounds(120, 100, 160, 30);
        caixa_btn.setBackground(Color.white);
        caixa_btn.setFocusPainted(false);
        caixa_btn.setVerticalTextPosition(SwingConstants.CENTER);
        caixa_btn.setHorizontalTextPosition(SwingConstants.RIGHT);
        caixa_btn.setIconTextGap(5);

        cardapio_btn.setBounds(120, 140, 160, 30);
        cardapio_btn.setBackground(Color.WHITE);
        cardapio_btn.setFocusPainted(false);
        cardapio_btn.setVerticalTextPosition(SwingConstants.CENTER);
        cardapio_btn.setHorizontalTextPosition(SwingConstants.RIGHT);
        cardapio_btn.setIconTextGap(20);

        estoque_btn.setBounds(120, 180, 160, 30);
        estoque_btn.setBackground(Color.white);
        estoque_btn.setFocusPainted(false);
        estoque_btn.setVerticalTextPosition(SwingConstants.CENTER);
        estoque_btn.setHorizontalTextPosition(SwingConstants.RIGHT);
        estoque_btn.setIconTextGap(5);

        venda_btn.setBounds(120, 220, 160, 30);
        venda_btn.setBackground(Color.WHITE);
        venda_btn.setFocusPainted(false);
        venda_btn.setVerticalTextPosition(SwingConstants.CENTER);
        venda_btn.setHorizontalTextPosition(SwingConstants.RIGHT);
        venda_btn.setIconTextGap(5);

        caixa_btn.addActionListener(
            e -> {
                abrirCaixaView();
            }
        );
        venda_btn.addActionListener(
            e -> {
                abrirVendasView();
            }
        );
        estoque_btn.addActionListener(
            e -> {
                abrirEstoqueView();
            }
        );
        cardapio_btn.addActionListener(
            e -> {
                abrirCardapioView();
            }
        );
    }

    private void abrirCaixaView(){
        if(caixaView == null){
            caixaView = new CaixaView(this);
        }
        caixaView.setVisible(true);
        this.dispose();
    }

    private void abrirVendasView(){
        Venda venda = new Venda();
        if(caixaView == null || caixaView.caixa == null){
            JOptionPane.showMessageDialog(null, "Caixa está fechado, por favor abra-o antes de realizar uma venda.");
        }else if (!caixaView.caixa.getIsCaixaOpen()){
            JOptionPane.showMessageDialog(null, "Caixa está fechado, por favor abra-o antes de realizar uma venda.");
        }else{
            vendaView = new VendaView(venda, this);
            vendaView.setVisible(true);
            this.dispose();
        }
    }
    
    private void abrirEstoqueView(){
        estoqueView = new EstoqueView(this);
        estoqueView.setVisible(true);
        this.dispose();
    }
    
    private void abrirCardapioView(){
        cardapioView = new CardapioView(this);
        vendaView.setVisible(true);
        this.dispose();
    }
}

