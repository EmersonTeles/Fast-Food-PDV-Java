package FastFood.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Delete_EstoqueView extends JFrame{
    JLabel editar2= new JLabel("Deletar Nome");
    JLabel custo2= new JLabel("Deletar Custo:");
    JLabel item2= new JLabel("Deletar Item");
    JButton button_atualizar2= new JButton("Deletar");
    JButton button_Custo2= new JButton("Deletar Custo");
    JButton button_item2= new JButton("Deletar Item");
    JLabel desc_New2 = new JLabel("Escolha abaixo o Produto que deseja:");
    JComboBox<String> ComboItem = new JComboBox<String>();
    JComboBox<String> Nome_newC = new JComboBox<String>();
    JComboBox<String> combo2 = new JComboBox<String>();
    JComboBox<String> quant_new2C = new JComboBox<String>();
    public Delete_EstoqueView(){
        add(combo2);
        combo2.addItem("Brasil");
        combo2.addItem("Argentina");
        add(button_atualizar2);
        add(button_Custo2);
        add(desc_New2);
        add(button_item2);
        add(custo2);
        add(item2);
        add(quant_new2C);
        setLayout(null);
        add(editar2);
        add(ComboItem);
        add(Nome_newC);
        setTitle("Deletar item Estoque");
        setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        button_atualizar2.setBounds(140,120,100,30);
        desc_New2.setBounds(75,20,250,100);
        combo2.setBounds(115,90,150,20);
    }

    private class My_Event implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
    public static void main(String[] args){
        new FastFood.View.Delete_EstoqueView();


    }
}
