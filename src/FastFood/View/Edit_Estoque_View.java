package FastFood.View;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Edit_Estoque_View extends JFrame {
    JLabel editar= new JLabel("Editar");
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
    JComboBox<String> combo = new JComboBox<String>();

    public Edit_Estoque_View(){
        add(combo);
        combo.addItem("Brasil");
        combo.addItem("Argentina");
        add(button_atualizar);
        add(descricao);
        add(button_Custo);
        add(desc_New);
        add(custo_new);
        add(button_item);
        add(custo);
        add(quan_Itens);
        add(quant_new);
        setLayout(null);
        add(editar);
        add(editText);
        setTitle("Estoque");
        setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        button_atualizar.setBounds(140,200,100,30);
        editar.setBounds(170,80,250,100);
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
    }
    private class My_Event implements ActionListener{
        public void actionPerformed(ActionEvent e) {

        }
    }
    public static void main(String[] args){
        new FastFood.View.Edit_Estoque_View();


    }
}
