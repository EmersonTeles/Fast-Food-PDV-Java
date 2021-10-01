package FastFood.View;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;


public class Cad_Estoque_View extends JFrame {
        JLabel tema = new JLabel("Opções:");
        JLabel cadastro= new JLabel("Cadastrar");
        JLabel custo= new JLabel("Digite o custo:");
        JButton deletar= new JButton(" Deletar");
        JLabel quan_Itens= new JLabel("Digite a quantidade de Itens:");
        JButton button_cadastrar= new JButton("Cadastrar");
        JLabel descricao= new JLabel("Digite o nome do produto que deseja:");
        JTextField cadText= new JTextField(30);
        JTextField custo_Text= new JTextField(8);
        JTextField quant_Text= new JTextField(30);

        public Cad_Estoque_View(){
            add(button_cadastrar);
            add(descricao);
            add(custo_Text);
            add(custo);
            add(quan_Itens);
            add(quant_Text);
            setLayout(null);
            add(tema);
            add(cadastro);
            add(cadText);
            setTitle("Estoque");
            setSize(400,600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setVisible(true);

            button_cadastrar.setBounds(140,270,100,30);
            cadastro.setBounds(155,5,250,100);
            cadText.setBounds(50, 100,300,20);
            descricao.setBounds(80,30,250,100);

            custo.setBounds(150,95,250,100);
            custo_Text.setBounds(50, 170,300,20);

            quan_Itens.setBounds(120,210,300,20);
            quant_Text.setBounds(50,240,300,20);

        }
        public static void main(String[] args){
            new FastFood.View.Cad_Estoque_View();


        }

}
