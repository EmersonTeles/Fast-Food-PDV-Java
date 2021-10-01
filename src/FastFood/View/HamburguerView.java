package FastFood.View;

import javax.swing.*;

public class HamburguerView  extends JFrame {
    JLabel descricao_hamburguer = new JLabel("Cadastrar Hamburguer");
    JLabel nome_Hamburguer = new JLabel("Digite o nome da Hamburguer:");
    JTextField nome_Hamburguer_Text = new JTextField(30);
    JLabel nome_tipo = new JLabel("Digite o tipo da Hamburguer:");
    JTextField nome_tipo_Text = new JTextField(30);
    JLabel nome_Preço = new JLabel("Digite o preço da Hamburguer:");
    JTextField nome_Preço_Text = new JTextField(30);
    JLabel pesoHamb = new JLabel("Digite o tamanho da Hamburguer:");
    JComboBox<String> tamanhoHam= new JComboBox<String>();
    JButton bNomeHamb = new JButton("Cadastrar Hamburguer");
    JLabel hamburguer_Insumo= new JLabel("Escolha o Insumo e confirme");
    JButton button_Insumo= new JButton("Confirme o Insumo");
    JComboBox<String> dropInsumo= new JComboBox<String>();
    JButton voltar = new JButton("Voltar");


    public HamburguerView(View view) {
        add(descricao_hamburguer);
        add(nome_Hamburguer);
        tamanhoHam.addItem("Pequeno");
        tamanhoHam.addItem("Médio");
        tamanhoHam.addItem("Grande");
        add(nome_Hamburguer_Text);
        add(nome_Preço);
        add(voltar);
        add(nome_Preço_Text);
        add(pesoHamb);
        add(hamburguer_Insumo);
        add(button_Insumo);
        add(dropInsumo);
        add(tamanhoHam);
        add(bNomeHamb);
        setLayout(null);
        setTitle("Cadastrar Hamburguer");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        descricao_hamburguer.setBounds(150, 90, 140, 30);
        nome_Hamburguer.setBounds(110, 115, 180, 30);
        nome_Hamburguer_Text.setBounds(80, 150, 250, 20);
        nome_Preço.setBounds(110, 250, 200, 30);
        nome_Preço_Text.setBounds(80, 280, 250, 20);
        pesoHamb.setBounds(110, 300, 200, 30);
        tamanhoHam.setBounds(80, 330, 250, 20);
        bNomeHamb.setBounds(110, 360, 200, 30);
        dropInsumo.setBounds(110,200,180,20);
        hamburguer_Insumo.setBounds(110,170,180,30);
        button_Insumo.setBounds(80,229,250,20);
        voltar.setBounds(80,415,250,24);
        voltar.addActionListener(
                e ->{
                    Voltar(view);
                }
        );

    }
    private void Voltar(View view){
        view.setVisible(true);
        this.dispose();
    }
}
