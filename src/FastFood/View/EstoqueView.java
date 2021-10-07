    package FastFood.View;
    import FastFood.*;
    import javax.swing.*;

    public class EstoqueView extends JFrame{
        JLabel tema = new JLabel("Opções:");
        JButton button_cadastrar = new JButton("Cadastrar");
        JButton button_editar = new JButton("Editar");
        JButton button_deletar = new JButton("Deletar");
        JButton voltar = new JButton("Voltar");

        Insumo insumo;

        public EstoqueView(Estoque estoque, View view){
           add(button_cadastrar);
           add(button_deletar);
           add(button_editar);
           add(voltar);
           setLayout(null);
           add(tema);
           setTitle("Estoque");
           setSize(400,600);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           setLocationRelativeTo(null);
           setVisible(true);

            tema.setBounds(160,10,100,30);
            button_cadastrar.setBounds(120,70,150,60);
            button_editar.setBounds(120,160,150,60);
            button_deletar.setBounds(120,250,150,60);
            voltar.setBounds(98,340,200,50);

            button_cadastrar.addActionListener(
                    e -> {
                        this.dispose();
                        Cadastrar(estoque);
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
        public void Cadastrar(Estoque estoque){
            JFrame JFcadastrar = new JFrame();
            JLabel tema = new JLabel("Opções:");
            JLabel cadastro = new JLabel("Cadastrar");
            JLabel custo1 = new JLabel("Digite o custo:");
            JButton deletar = new JButton(" Deletar");
            JButton voltar_cadastro = new JButton("Voltar");
            JLabel quan_Itens = new JLabel("Digite a quantidade de insumos:");
            JButton cadastrar_btn = new JButton("Cadastrar insumo");
            JLabel descricao = new JLabel("Digite o nome do insumo que deseja:");
            JTextField nome_input = new JTextField(30);
            JTextField custo_input = new JTextField(8);
            JTextField quantidade_input = new JTextField(30);

            JFcadastrar.add(descricao);
            JFcadastrar.add(custo_input);
            JFcadastrar.add(custo1);
            JFcadastrar.add(cadastrar_btn);
            JFcadastrar.add(voltar_cadastro);
            JFcadastrar.add(quan_Itens);
            JFcadastrar.add(quantidade_input);
            JFcadastrar.setLayout(null);
            JFcadastrar.add(tema);
            JFcadastrar.add(cadastro);
            JFcadastrar.add(nome_input);
            JFcadastrar.setTitle("Cadastro");
            JFcadastrar.setSize(400,600);
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            JFcadastrar.setLocationRelativeTo(null);
            JFcadastrar.setVisible(true);

            cadastrar_btn.setBounds(100,270,200,30);
            cadastro.setBounds(155,5,250,100);
            nome_input.setBounds(50, 100,300,20);
            descricao.setBounds(80,30,250,100);

            voltar_cadastro.setBounds(98,340,200,50);
            custo1.setBounds(150,95,250,100);
            custo_input.setBounds(50, 170,300,20);

            quan_Itens.setBounds(120,210,300,20);
            quantidade_input.setBounds(50,240,300,20);

            cadastrar_btn.addActionListener(
                e -> {
                    String nome = nome_input.getText();
                    float custo = Float.parseFloat(custo_input.getText());
                    int quantidade = Integer.parseInt(quantidade_input.getText());
                    insumo = new Insumo(nome, custo);
                    estoque.cadastrar(insumo, quantidade);
                    JOptionPane.showMessageDialog(null,"Cadastro feito com sucesso");
                    nome_input.setText("");
                    custo_input.setText("");
                    quantidade_input.setText("");
                }
            );
            voltar_cadastro.addActionListener(
                e -> {
                    JFcadastrar.dispose();
                    this.setVisible(true);
                }
            );
        }

        public void editar(Estoque estoque){
            JFrame JFeditar = new JFrame();
            JLabel editarTela= new JLabel("Editar");
            JLabel custo= new JLabel("Digite o novo custo:");
            JLabel quan_Itens= new JLabel("Digite a nova quantia de Itens:");
            JButton alterar_nome_btn = new JButton("Atualizar");
            JButton alterar_custo_btn = new JButton("Atualizar Custo");
            JButton alterar_quantidade_btn = new JButton("Atualizar Quantidade");
            JButton voltar_editar = new JButton("Voltar");
            JLabel descricao= new JLabel("Digite o novo nome do insumo que deseja:");
            JLabel desc_New = new JLabel("Escolha abaixo o insumo que deseja:");
            JTextField nome_input = new JTextField(30);
            JTextField custo_input = new JTextField(8);
            JTextField quantidade_input = new JTextField(30);
            JComboBox<Insumo> combo = new JComboBox<>();

            for (int i = 0; i < estoque.getInsumo().size(); i++) {
                combo.addItem(estoque.getInsumo().get(i));
            }

            JFeditar.add(combo);
            JFeditar.add(alterar_nome_btn);
            JFeditar.add(descricao);
            JFeditar.add(voltar_editar);
            JFeditar.add(alterar_custo_btn);
            JFeditar.add(desc_New);
            JFeditar.add(custo_input);
            JFeditar.add(alterar_quantidade_btn);
            JFeditar.add(custo);
            JFeditar.add(quan_Itens);
            JFeditar.add(quantidade_input);
            JFeditar.setLayout(null);
            JFeditar.add(editarTela);
            JFeditar.add(nome_input);
            JFeditar.setTitle("Editar");
            JFeditar.setSize(400,600);
            JFeditar.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            JFeditar.setLocationRelativeTo(null);
            JFeditar.setVisible(true);

            alterar_nome_btn.setBounds(140,200,100,30);
            editarTela.setBounds(170,80,250,100);
            nome_input.setBounds(50, 170,300,20);
            descricao.setBounds(70,100,250,100);

            custo.setBounds(140,200,250,100);
            custo_input.setBounds(50, 265,300,20);
            alterar_custo_btn.setBounds(115,295,150,30);

            quan_Itens.setBounds(100,335,300,20);
            quantidade_input.setBounds(50,365,300,20);
            alterar_quantidade_btn.setBounds(120,395,150,30);

            desc_New.setBounds(75,20,250,100);
            combo.setBounds(115,90,150,20);
            voltar_editar.setBounds(94,480,200,50);

            alterar_nome_btn.addActionListener(
                e->{
                    int index = combo.getSelectedIndex();
                    estoque.getInsumoByIndex(index).setNome(nome_input.getText());
                    combo.removeAllItems();
                    for (int i = 0; i < estoque.getInsumo().size(); i++) {
                        combo.addItem(estoque.getInsumo().get(i));
                    }
                    JOptionPane.showMessageDialog(null,"Alteração feita com sucesso");
                }
            );
            alterar_custo_btn.addActionListener(
                e->{
                    int index = combo.getSelectedIndex();
                    estoque.getInsumoByIndex(index).setCusto(Float.parseFloat(custo_input.getText()));
                    JOptionPane.showMessageDialog(null,"Alteração feita com sucesso");
                }
            );
            alterar_quantidade_btn.addActionListener(
                e->{
                    int index = combo.getSelectedIndex();
                    estoque.setQuantidade(index, Integer.parseInt(quantidade_input.getText()));
                    JOptionPane.showMessageDialog(null,"Alteração feita com sucesso");
                }
            );
            voltar_editar.addActionListener(
                e -> {
                    JFeditar.dispose();
                    this.setVisible(true);
                }
            );
        }
        public void deletar(Estoque estoque){
            JFrame JFdeletar= new JFrame();

            JButton button_atualizar2= new JButton("Deletar");
            JLabel desc_New2 = new JLabel("Escolha abaixo o Produto que deseja:");
            JComboBox<String> deletar_input = new JComboBox<String>();
            JButton voltar_delete = new JButton("Voltar");

            JFdeletar.add(deletar_input);
            deletar_input.addItem("Brasil");
            deletar_input.addItem("Argentina");
            deletar_input.addItem("Brasil");
            deletar_input.addItem("Brasil");
            deletar_input.addItem("Brasil");
            JFdeletar.add(button_atualizar2);
            JFdeletar.add(voltar_delete);
            JFdeletar.add(desc_New2);
            JFdeletar.setLayout(null);
            JFdeletar.setTitle("JFdeletar item Estoque");
            JFdeletar.setSize(400,600);
            JFdeletar.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            JFdeletar.setLocationRelativeTo(null);
            JFdeletar.setVisible(true);

            button_atualizar2.setBounds(140,120,100,30);
            desc_New2.setBounds(75,20,250,100);
            deletar_input.setBounds(115,90,150,20);
            voltar_delete.setBounds(98,340,200,50);

            button_atualizar2.addActionListener(
                e -> {
                    int index;
                    index = deletar_input.getSelectedIndex();
                    deletar_input.removeItemAt(index);
                    estoque.deletar(index);
                    JOptionPane.showMessageDialog(null,"Alteração feita com sucesso");
                }
            );
            voltar_delete.addActionListener(
                e -> {
                    JFdeletar.dispose();
                    this.setVisible(true);
                }
            );
        }
        public void Voltar(View view){
            view.setVisible(true);
            this.dispose();
        }
    }
