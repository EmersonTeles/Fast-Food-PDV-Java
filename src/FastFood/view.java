package FastFood;

import javax.swing.JFrame;

public class view extends JFrame{
    public view(){
        setTitle("Fast Food");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
    }
    public static void main(String[] args){
        new view();
    }
}
