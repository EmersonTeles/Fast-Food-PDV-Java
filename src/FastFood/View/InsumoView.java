    package FastFood.View;
    import javax.swing.*;
    import java.awt.*;

    public class InsumoView extends JFrame{
        static JLabel tema = new JLabel("Opções:");
        static JLabel cadastro= new JLabel("Cadastrar");
        static JButton Editar= new JButton("Editar");
        static JButton deletar= new JButton(" Deletar");
        static JTextField cadText= new JTextField(30);

        public InsumoView(){
            setLayout(null);
            add(tema);
            add(cadastro);
            add(cadText);
            setTitle("Insumo");
            setSize(600,600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setVisible(true);

            cadastro.setBounds(200,50,250,100);
            cadText.setBounds(300, 80,100,20);
        }
        public static void main(String[] args){
            new InsumoView();
        }

    }
