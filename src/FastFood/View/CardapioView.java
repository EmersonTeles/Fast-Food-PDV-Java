package FastFood.View;
import FastFood.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class CardapioView extends JFrame {
    JLabel tema = new JLabel("Opções:");
    JButton button_Cardapio = new JButton("Cardápio");
    JButton button_cadastrar = new JButton("Cadastrar");
    JButton button_editar = new JButton("Editar");
    JButton button_deletar = new JButton("Deletar");
    JButton voltar_deletar = new JButton("Voltar");
    Cardapio cardapio = new Cardapio();


    public CardapioView(Estoque estoque, View view) {

        add(button_cadastrar);
        add(button_deletar);
        add(button_editar);
        add(voltar_deletar);
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
        voltar_deletar.setBounds(98, 340, 200, 50);
        button_Cardapio.setBounds(120, 50, 150, 60);

        button_Cardapio.addActionListener(
                e->{
                    this.dispose();
                    CardapioTable(cardapio);
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
                    EditarProduto(estoque);
                }
        );
        button_deletar.addActionListener(
                e -> {
                    this.dispose();
                    deletar(estoque);
                }
        );
        voltar_deletar.addActionListener(
                e -> {
                    Voltar(view);
                }
        );
    }

    public void CardapioTable(Cardapio cardapio){
        JFrame JFCardapio = new JFrame();
        JLabel tituloCardapio= new JLabel("Cardápio");
        JButton voltar_cardapio_table = new JButton("Voltar");
        JTable tableCardapio;
        DefaultTableModel model = new DefaultTableModel();

        JFCardapio.add(tituloCardapio);
        tableCardapio= new JTable();
        JFCardapio.setLayout(null);
        JFCardapio.setTitle("Cardapio");
        JFCardapio.setSize(500,440);
        JFCardapio.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        JFCardapio.setLocationRelativeTo(null);
        JFCardapio.setVisible(true);
        JFCardapio.setResizable(false);

        model.addColumn("Produto");
        model.addColumn("Tamanho");
        model.addColumn("Preço Unitario");
        JFCardapio.add(tableCardapio);
        JFCardapio.add(voltar_cardapio_table);
        tableCardapio.setRowHeight(30);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(tableCardapio);
        JFCardapio.add(scrollPane);
        scrollPane.setBounds(10,40,480,300);
        voltar_cardapio_table.setBounds(10,350,100,30);
        tableCardapio.setModel(model);
        tableCardapio.setEnabled(false);
        model.setRowCount(0);
        for (int i = 0; i < cardapio.getProdutos().size(); i++) {
            Object[] fila = {
                    cardapio.getProdutos().get(i).getNome(),
                    cardapio.getProdutos().get(i).getTamanho(),
                    cardapio.getProdutos().get(i).getPreco(),
            };
            model.addRow(fila);
        }
        voltar_cardapio_table.addActionListener(
            e ->{
                JFCardapio.dispose();
                this.setVisible(true);
            }
        );
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

    private void EditarProduto(Estoque estoque){
        JFrame JFeditar = new JFrame();
        JLabel label_selecione_produto = new JLabel("Selecione o Produto:", SwingConstants.CENTER);
        JLabel label_nome_Produto = new JLabel("Novo nome do Produto:", SwingConstants.CENTER);
        JLabel label_nome_Preço = new JLabel("Novo preço do Produto:", SwingConstants.CENTER);
        JLabel label_tamanho_burguer = new JLabel("Novo tamanho Produto:", SwingConstants.CENTER);
        JLabel label_escolha_insumo = new JLabel("Escolha os novos Insumo: ", SwingConstants.CENTER);

        JComboBox<Produto> dropdown_produtos = new JComboBox<Produto>();
        JComboBox<String> dropdown_tamanho = new JComboBox<String>();
        JComboBox<Insumo> dropdown_insumos = new JComboBox<Insumo>();

        JButton button_produto = new JButton("Editar Produto");
        JButton button_Insumo = new JButton("Trocar insumo");
        JButton voltar_Editar = new JButton("Voltar");

        JTextField nome_produto_text = new JTextField(70);
        JTextField preco_produto_text = new JTextField(70);

        ArrayList<Insumo> nova_composicao = new ArrayList<>();

        for ( Produto produto : cardapio.getProdutos()) {
            dropdown_produtos.addItem(produto);
        }

        for ( Insumo insumo : estoque.getInsumo()){
            dropdown_insumos.addItem(insumo);
        }

        JFeditar.add(label_nome_Produto);
        dropdown_tamanho.addItem("Pequeno");
        dropdown_tamanho.addItem("Médio");
        dropdown_tamanho.addItem("Grande");
        JFeditar.add(nome_produto_text);
        JFeditar.add(label_nome_Preço);
        JFeditar.add(voltar_Editar);
        JFeditar.add(preco_produto_text);
        JFeditar.add(label_tamanho_burguer);
        JFeditar.add(label_escolha_insumo);
        JFeditar.add(button_Insumo);
        JFeditar.add(label_selecione_produto);
        JFeditar.add(dropdown_produtos);
        JFeditar.add(dropdown_insumos);
        JFeditar.add(dropdown_tamanho);
        JFeditar.add(button_produto);
        JFeditar.setLayout(null);
        JFeditar.setTitle("Editar produto");
        JFeditar.setSize(400, 600);
        JFeditar.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        JFeditar.setLocationRelativeTo(null);
        JFeditar.setVisible(true);

        label_selecione_produto.setBounds(90,50,220,30);
        label_selecione_produto.setVerticalAlignment(SwingConstants.CENTER);
        dropdown_produtos.setBounds(90,80,220,30);

        label_nome_Produto.setBounds(90, 120, 220, 30);
        label_nome_Produto.setVerticalAlignment(SwingConstants.CENTER);
        nome_produto_text.setBounds(75, 150, 250, 20);


        label_escolha_insumo.setBounds(85, 170, 230, 30);
        label_escolha_insumo.setVerticalAlignment(SwingConstants.CENTER);
        dropdown_insumos.setBounds(100, 200, 200, 20);
        button_Insumo.setBounds(75, 229, 250, 20);

        label_nome_Preço.setBounds(80, 250, 240, 30);
        preco_produto_text.setBounds(75, 280, 250, 20);
        label_tamanho_burguer.setBounds(80, 300, 240, 30);
        dropdown_tamanho.setBounds(75, 330, 250, 20);
        button_produto.setBounds(100, 360, 200, 30);
        voltar_Editar.setBounds(75, 415, 250, 24);

        button_Insumo.addActionListener(
            e->{
                int index = dropdown_insumos.getSelectedIndex();
                nova_composicao.add(estoque.getInsumoByIndex(index));
                JOptionPane.showMessageDialog(null,"Insumo registrado!");
            }
        );
        button_produto.addActionListener(
            e->{
                int index = dropdown_produtos.getSelectedIndex();
                String nome = nome_produto_text.getText();
                String tamanho = String.valueOf(dropdown_tamanho.getSelectedItem());
                float preco = Float.parseFloat(preco_produto_text.getText());
                cardapio.editar(index, nome,  preco, tamanho, nova_composicao);
                dropdown_produtos.removeAllItems();
                for ( Produto produto : cardapio.getProdutos()) {
                    dropdown_produtos.addItem(produto);
                }
                JOptionPane.showMessageDialog(null,"Alteração feita com sucesso!");
            }
        );
        voltar_Editar.addActionListener(
                e -> {
                    JFeditar.dispose();
                    this.setVisible(true);
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
        Deletar.add(combo2);
        Deletar.add(button_atualizar2);
        Deletar.add(voltar_deletar);
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
        voltar_deletar.setBounds(98, 340, 200, 50);

        button_atualizar2.addActionListener(
                e->{
                    int index;
                    index = combo2.getSelectedIndex();
                    combo2.removeItemAt(index);
                    cardapio.deletar(index);
                    JOptionPane.showMessageDialog(null,"Alteração feita com sucesso");
                }
        );
        voltar_deletar.addActionListener(
                e -> {
                    Deletar.dispose();
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
        JButton escolher_Insumo = new JButton("Escolher Insumo");
        ArrayList<Insumo> composicao = new ArrayList<>();

        for (int i = 0; i < estoque.getInsumo().size(); i++) {
            dropInsumo.addItem(estoque.getInsumo().get(i).getNome());
        }
        JFcadastrarBurguer.add(descricao_hamburguer);
        JFcadastrarBurguer.add(nome_Hamburguer);
        dropTamanhoHam.addItem("Pequeno");
        dropTamanhoHam.addItem("Médio");
        dropTamanhoHam.addItem("Grande");
        JFcadastrarBurguer.add(escolher_Insumo);
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
        escolher_Insumo.setBounds(110,225,180,20);


        voltar_cadastro_hamburguer.addActionListener(
                e -> {
                    JFcadastrarBurguer.dispose();
                    this.setVisible(true);
                }
        );
        escolher_Insumo.addActionListener(
                e->{
                    int index= dropInsumo.getSelectedIndex();
                    composicao.add(estoque.getInsumoByIndex(index));
                    JOptionPane.showMessageDialog(null,"Cadastro feita com sucesso");
                }
        );
        cadastrar_hamburguer_button.addActionListener(
                e -> {
                    String nome_hamburguer = nome_Hamburguer_Text.getText();
                    float preco_hamburguer = Float.parseFloat(nome_Preço_Text.getText());
                    String tamanho_hamburguer = String.valueOf(dropTamanhoHam.getSelectedItem());
                    if(composicao.size()>0){
                        cardapio.cadastrar(new Hamburguer(nome_hamburguer, preco_hamburguer, tamanho_hamburguer, composicao));
                        JOptionPane.showMessageDialog(null,"Cadastro feita com sucesso");
                    }else{
                        JOptionPane.showMessageDialog(null,"Precisa ter pelo menos 1 insumo");
                    }
                }
        );
    }
    private void CadastrarBebida(Estoque estoque){
        JFrame Bebida = new JFrame();
        JLabel descricao_bebida = new JLabel("Fazer Bebida");
        JLabel nome_Bebida = new JLabel("Digite o nome da Bebida:");
        JTextField nome_bebida_Text = new JTextField(30);
        JLabel nome_Preço = new JLabel("Digite o preço da Bebida:");
        JTextField nome_Preço_Text = new JTextField(30);
        JLabel mlBebida = new JLabel("Digite o tamanho da bebida:");
        JComboBox<String> tamanhoBebida = new JComboBox<>();
        JLabel bebida_Insumo = new JLabel("Escolha o Insumo e confirme");
        JButton button_Bebida_Insumo = new JButton("Confirme o Insumo");
        JComboBox<Insumo> dropBebidaInsumo = new JComboBox<>();
        JButton button_nome_bebida = new JButton("Fazer Bebida");
        JButton voltar_bebida_btn = new JButton("Voltar");
        ArrayList<Insumo> composicao_bebida = new ArrayList<>();

        for (int i = 0; i < estoque.getInsumo().size(); i++) {
            dropBebidaInsumo.addItem(estoque.getInsumo().get(i));
        }
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
        Bebida.add(button_Bebida_Insumo);
        Bebida.add(tamanhoBebida);
        Bebida.add(button_nome_bebida);
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
        button_nome_bebida.setBounds(110,360,160,30);
        dropBebidaInsumo.setBounds(110,200,180,20);
        bebida_Insumo.setBounds(110,170,180,30);
        button_Bebida_Insumo.setBounds(80,229,250,20);
        voltar_bebida_btn.setBounds(80, 415, 250, 24);

        voltar_bebida_btn.addActionListener(
            e -> {
                Bebida.dispose();
                this.setVisible(true);
            }
        );
        button_Bebida_Insumo.addActionListener(
            e->{
                int index= dropBebidaInsumo.getSelectedIndex();
                composicao_bebida.add(estoque.getInsumoByIndex(index));
                JOptionPane.showMessageDialog(null,"Cadastro feita com sucesso");
            }
        );
        button_nome_bebida.addActionListener(
            e -> {
                String nome = nome_bebida_Text.getText();
                float preco = Float.parseFloat(nome_Preço_Text.getText());
                String tamanho_bebida = String.valueOf(dropBebidaInsumo.getSelectedItem());
                if (composicao_bebida.size()>0) {
                    cardapio.cadastrar(new Bebida(nome, preco, tamanho_bebida, composicao_bebida));
                    JOptionPane.showMessageDialog(null,"Cadastro feita com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null,"Precisa ter pelo menos 1 insumo");
                }
            }
        );
    }
    private void Voltar(View view) {
        view.setVisible(true);
        this.dispose();
    }
}
