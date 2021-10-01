package FastFood.View;
import FastFood.Cardapio;
import FastFood.Hamburguer;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class CardapioView extends JFrame {
    JLabel tema = new JLabel("Opções:");
    JButton button_Cardapio = new JButton("Cardapio");
    JButton button_cadastrar = new JButton("Cadastrar");
    JButton button_editar = new JButton("Editar");
    JButton button_deletar = new JButton("Deletar");
    JButton voltar = new JButton("Voltar");
    Cardapio cardapio;
    public CardapioView(View view) {
        cardapio = new Cardapio();
        add(button_cadastrar);
        add(button_deletar);
        add(button_editar);
        add(voltar);
        add(button_Cardapio);
        setLayout(null);
        add(tema);
        setTitle("Estoque");
        setSize(400, 600);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        tema.setBounds(160, 10, 100, 30);
        button_cadastrar.setBounds(120, 110, 150, 60);
        button_editar.setBounds(120, 170, 150, 60);
        button_deletar.setBounds(120, 230, 150, 60);
        voltar.setBounds(98, 340, 200, 50);
        button_Cardapio.setBounds(120, 50, 150, 60);


        button_cadastrar.addActionListener(
                e -> {
                    Cadastra();
                }
        );
        button_editar.addActionListener(
                e -> {
                    editar();
                }
        );
        button_deletar.addActionListener(
                e -> {
                    deletar();
                }
        );
        voltar.addActionListener(
                e -> {
                    Voltar(view);
                }
        );
    }

    public void Cadastra() {
        this.dispose();
        JFrame cadastrar = new JFrame();
        JLabel tema = new JLabel("Opções:");
        JButton adicionarHamburguer = new JButton(" Adicionar Hamburguer");
        JButton button_cadastrar = new JButton("Adicionar Bebida");

        cadastrar.add(tema);
        cadastrar.add(adicionarHamburguer);
        cadastrar.add(button_cadastrar);
        cadastrar.setTitle("Cadastro");
        cadastrar.setSize(400, 600);
        cadastrar.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        cadastrar.setLocationRelativeTo(null);
        cadastrar.setVisible(true);
        cadastrar.setLayout(null);

        tema.setBounds(100, 130, 200, 50);
        adicionarHamburguer.setBounds(100, 200, 200, 50);
        button_cadastrar.setBounds(100, 300, 200, 50);

        adicionarHamburguer.addActionListener(
                e -> {
                    CadastrarHamburguer(cadastrar);
                }
        );
        button_cadastrar.addActionListener(
                e -> {
                    CadastrarBebida();
                }
        );
    }

    private void CadastrarHamburguer(JFrame cadastrar) {
        cadastrar.dispose();
        JFrame j = new JFrame();
        JLabel descricao_hamburguer = new JLabel("Cadastrar Hamburguer");
        JLabel nome_Hamburguer = new JLabel("Digite o nome da Hamburguer:");
        JTextField nome_Hamburguer_Text = new JTextField(30);
        JLabel nome_tipo = new JLabel("Digite o tipo da Hamburguer:");
        JTextField nome_tipo_Text = new JTextField(30);
        JLabel nome_Preço = new JLabel("Digite o preço da Hamburguer:");
        JTextField nome_Preço_Text = new JTextField(30);
        JLabel pesoHamb = new JLabel("Digite o tamanho da Hamburguer:");
        JComboBox<String> tamanhoHam = new JComboBox<String>();
        JButton bNomeHamb = new JButton("Cadastrar Hamburguer");
        JLabel hamburguer_Insumo = new JLabel("Escolha o Insumo e confirme");
        JButton button_Insumo = new JButton("Confirme o Insumo");
        JComboBox<String> dropInsumo = new JComboBox<String>();
        JButton voltar_cadastro_hamburguer = new JButton("Voltar");

        j.add(descricao_hamburguer);
        j.add(nome_Hamburguer);
        tamanhoHam.addItem("Pequeno");
        tamanhoHam.addItem("Médio");
        tamanhoHam.addItem("Grande");
        j.add(nome_Hamburguer_Text);
        j.add(nome_Preço);
        j.add(voltar_cadastro_hamburguer);
        j.add(nome_Preço_Text);
        j.add(pesoHamb);
        j.add(hamburguer_Insumo);
        j.add(button_Insumo);
        j.add(dropInsumo);
        j.add(tamanhoHam);
        j.add(bNomeHamb);
        j.setLayout(null);
        j.setTitle("Cadastrar Hamburguer");
        j.setSize(400, 600);
        j.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        j.setLocationRelativeTo(null);
        j.setVisible(true);

        descricao_hamburguer.setBounds(150, 90, 140, 30);
        nome_Hamburguer.setBounds(110, 115, 180, 30);
        nome_Hamburguer_Text.setBounds(80, 150, 250, 20);
        nome_Preço.setBounds(110, 250, 200, 30);
        nome_Preço_Text.setBounds(80, 280, 250, 20);
        pesoHamb.setBounds(110, 300, 200, 30);
        tamanhoHam.setBounds(80, 330, 250, 20);
        bNomeHamb.setBounds(110, 360, 200, 30);
        dropInsumo.setBounds(110, 200, 180, 20);
        hamburguer_Insumo.setBounds(110, 170, 180, 30);
        button_Insumo.setBounds(80, 229, 250, 20);
        voltar_cadastro_hamburguer.setBounds(80, 415, 250, 24);
        voltar_cadastro_hamburguer.addActionListener( e -> {
            j.dispose();
            this.setVisible(true);
        });
    }

    private void editar() {
        this.dispose();
        JFrame Edit = new JFrame();
        JLabel tema = new JLabel("Opções:");
        JButton editarHamburguer = new JButton(" Editar Hamburguer");
        JButton button_editar = new JButton("Editar Bebida");

        Edit.add(tema);
        Edit.add(editarHamburguer);
        Edit.add(button_editar);
        Edit.setTitle("Editar");
        Edit.setSize(400, 600);
        Edit.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        Edit.setLocationRelativeTo(null);
        Edit.setVisible(true);
        Edit.setLayout(null);

        tema.setBounds(100, 130, 200, 50);
        editarHamburguer.setBounds(100, 200, 200, 50);
        button_editar.setBounds(100, 300, 200, 50);

        editarHamburguer.addActionListener(
                e->{
                    EditarHamburguer();
                }
        );
        button_editar.addActionListener(
                e->{
                    EditarBebida();
                }
        );
    }

    private void EditarHamburguer(){
        JFrame f = new JFrame();
        JLabel nome_Descricao = new JLabel("Selecione o Hamburguer");
        JComboBox<String> dropDescricao= new JComboBox<String>();
        JLabel nome_Hamburguer = new JLabel("Digite o novo nome da Hamburguer:");
        JTextField nome_Hamburguer_Text = new JTextField(30);
        JLabel nome_tipo = new JLabel("Digite o novo tipo da Hamburguer:");
        JTextField nome_tipo_Text = new JTextField(30);
        JLabel nome_Preço = new JLabel("Digite o novo preço da Hamburguer:");
        JTextField nome_Preço_Text = new JTextField(30);
        JLabel pesoHamb = new JLabel("Digite o novo tamanho da Hamburguer:");
        JComboBox<String> tamanhoHam = new JComboBox<String>();
        JButton bNomeHamb = new JButton("Cadastrar Hamburguer");
        JLabel hamburguer_Insumo = new JLabel("Escolha os novos Insumo e confirme");
        JButton button_Insumo = new JButton("Confirme o Insumo");
        JComboBox<String> dropInsumo = new JComboBox<String>();

        f.add(nome_Hamburguer);
        tamanhoHam.addItem("Pequeno");
        tamanhoHam.addItem("Médio");
        tamanhoHam.addItem("Grande");
        f.add(nome_Hamburguer_Text);
        f.add(nome_Preço);
        f.add(voltar);
        f.add(nome_Preço_Text);
        f.add(pesoHamb);
        f.add(hamburguer_Insumo);
        f.add(button_Insumo);
        f.add(nome_Descricao);
        f.add(dropDescricao);
        f.add(dropInsumo);
        f.add(tamanhoHam);
        f.add(bNomeHamb);
        f.setLayout(null);
        f.setTitle("Editar Hamburguer");
        f.setSize(400, 600);
        f.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        nome_Hamburguer.setBounds(110, 115, 180, 30);
        nome_Descricao.setBounds(110,30,180,30);
        dropDescricao.setBounds(110,80,180,30);
        nome_Hamburguer_Text.setBounds(80, 150, 250, 20);
        nome_Preço.setBounds(110, 250, 240, 30);
        nome_Preço_Text.setBounds(80, 280, 250, 20);
        pesoHamb.setBounds(110, 300, 240, 30);
        tamanhoHam.setBounds(80, 330, 250, 20);
        bNomeHamb.setBounds(110, 360, 200, 30);
        dropInsumo.setBounds(110, 200, 230, 20);
        hamburguer_Insumo.setBounds(110, 170, 230, 30);
        button_Insumo.setBounds(80, 229, 250, 20);
        voltar.setBounds(80, 415, 250, 24);
    }

    private void deletar() {
        JFrame Deletar = new JFrame();
        JLabel editar2 = new JLabel("Deletar Nome");
        JLabel custo2 = new JLabel("Deletar Custo:");
        JLabel item2 = new JLabel("Deletar Item");
        JButton button_atualizar2 = new JButton("Deletar");
        JButton button_Custo2 = new JButton("Deletar Custo");
        JButton button_item2 = new JButton("Deletar Item");
        JLabel desc_New2 = new JLabel("Escolha abaixo o hamburguer que deseja:");
        JComboBox<String> ComboItem = new JComboBox<String>();
        JComboBox<String> Nome_newC = new JComboBox<String>();
        JComboBox<String> combo2 = new JComboBox<String>();
        JComboBox<String> quant_new2C = new JComboBox<String>();

        combo2.addItem("Brasil");
        combo2.addItem("Argentina");

        Deletar.add(combo2);
        Deletar.add(button_atualizar2);
        Deletar.add(voltar);
        Deletar.add(button_Custo2);
        Deletar.add(desc_New2);
        Deletar.add(button_item2);
        Deletar.add(custo2);
        Deletar.add(item2);
        Deletar.add(quant_new2C);
        Deletar.setLayout(null);
        Deletar.add(editar2);
        Deletar.add(ComboItem);
        Deletar.add(Nome_newC);
        Deletar.setTitle("Deletar item Estoque");
        Deletar.setSize(400, 600);
        Deletar.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        Deletar.setLocationRelativeTo(null);
        Deletar.setVisible(true);

        button_atualizar2.setBounds(140, 120, 100, 30);
        desc_New2.setBounds(75, 20, 250, 100);
        combo2.setBounds(115, 90, 150, 20);
        voltar.setBounds(98, 340, 200, 50);

    }
    private void CadastrarBebida(){
        JFrame Bebida= new JFrame();
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
        JButton voltar_bebida_btn = new JButton("Voltar");

        Bebida.add(descricao_bebida);
        Bebida.add(voltar_bebida_btn);
        tamanhoBebida.addItem("Pequeno");
        tamanhoBebida.addItem("Médio");
        tamanhoBebida.addItem("Grande");
        Bebida.add(nome_Bebida);
        Bebida.add(nome_bebida_Text);
        Bebida.add(nome_Preço);
        Bebida.add(nome_Preço_Text);
        Bebida.add(mlBebida);
        Bebida.add(bebida_Insumo);
        Bebida.add(dropBebidaInsumo);
        Bebida.add(buttonBebida_Insumo);
        Bebida.add(tamanhoBebida);
        Bebida.add(bNomeBebida);
        Bebida.setLayout(null);
        Bebida.setTitle("Fazer Bebida");
        Bebida.setSize(400,600);
        Bebida.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        Bebida.setLocationRelativeTo(null);
        Bebida.setVisible(true);

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
        voltar_bebida_btn.setBounds(80, 415, 250, 24);
        voltar_bebida_btn.addActionListener( e -> {
            Bebida.dispose();
            this.setVisible(true);
        });

    }
    private void EditarBebida(){
        JFrame dec= new JFrame();
        JLabel nome_DescricaoBebida = new JLabel("Selecione a Bebida");
        JComboBox<String> dropDescricao= new JComboBox<String>();
        JLabel descricao_bebida= new JLabel("Editar Bebida");
        JLabel nome_Bebida= new JLabel("Digite o novo nome da Bebida:");
        JTextField nome_bebida_Text= new JTextField(30);
        JLabel nome_Preço= new JLabel("Digite o novo preço da Bebida:");
        JTextField nome_Preço_Text= new JTextField(30);
        JLabel mlBebida= new JLabel("Digite o novo tamanho da bebida:");
        JComboBox<String> tamanhoBebida= new JComboBox<String>();
        JLabel bebida_Insumo= new JLabel("Escolha o Insumo e confirme");
        JButton buttonBebida_Insumo= new JButton("Confirme o Insumo");
        JComboBox<String> dropBebidaInsumo= new JComboBox<String>();
        JButton bNomeBebida= new JButton("Editar Bebida");
        JButton voltar= new JButton("Voltar");

        dec.add(descricao_bebida);
        dec.add(voltar);
        dec.add(nome_DescricaoBebida);
        dec.add(dropDescricao);
        tamanhoBebida.addItem("Pequeno");
        tamanhoBebida.addItem("Médio");
        tamanhoBebida.addItem("Grande");
        dec.add(nome_Bebida);
        dec.add(nome_bebida_Text);
        dec.add(nome_Preço);
        dec.add(nome_Preço_Text);
        dec.add(mlBebida);
        dec.add(bebida_Insumo);
        dec.add(dropBebidaInsumo);
        dec.add(buttonBebida_Insumo);
        dec.add(tamanhoBebida);
        dec.add(bNomeBebida);
        dec.setLayout(null);
        dec.setTitle("Fazer Bebida");
        dec.setSize(400,600);
        dec.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dec.setLocationRelativeTo(null);
        dec.setVisible(true);

        nome_DescricaoBebida.setBounds(110,30,180,30);
        dropDescricao.setBounds(110,80,180,30);
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

        }

    private void Voltar(View view) {
        view.setVisible(true);
        this.dispose();
    }

    private void actionPerformed(ActionEvent e) {

    }
}
