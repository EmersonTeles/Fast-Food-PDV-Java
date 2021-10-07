package FastFood.View;
import FastFood.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class VendaView extends JFrame {
    ArrayList<Produto> lista_produtos = new ArrayList<>();
    JComboBox<String> dropdown_produto = new JComboBox<>();
    JComboBox<Produto> dropdown_produtos_adicionados = new JComboBox<>();
    JLabel label_produto = new JLabel("Escolha o produto: ");
    JLabel label_cliente = new JLabel("Digite o nome do cliente: ");
    JLabel label_desconto = new JLabel("Digite o desconto que deseja: ");
    JLabel label_retirar_produto = new JLabel("Escolha o produto para retirar: ");
    JLabel label_cliente_final = new JLabel("Cliente: ");
    JLabel label_desconto_final = new JLabel("Desconto: ");
    JLabel label_valor_total = new JLabel("Valor total: ");
    JButton adicionar_produto = new JButton("Adicionar produto");
    JButton retirar_produto = new JButton("Retirar produto");
    JButton adicionar_cliente = new JButton("Adicionar cliente");
    JButton adicionar_desconto = new JButton("Adicionar desconto");
    JButton finalizar_pedido = new JButton("Finalizar pedido");
    JButton voltar = new JButton("Voltar");
    JTextField nome_cliente = new JTextField(30);
    JTextField num_desconto = new JTextField(10);
    Venda venda;
    JTable table_produtos;
    String[] titulos_table = {"Produto", "Qunatidade", "Preço"};
    String[][] dados = {};
    ArrayList<Item> rows = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();
    public VendaView( View view){
        venda = new Venda();
        table_produtos = new JTable();
        lista_produtos.add(new Hamburguer("Xtudo", 10,"Grande"));
        lista_produtos.add(new Bebida("Coca", 5, "Pequeno"));
        lista_produtos.add(new Bebida("Fanta", 4, "Pequeno"));
        for(int i = 0; i <lista_produtos.size(); i ++){
            dropdown_produto.addItem(lista_produtos.get(i).getNome());
        }
        this.setLayout(null);
        this.setTitle("Vendas");
        this.setSize(1000,440);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);

        //tabela
        model.addColumn("Produto");
        model.addColumn("Quantidade");
        model.addColumn("Preço Unitario");
        this.add(table_produtos);
        table_produtos.setRowHeight(30);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(table_produtos);
        this.add(scrollPane);
        scrollPane.setBounds(480,40,480,300);
        table_produtos.setModel(model);
        table_produtos.setEnabled(false);

        //Adicionar Produto
        this.add(label_produto);
        this.add(adicionar_produto);
        this.add(dropdown_produto);
        label_produto.setBounds(50,20,200,30);
        dropdown_produto.setBounds(50, 50,200,30);
        adicionar_produto.setBounds(260, 50, 150, 30);

        //Retirar Produto
        this.add(retirar_produto);
        this.add(label_retirar_produto);
        this.add(dropdown_produtos_adicionados);
        label_retirar_produto.setBounds(50,80,200,30);
        dropdown_produtos_adicionados.setBounds(50,110,200,30);
        retirar_produto.setBounds(260, 110, 150, 30);

        //Adicionar Cliente
        this.add(label_cliente);
        this.add(adicionar_cliente);
        this.add(nome_cliente);
        label_cliente.setBounds(50,140,200,30);
        nome_cliente.setBounds(50, 170,200,30);
        adicionar_cliente.setBounds(260, 170, 150, 30);

        //Adicionar Desconto
        this.add(adicionar_desconto);
        this.add(num_desconto);
        this.add(label_desconto);
        num_desconto.setText("0");
        label_desconto.setBounds(50,200,200,30);
        num_desconto.setBounds(50,230,200,30);
        adicionar_desconto.setBounds(260, 230, 150, 30);

        //Finalizar Pedido
        this.add(finalizar_pedido);
        finalizar_pedido.setBounds(50, 270, 200, 30);

        //Valores finais
        this.add(label_cliente_final);
        this.add(label_desconto_final);
        this.add(label_valor_total);
        label_cliente_final.setBounds(480,340,100,30);
        label_desconto_final.setBounds(650,340,100,30);
        label_valor_total.setBounds(800,340,120,30);

        //Voltar ao menu
        this.add(voltar);
        voltar.setBounds(50, 310,200,30);

        adicionar_produto.addActionListener(
            e -> {
                AdicionarProduto();
            }
        );
        adicionar_cliente.addActionListener(
            e -> {
                AdicionarCliente();
            }
        );
        adicionar_desconto.addActionListener(
            e->{
                AdicionarDesconto();
            }
        );
        retirar_produto.addActionListener(
            e -> {
                RetirarProduto();
            }
        );
        finalizar_pedido.addActionListener(
            e -> {
                FinalizarPedido();
            }
        );
        voltar.addActionListener(
                e -> {
                    Voltar(view);
                }
        );
    }
    private void AdicionarProduto() {
        int index = dropdown_produto.getSelectedIndex();
        dropdown_produtos_adicionados.addItem(lista_produtos.get(index));

        Item item = new Item(lista_produtos.get(index), "1", lista_produtos.get(index).getPreco());
        rows.add(item);
        model.setRowCount(0);
        for (int i = 0; i < rows.size(); i++) {
            Object[] fila = {
                    rows.get(i).nome,
                    rows.get(i).quantidade,
                    rows.get(i).preco
            };
            model.addRow(fila);
        }
        ValorFinal();
    }
    private void ValorFinal(){
        float valorFinal = 0;
        for(int i = 0; i < rows.size(); i ++){
            valorFinal += rows.get(i).preco;
        }
        System.out.println(venda.getDesconto()/100);
        valorFinal = valorFinal - (valorFinal * (venda.getDesconto()/100));
        venda.setvalorFinal(valorFinal);
            label_valor_total.setText("Valor total: R$"+ valorFinal);
    }
    private void RetirarProduto(){
        int index = dropdown_produtos_adicionados.getSelectedIndex();
        dropdown_produtos_adicionados.removeItemAt(index);
        rows.remove(index);
        model.removeRow(index);
        ValorFinal();
    }
    private void AdicionarCliente(){
        venda.adicionarCliente(nome_cliente.getText());
        label_cliente_final.setText("Cliente: " + venda.getCliente());
    }

    private void AdicionarDesconto(){
        venda.desconto(Integer.parseInt(num_desconto.getText()));
        label_desconto_final.setText("Desconto: " + venda.getDesconto() + "%");
        ValorFinal();
    }
    private void FinalizarPedido(){

    }
    private void Voltar(View view){
        view.setVisible(true);
        this.dispose();
    }
    public static void main(String[] args){
    }
}

class Item{
    Produto nome;
    String quantidade;
    float preco;
    public Item( Produto nome, String quantidade, float preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
