package FastFood.View;
import FastFood.Bebida;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.PublicKey;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class View extends JFrame{
    static JButton insumo = new JButton("Insumo");
    static JButton bebida = new JButton("Bebida");
    static JButton Caixa = new JButton("Caixa");
    static JButton Cardapio = new JButton("Cardápio");
    static JButton Estoque = new JButton("Estoque");
    static JLabel Tema = new JLabel("Menu");
    static JButton Hamburguer = new JButton("Hamburguer");
    static JButton venda = new JButton("Venda");

    public View() {
        setLayout(null);
        add(Hamburguer);
        add(insumo);
        add(Caixa);
        add(Tema);
        add(bebida);
        add(Cardapio);
        add(Estoque);
        add(venda);
        setTitle("Programa Frente Caixa");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        Tema.setFont(new Font("Sans serif", Font.BOLD, 20));
        Tema.setForeground(Color.BLACK);
        Tema.setBounds(465, 10, 150, 30);

        Caixa.setBounds(410, 100, 160, 30);
        Caixa.setBackground(Color.white);
        Caixa.setFocusPainted(false);
        Caixa.setVerticalTextPosition(SwingConstants.CENTER);
        Caixa.setHorizontalTextPosition(SwingConstants.RIGHT);
        Caixa.setIconTextGap(5);

        Cardapio.setBounds(410, 140, 160, 30);
        Cardapio.setBackground(Color.WHITE);
        Cardapio.setFocusPainted(false);
        Cardapio.setVerticalTextPosition(SwingConstants.CENTER);
        Cardapio.setHorizontalTextPosition(SwingConstants.RIGHT);
        Cardapio.setIconTextGap(20);

        Estoque.setBounds(410, 180, 160, 30);
        Estoque.setBackground(Color.white);
        Estoque.setFocusPainted(false);
        Estoque.setVerticalTextPosition(SwingConstants.CENTER);
        Estoque.setHorizontalTextPosition(SwingConstants.RIGHT);
        Estoque.setIconTextGap(5);

        venda.setBounds(410, 220, 160, 30);
        venda.setBackground(Color.WHITE);
        venda.setFocusPainted(false);
        venda.setVerticalTextPosition(SwingConstants.CENTER);
        venda.setHorizontalTextPosition(SwingConstants.RIGHT);
        venda.setIconTextGap(5);

        Estoque.addActionListener(
                e -> {
                    new EstoqueView(this);
                }
        );
        Cardapio.addActionListener(
                e -> {
                    new CardapioView(this);
                }
        );

    }

    public class NovoAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}
