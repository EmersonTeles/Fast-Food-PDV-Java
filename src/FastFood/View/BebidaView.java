package FastFood.View;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class BebidaView extends JFrame{
    JLabel descricao_bebida= new JLabel("Fazer Bebida");
    JLabel nome_Bebida= new JLabel("Digite o nome da Bebida:");
    JTextField nome_bebida_Text= new JTextField(30);
    JLabel nome_Preço= new JLabel("Digite o preço da Bebida:");
    JTextField nome_Preço_Text= new JTextField(30);
    JLabel mlBebida= new JLabel("Digite o tamanho da bebida:");
    JComboBox<String> tamanhoBebida= new JComboBox<String>();
    JLabel bebida_Insumo= new JLabel("Escolha o Insumo e confirme");
    JButton buttonBebida_Insumo= new JButton("Confirme o Insumo");
    JComboBox<String> dropBebidaInsumo= new JComboBox<String>();
    JButton bNomeBebida= new JButton("Fazer Bebida");
    JButton voltar= new JButton("Voltar");



    public BebidaView(View view){
        add(descricao_bebida);
        add(voltar);
        tamanhoBebida.addItem("Pequeno");
        tamanhoBebida.addItem("Médio");
        tamanhoBebida.addItem("Grande");
        add(nome_Bebida);
        add(nome_bebida_Text);
        add(nome_Preço);
        add(nome_Preço_Text);
        add(mlBebida);
        add(bebida_Insumo);
        add(dropBebidaInsumo);
        add(buttonBebida_Insumo);
        add(tamanhoBebida);
        add(bNomeBebida);
        setLayout(null);
        setTitle("Fazer Bebida");
        setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        descricao_bebida.setBounds(150,90,100,30);
        nome_Bebida.setBounds(110,115,150,30);
        nome_bebida_Text.setBounds(80,150,250,20);
        nome_Preço.setBounds(110,250,170,30);
        nome_Preço_Text.setBounds(80,285,250,20);
        mlBebida.setBounds(110,300,170,30);
        tamanhoBebida.setBounds(80,330,250,20);
        bNomeBebida.setBounds(110,360,160,30);
        dropBebidaInsumo.setBounds(110,200,180,20);
        bebida_Insumo.setBounds(110,170,180,30);
        buttonBebida_Insumo.setBounds(80,229,250,20);
        voltar.setBounds(110,405,160,30);

        voltar.addActionListener(
                e -> {
                    Voltar(view);
                }
        );


    }
    private void Voltar(View view){
        view.setVisible(true);
        this.dispose();
    }
}

