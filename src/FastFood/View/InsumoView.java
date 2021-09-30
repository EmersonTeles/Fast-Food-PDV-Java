    package FastFood.View;
    import javax.swing.*;
    import java.awt.*;

    public class InsumoView {
        static JFrame insView= new JFrame( );
        static JLabel tema = new JLabel("Opções:");
        static JLabel cadastro= new JLabel("Cadastrar");
        static JButton Editar= new JButton("Editar");
        static JButton deletar= new JButton(" Deletar");
        static JTextField cadText= new JTextField(30);

        public static void dadosOp(){

            insView.setLayout(null);
            insView.add(tema);
            insView.add(cadastro);
            insView.add(cadText);
            insView.setTitle("Insumo");
            insView.setSize(1000,600);
            insView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            insView.setLocationRelativeTo(null);
            insView.setVisible(true);

            cadastro.setBounds(200,50,250,100);
            cadText.setBounds(300, 80,100,20);
        }
        public static void main(String[] args){
            dadosOp();


        }

    }
