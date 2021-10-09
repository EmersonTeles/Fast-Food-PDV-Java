package FastFood.View;
import FastFood.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
/**
 * VendaView permite que o usuario cadastre a venda dos produtos que estao no cardapio.
 * Permite que o mesmo exclua os produtos que já foram adicionados ao carrinho.
 * Permite que seja adicionado o nome do cliente.
 * Permite adicionar um desconto para o valor total da compra.
 * Permite finalizar a venda, assim obtendo todos os valores da compra.
 * @author Fellipe e Emerson
 * @version 1.0 (out 2021)
 */

public class VendaView extends JFrame {
    JComboBox<String> dropdown_produto = new JComboBox<>();
    JComboBox<Produto> dropdown_produtos_adicionados = new JComboBox<>();
    JLabel label_produto = new JLabel("Escolha o produto: ");
    JLabel label_cliente = new JLabel("Digite o nome do cliente: ");
    JLabel label_desconto = new JLabel("Digite o desconto que deseja: ");
    JLabel label_retirar_produto = new JLabel("Escolha o produto para retirar: ");
    JLabel label_cliente_final = new JLabel("Cliente: ");
    JLabel label_desconto_final = new JLabel("Desconto: 0%");
    JLabel label_valor_total = new JLabel("Valor total: R$0,0");
    JButton adicionar_produto = new JButton("Adicionar produto");
    JButton retirar_produto = new JButton("Retirar produto");
    JButton adicionar_cliente = new JButton("Adicionar cliente");
    JButton adicionar_desconto = new JButton("Adicionar desconto");
    JButton finalizar_pedido = new JButton("Finalizar pedido");
    JButton voltar = new JButton("Voltar");
    JTextField nome_cliente = new JTextField(30);
    JTextField num_desconto = new JTextField(10);
    JTable table_produtos;
    ArrayList<Item> rows = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();
    public VendaView(Venda venda, Cardapio cardapio, View view){
        table_produtos = new JTable();
        for (int i = 0; i < cardapio.getProdutos().size(); i++) {
            dropdown_produto.addItem(cardapio.getProdutos().get(i).getNome());
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
        label_valor_total.setBounds(800,340,150,30);

        //Voltar ao menu
        this.add(voltar);
        voltar.setBounds(50, 310,200,30);

        adicionar_produto.addActionListener(
            e -> adicionarProduto(cardapio, venda)
        );
        adicionar_cliente.addActionListener(
            e -> adicionarCliente(venda)
        );
        adicionar_desconto.addActionListener(
            e-> adicionarDesconto(venda)
        );
        retirar_produto.addActionListener(
            e -> retirarProduto(venda)
        );
        finalizar_pedido.addActionListener(
            e -> finalizarVenda(venda, view)
        );
        voltar.addActionListener(
            e -> Voltar(view)
        );
    }

    private void adicionarProduto(Cardapio cardapio, Venda venda) {
        int index = dropdown_produto.getSelectedIndex();
        dropdown_produtos_adicionados.addItem(cardapio.getProdutos().get(index));

        Item item = new Item(cardapio.getProdutos().get(index).getNome(), "1", cardapio.getProdutos().get(index).getPreco());
        rows.add(item);
        model.setRowCount(0);
        for (Item row : rows) {
            Object[] fila = {
                    row.nome,
                    row.quantidade,
                    row.preco
            };
            model.addRow(fila);
        }
        venda.adicionarProduto(cardapio.getProdutos().get(index));
        label_valor_total.setText("Valor total: R$" + venda.getvalorFinal());
    }

    private void retirarProduto(Venda venda){

        int index = dropdown_produtos_adicionados.getSelectedIndex();
        dropdown_produtos_adicionados.removeItemAt(index);
        rows.remove(index);
        model.removeRow(index);
        venda.retirarProduto(index);
        label_valor_total.setText("Valor total: R$" + venda.getvalorFinal());
    }
    private void adicionarCliente(Venda venda){
        venda.adicionarCliente(nome_cliente.getText());
        label_cliente_final.setText("Cliente: " + venda.getCliente());
    }

    private void adicionarDesconto(Venda venda){
        venda.desconto(Float.parseFloat(num_desconto.getText()));
        label_desconto_final.setText("Desconto: " + venda.getDesconto() + "%");
        label_valor_total.setText("Valor total: R$" +  venda.getvalorFinal());
    }
    private void finalizarVenda(Venda venda, View view){
        Object[] options = { "Não", "Sim" };
        int opcao = JOptionPane.showOptionDialog(null, "Deseja finalizar a venda no valor de R$" + venda.getvalorFinal() + "?", "Finalizar Venda", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if( opcao == 1 ){
            view.caixaView.caixa.setVendas(venda);
            view.caixaView.caixa.setValorFechamento(venda.getvalorFinal());
            Voltar(view);
        }
    }
    private void Voltar(View view){
        view.setVisible(true);
        this.dispose();
    }
    public static void main(String[] args){
    }
}
/**
 * A classe item recebe o nome, quantidade e preço do item.
 * @author Fellipe e Emerson
 * @version 1.0 (out 2021)
 */
class Item{
    String nome;
    String quantidade;
    float preco;
    public Item( String nome, String quantidade, float preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
