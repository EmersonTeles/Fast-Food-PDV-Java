    package FastFood.View;
    import FastFood.Estoque;
    import FastFood.Insumo;
    import FastFood.Produto;

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.ArrayList;

    import static java.lang.Float.parseFloat;

    public class EstoqueView extends JFrame{
        JLabel tema = new JLabel("Opções:");
        JButton button_cadastrar= new JButton("Cadastrar");
        JButton button_editar= new JButton("Editar");
        JButton button_deletar= new JButton("Deletar");
        JButton voltar= new JButton("Voltar");
        Estoque estoque= new Estoque();
        Insumo insumo;

        public EstoqueView(View view){
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
                        Cadastrar();
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
        public void Cadastrar(){
            this.dispose();
            JFrame cadastrar = new JFrame();
            JLabel tema = new JLabel("Opções:");
            JLabel cadastro= new JLabel("Cadastrar");
            JLabel custo1= new JLabel("Digite o custo:");
            JButton deletar= new JButton(" Deletar");
            JLabel quan_Itens= new JLabel("Digite a quantidade de Itens:");
            JButton cadastrar_btn= new JButton("Cadastrar produto");
            JLabel descricao= new JLabel("Digite o nome do produto que deseja:");
            JTextField cadText= new JTextField(30);
            JTextField custo_Text= new JTextField(8);
            JTextField quant_Text= new JTextField(30);

            cadastrar.add(descricao);
            cadastrar.add(custo_Text);
            cadastrar.add(custo1);
            cadastrar.add(cadastrar_btn);
            cadastrar.add(voltar);
            cadastrar.add(quan_Itens);
            cadastrar.add(quant_Text);
            cadastrar.setLayout(null);
            cadastrar.add(tema);
            cadastrar.add(cadastro);
            cadastrar.add(cadText);
            cadastrar.setTitle("Cadastro");
            cadastrar.setSize(400,600);
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            cadastrar.setLocationRelativeTo(null);
            cadastrar.setVisible(true);

            cadastrar_btn.setBounds(100,270,200,30);
            cadastro.setBounds(155,5,250,100);
            cadText.setBounds(50, 100,300,20);
            descricao.setBounds(80,30,250,100);

            voltar.setBounds(98,340,200,50);
            custo1.setBounds(150,95,250,100);
            custo_Text.setBounds(50, 170,300,20);

            quan_Itens.setBounds(120,210,300,20);
            quant_Text.setBounds(50,240,300,20);

            String nome= cadText.getText();
            String custo_text =(custo_Text.getText());
            String quantidade_text = quant_Text.getText();

            cadastrar_btn.addActionListener(
                    e -> {
                        Insumo.cadastrar(nome, parseFloat(custo_text));
                        Estoque.cadastrar(insumo, Integer.parseInt(quantidade_text));
                        JOptionPane.showMessageDialog(null,"Cadastro feito com sucesso");
                    }
            );
        }

        public void editar(){
            this.dispose();
            JFrame editar1 = new JFrame();
            JLabel editarTela= new JLabel("Editar");
            JLabel custo= new JLabel("Digite o novo custo:");
            JLabel quan_Itens= new JLabel("Digite a nova quantia de Itens:");
            JButton button_atualizar= new JButton("Atualizar");
            JButton button_Custo= new JButton("Atualizar Custo");
            JButton button_item= new JButton("Atualizar Item");
            JLabel descricao= new JLabel("Digite o novo nome do produto que deseja:");
            JLabel desc_New = new JLabel("Escolha abaixo o Produto que deseja:");
            JTextField editText= new JTextField(30);
            JTextField custo_new= new JTextField(8);
            JTextField quant_new= new JTextField(30);
            JComboBox<Produto> combo = new JComboBox<>();


            editar1.add(combo);
            //combo.addItem("Brasil");
            //combo.addItem("Argentina");
            editar1.add(button_atualizar);
            editar1.add(descricao);
            editar1.add(voltar);
            editar1.add(button_Custo);
            editar1.add(desc_New);
            editar1.add(custo_new);
            editar1.add(button_item);
            editar1.add(custo);
            editar1.add(quan_Itens);
            editar1.add(quant_new);
            editar1.setLayout(null);
            editar1.add(editarTela);
            editar1.add(editText);
            editar1.setTitle("Editar");
            editar1.setSize(400,600);
            editar1.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            editar1.setLocationRelativeTo(null);
            editar1.setVisible(true);

            button_atualizar.setBounds(140,200,100,30);
            editarTela.setBounds(170,80,250,100);
            editText.setBounds(50, 170,300,20);
            descricao.setBounds(70,100,250,100);

            custo.setBounds(140,200,250,100);
            custo_new.setBounds(50, 265,300,20);
            button_Custo.setBounds(115,295,150,30);

            quan_Itens.setBounds(100,335,300,20);
            quant_new.setBounds(50,365,300,20);
            button_item.setBounds(120,395,150,30);

            desc_New.setBounds(75,20,250,100);
            combo.setBounds(115,90,150,20);
            voltar.setBounds(94,480,200,50);

            button_atualizar.addActionListener(
                    e->{
                        int select;
                        select= combo.getSelectedIndex();
                        combo.setSelectedItem(Produto.getNome());
                        insumo.setNome(editText.getText());
                        JOptionPane.showMessageDialog(null,"Alteração feita com sucesso");
                    }
            );
            button_Custo.addActionListener(
                    e->{
                        int select;
                        select= combo.getSelectedIndex();
                        combo.setSelectedItem(Produto.getPreco());
                        insumo.setCusto(parseFloat(custo_new.getText()));
                        JOptionPane.showMessageDialog(null,"Alteração feita com sucesso");
                    }
            );
            button_item.addActionListener(
                    e->{
                        int select;
                        select= combo.getSelectedIndex();
                        //combo.setSelectedItem();
                        //insumo.setNome(editText.getText());
                        JOptionPane.showMessageDialog(null,"Alteração feita com sucesso");
                    }
            );



        }

        public void deletar(){
            JFrame Deletar= new JFrame();

            JButton button_atualizar2= new JButton("Deletar");
            JLabel desc_New2 = new JLabel("Escolha abaixo o Produto que deseja:");
            JComboBox<String> combo2 = new JComboBox<String>();

            Deletar.add(combo2);
            combo2.addItem("Brasil");
            combo2.addItem("Argentina");
            combo2.addItem("Brasil");
            combo2.addItem("Brasil");
            combo2.addItem("Brasil");
            Deletar.add(button_atualizar2);
            Deletar.add(voltar);
            Deletar.add(desc_New2);
            Deletar.setLayout(null);
            Deletar.setTitle("Deletar item Estoque");
            Deletar.setSize(400,600);
            Deletar.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            Deletar.setLocationRelativeTo(null);
            Deletar.setVisible(true);

            button_atualizar2.setBounds(140,120,100,30);
            desc_New2.setBounds(75,20,250,100);
            combo2.setBounds(115,90,150,20);
            voltar.setBounds(98,340,200,50);

            button_atualizar2.addActionListener(
                    e ->{
                        int selectIndex;
                        selectIndex = combo2.getSelectedIndex();
                        //combo2.getSelectedIndex(Produto.getNome());
                        combo2.removeItemAt(selectIndex);
                        JOptionPane.showMessageDialog(null,"Alteração feita com sucesso");
                    }
            );
        }
        public void Voltar(View view){
            view.setVisible(true);
            this.dispose();
        }
    }
