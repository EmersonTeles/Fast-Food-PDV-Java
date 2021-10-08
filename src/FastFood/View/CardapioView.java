package FastFood.View;
import FastFood.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class CardapioView extends JFrame {
    JLabel tema = new JLabel("Opções:");
    JButton button_Cardapio = new JButton("Cardapio");
    JButton button_cadastrar = new JButton("Cadastrar");
    JButton button_editar = new JButton("Editar");
    JButton button_deletar = new JButton("Deletar");
    JButton voltar = new JButton("Voltar");
    Cardapio cardapio = new Cardapio();
    JTable tableCardapio;
    ArrayList<Item> rows = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();

    public CardapioView(Estoque estoque, View view) {

        add(button_cadastrar);
        add(button_deletar);
        add(button_editar);
        add(voltar);
        add(button_Cardapio);
        setLayout(null);
        add(tema);
        setTitle("Cardapio");
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

        button_Cardapio.addActionListener(
                e->{
                    this.dispose();
                    CardapioTable(estoque);
                }
        );

        button_cadastrar.addActionListener(
                e -> {
                    this.dispose();
                    Cadastra(estoque);
                }
        );
        button_editar.addActionListener(
                e -> {
                    this.dispose();
                    editar(estoque);
                }
        );
        button_deletar.addActionListener(
                e -> {
                    this.dispose();
                    deletar(estoque);
                }
        );
        voltar.addActionListener(
                e -> {
                    Voltar(view);
                }
        );
    }

    public void CardapioTable(Estoque estoque){
        JFrame JFCardapio = new JFrame();
        JLabel tituloCardapio= new JLabel("Cardápio");

        this.add(tituloCardapio);
        tableCardapio= new JTable();
        this.setLayout(null);
        this.setTitle("Cardapio");
        this.setSize(1000,440);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);

        model.addColumn("Produto");
        model.addColumn("Quantidade");
        model.addColumn("Preço Unitario");
        this.add(tableCardapio);
        tableCardapio.setRowHeight(30);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(tableCardapio);
        this.add(scrollPane);
        scrollPane.setBounds(480,40,480,300);
        tableCardapio.setModel(model);
        tableCardapio.setEnabled(false);


    }

    public void Cadastra(Estoque estoque) {
        JFrame JFcadastrar = new JFrame();
        JLabel tema = new JLabel("Opções:");
        JButton adicionar_hamburguer = new JButton(" Adicionar Hamburguer");
        JButton adicionar_bebida = new JButton("Adicionar Bebida");

        JFcadastrar.add(tema);
        JFcadastrar.add(adicionar_hamburguer);
        JFcadastrar.add(adicionar_bebida);
        JFcadastrar.setTitle("Cadastro");
        JFcadastrar.setSize(400, 600);
        JFcadastrar.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        JFcadastrar.setLocationRelativeTo(null);
        JFcadastrar.setVisible(true);
        JFcadastrar.setLayout(null);

        tema.setBounds(100, 130, 200, 50);
        adicionar_hamburguer.setBounds(100, 200, 200, 50);
        adicionar_bebida.setBounds(100, 300, 200, 50);

        adicionar_hamburguer.addActionListener(
            e -> {
                JFcadastrar.dispose();
                CadastrarHamburguer(estoque);
            }
        );
        adicionar_bebida.addActionListener(
            e -> {
                JFcadastrar.dispose();
                CadastrarBebida(estoque);
            }
        );
    }

    private void CadastrarHamburguer(Estoque estoque) {
        JFrame JFcadastrarBurguer = new JFrame();

        JTextField nome_Hamburguer_Text = new JTextField(30);
        JTextField nome_Preço_Text = new JTextField(30);
        JLabel nome_Preço = new JLabel("Digite o preço do Hamburguer:");
        JLabel pesoHamb = new JLabel("Digite o tamanho do Hamburguer:");
        JLabel hamburguer_Insumo = new JLabel("Escolha o Insumo");
        JLabel descricao_hamburguer = new JLabel("Cadastrar Hamburguer");
        JLabel nome_Hamburguer = new JLabel("Digite o nome do Hamburguer:");
        JComboBox<String> dropTamanhoHam = new JComboBox<String>();
        JComboBox<String> dropInsumo = new JComboBox<String>();
        JButton cadastrar_hamburguer_button = new JButton("Cadastrar Hamburguer");
        JButton voltar_cadastro_hamburguer = new JButton("Voltar");
        JButton confirmar_Insumo = new JButton("Escolher Insumo");
        ArrayList<Insumo> composicao = new ArrayList<>();

        for (int i = 0; i < estoque.getInsumo().size(); i++) {
            dropInsumo.addItem(estoque.getInsumo().get(i).getNome());
        }
        JFcadastrarBurguer.add(descricao_hamburguer);
        JFcadastrarBurguer.add(nome_Hamburguer);
        dropTamanhoHam.addItem("Pequeno");
        dropTamanhoHam.addItem("Médio");
        dropTamanhoHam.addItem("Grande");
        JFcadastrarBurguer.add(confirmar_Insumo);
        JFcadastrarBurguer.add(nome_Hamburguer_Text);
        JFcadastrarBurguer.add(nome_Preço);
        JFcadastrarBurguer.add(voltar_cadastro_hamburguer);
        JFcadastrarBurguer.add(nome_Preço_Text);
        JFcadastrarBurguer.add(pesoHamb);
        JFcadastrarBurguer.add(hamburguer_Insumo);
        JFcadastrarBurguer.add(dropInsumo);
        JFcadastrarBurguer.add(dropTamanhoHam);
        JFcadastrarBurguer.add(cadastrar_hamburguer_button);
        JFcadastrarBurguer.setLayout(null);
        JFcadastrarBurguer.setTitle("Cadastrar Hamburguer");
        JFcadastrarBurguer.setSize(400, 600);
        JFcadastrarBurguer.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        JFcadastrarBurguer.setLocationRelativeTo(null);
        JFcadastrarBurguer.setVisible(true);

        descricao_hamburguer.setBounds(140, 90, 140, 30);
        nome_Hamburguer.setBounds(110, 115, 180, 30);
        nome_Hamburguer_Text.setBounds(80, 150, 250, 20);
        nome_Preço.setBounds(110, 250, 200, 30);
        nome_Preço_Text.setBounds(80, 280, 250, 20);
        pesoHamb.setBounds(110, 300, 200, 30);
        dropTamanhoHam.setBounds(80, 330, 250, 20);
        cadastrar_hamburguer_button.setBounds(110, 360, 200, 30);
        dropInsumo.setBounds(110, 200, 180, 20);
        hamburguer_Insumo.setBounds(140, 170, 180, 30);
        voltar_cadastro_hamburguer.setBounds(80, 415, 250, 24);
        confirmar_Insumo.setBounds(110,225,180,20);


        voltar_cadastro_hamburguer.addActionListener(
            e -> {
                JFcadastrarBurguer.dispose();
                this.setVisible(true);
            }
        );
        confirmar_Insumo.addActionListener(
                e->{

                }
        );
        cadastrar_hamburguer_button.addActionListener(
            e -> {
                String nome_hamburguer = nome_Hamburguer_Text.getText();
                float preco_hamburguer = Float.parseFloat(nome_Preço_Text.getText());
                String tamanho_hamburguer = String.valueOf(dropTamanhoHam.getSelectedItem());
                if(composicao.size() == 0){ // ALTERAR ESSA LINHA PARA MAIOR QUE 0 NAO ESQUECER PELA AMOR DE DEUS
                    cardapio.cadastrar(new Hamburguer(nome_hamburguer, preco_hamburguer, tamanho_hamburguer, composicao));
                    JOptionPane.showMessageDialog(null,"Cadastro feita com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null,"Precisa ter pelo menos 1 insumo");
                }
            }
        );
    }

    private void editar(Estoque estoque) {
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
                    EditarHamburguer(estoque);
                }
        );
        button_editar.addActionListener(
                e->{
                    EditarBebida(estoque);
                }
        );
    }

    private void EditarHamburguer(Estoque estoque){
        JFrame f = new JFrame();
        JLabel nome_Descricao = new JLabel("Selecione o Hamburguer");
        JComboBox<Produto> dropDescricao= new JComboBox<Produto>();
        JLabel nome_Hamburguer = new JLabel("Digite o novo nome do Hamburguer:");
        JTextField nome_Hamburguer_Text = new JTextField(30);
        JLabel nome_tipo = new JLabel("Digite o novo tipo do Hamburguer:");
        JTextField nome_tipo_Text = new JTextField(30);
        JLabel nome_Preço = new JLabel("Digite o novo preço do Hamburguer:");
        JTextField nome_Preço_Text = new JTextField(30);
        JLabel pesoHamb = new JLabel("Digite o novo tamanho do Hamburguer:");
        JComboBox<String> tamanhoHam = new JComboBox<String>();
        JButton bNomeHamb = new JButton("Editar Hamburguer");
        JLabel hamburguer_Insumo = new JLabel("Escolha os novos Insumo e confirme");
        JButton button_Insumo = new JButton("Confirme o Insumo");
        JComboBox<Insumo> dropInsumo = new JComboBox<Insumo>();

        for (int i = 0; i < cardapio.getProdutos().size(); i++) {
            dropDescricao.addItem(cardapio.getProdutos().get(i));
        }

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
        button_Insumo.addActionListener(
                e->{
                    int index = dropInsumo.getSelectedIndex();
                    //estoque.getInsumoByIndex(index).getInsumoByIndex(index).setNome(nome_input.getText();
                    for (int i = 0; i < estoque.getInsumo().size(); i++) {
                        dropInsumo.addItem(estoque.getInsumo().get(i));
                    }
                    JOptionPane.showMessageDialog(null,"Alteração feita com sucesso");
                }
        );
        bNomeHamb.addActionListener(
                e->{
                    int index = dropDescricao.getSelectedIndex();
                    dropDescricao.removeAllItems();
                    for (int i=0; i<estoque.getInsumo().size(); i++){
                       // dropDescricao.addItem(estoque.getInsumo().get(i));
                    }
                    JOptionPane.showMessageDialog(null,"Alteração feita com sucesso");
                }
        );



    }

    private void deletar(Estoque estoque) {
        JFrame Deletar = new JFrame();
        JButton button_atualizar2 = new JButton("Deletar");
        JLabel desc_New2 = new JLabel("Escolha abaixo o produto que deseja:");
        JComboBox<Produto> combo2 = new JComboBox<Produto>();
        for (int i = 0; i < cardapio.getProdutos().size(); i++) {
            combo2.addItem(cardapio.getProdutos().get(i));
        }
        //combo2.addItem("Brasil");
        //combo2.addItem("Argentina");
        Deletar.add(combo2);
        Deletar.add(button_atualizar2);
        Deletar.add(voltar);
        Deletar.add(desc_New2);

        Deletar.setLayout(null);

        Deletar.setTitle("Deletar item Estoque");
        Deletar.setSize(400, 600);
        Deletar.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        Deletar.setLocationRelativeTo(null);
        Deletar.setVisible(true);

        button_atualizar2.setBounds(140, 120, 100, 30);
        desc_New2.setBounds(75, 20, 250, 100);
        combo2.setBounds(115, 90, 150, 20);
        voltar.setBounds(98, 340, 200, 50);

        button_atualizar2.addActionListener(
                e->{
                    int index;
                    index = combo2.getSelectedIndex();
                    combo2.removeItemAt(index);
                    cardapio.deletar(index);
                    JOptionPane.showMessageDialog(null,"Alteração feita com sucesso");
                }
        );


    }
    private void CadastrarBebida(Estoque estoque){
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
        JComboBox<Insumo> dropBebidaInsumo= new JComboBox<Insumo>();
        JButton bNomeBebida= new JButton("Fazer Bebida");
        JButton voltar_bebida_btn = new JButton("Voltar");
        ArrayList<Insumo> composicao = new ArrayList<>();

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
        bNomeBebida.addActionListener(
                e -> {
                    String nome_hamburguer = nome_bebida_Text.getText();
                    float preco_hamburguer = Float.parseFloat(nome_Preço_Text.getText());
                    String tamanho_hamburguer = String.valueOf(dropBebidaInsumo.getSelectedItem());
                    if(composicao.size() == 0){ // ALTERAR ESSA LINHA PARA MAIOR QUE 0 NAO ESQUECER PELA AMOR DE DEUS
                        cardapio.cadastrar(new Hamburguer(nome_hamburguer, preco_hamburguer, tamanho_hamburguer, composicao));
                        JOptionPane.showMessageDialog(null,"Cadastro feita com sucesso");
                    }else{
                        JOptionPane.showMessageDialog(null,"Precisa ter pelo menos 1 insumo");
                    }
                }
        );


    }
    private void EditarBebida(Estoque estoque){
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
