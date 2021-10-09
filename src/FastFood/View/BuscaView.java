package FastFood.View;
import FastFood.*;

import javax.swing.*;
import java.awt.*;

public class BuscaView extends JFrame {

    JButton button_buscar_insumo = new JButton("Buscar insumo");
    JButton button_buscar_produto = new JButton("Buscar produto");
    JTextField input_buscar_insumo = new JTextField(100);
    JTextField input_buscar_produto = new JTextField(100);
    JButton voltar = new JButton("Voltar");
    public BuscaView(Cardapio cardapio, Estoque estoque, View view){
        setLayout(null);
        setTitle("Busca");
        setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        add(button_buscar_insumo);
        add(button_buscar_produto);
        add(input_buscar_insumo);
        add(input_buscar_produto);
        add(voltar);
        input_buscar_insumo.setBounds(120, 100, 160, 30);
        input_buscar_insumo.setBackground(Color.WHITE);

        button_buscar_insumo.setBounds(120, 140, 160, 30);
        button_buscar_insumo.setBackground(Color.white);
        button_buscar_insumo.setFocusPainted(false);
        button_buscar_insumo.setVerticalTextPosition(SwingConstants.CENTER);
        button_buscar_insumo.setHorizontalTextPosition(SwingConstants.RIGHT);
        button_buscar_insumo.setIconTextGap(5);

        input_buscar_produto.setBounds(120, 180, 160, 30);
        input_buscar_produto.setBackground(Color.WHITE);

        button_buscar_produto.setBounds(120, 220, 160, 30);
        button_buscar_produto.setBackground(Color.WHITE);
        button_buscar_produto.setFocusPainted(false);
        button_buscar_produto.setVerticalTextPosition(SwingConstants.CENTER);
        button_buscar_produto.setHorizontalTextPosition(SwingConstants.RIGHT);
        button_buscar_produto.setIconTextGap(20);

        voltar.setBounds(120, 260, 160, 30);
        voltar.setBackground(Color.WHITE);
        voltar.setFocusPainted(false);
        voltar.setVerticalTextPosition(SwingConstants.CENTER);
        voltar.setHorizontalTextPosition(SwingConstants.RIGHT);
        voltar.setIconTextGap(20);

        button_buscar_insumo.addActionListener(
            e->{
                BuscarInsumo(estoque);
            }
        );
        button_buscar_produto.addActionListener(
            e->{
                BuscarProduto(cardapio);
            }
        );
        voltar.addActionListener(
                e -> {
                    Voltar(view);
                }
        );
    }
    public void BuscarInsumo(Estoque estoque){
        boolean encontra = false;
        for(Insumo insumo : estoque.getInsumo()){
            if(insumo.getNome().toUpperCase().equals(input_buscar_insumo.getText().toUpperCase())){
                encontra = true;
            }
        }
        if(encontra){
            JOptionPane.showMessageDialog(null, "Insumo " + input_buscar_insumo.getText() + " encontrado!");
        }else{
            JOptionPane.showMessageDialog(null, "Insumo " + input_buscar_insumo.getText() + " não encontrado!");
        }
    }
    public void BuscarProduto(Cardapio cardapio){
        boolean encontra = false;
        for(Produto produto : cardapio.getProdutos()){
            if(produto.getNome().toUpperCase().equals(input_buscar_produto.getText().toUpperCase())){
                encontra = true;
            }
        }
        if(encontra){
            JOptionPane.showMessageDialog(null, "Produto " + input_buscar_produto.getText() + " encontrado!");
        }else{
            JOptionPane.showMessageDialog(null, "Produto " + input_buscar_produto.getText() + " não encontrado, consulte o cardápio!");
        }
    }

    private void Voltar(View view){
        view.setVisible(true);
        this.dispose();
    }
}
