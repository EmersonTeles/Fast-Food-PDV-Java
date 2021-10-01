package FastFood.View;

import javax.swing.*;
import java.awt.*;

public class TablePanel {

    public TablePanel() {

    }
    public static void main(String[] args){
        new TablePanel();
        JFrame jr = new JFrame();


        jr.setVisible(true);
        jr.setLayout(null);
        jr.setTitle("Tabela");
        jr.setSize(400,440);
        jr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        jr.setLocationRelativeTo(null);
        jr.setResizable(false);

    }
}
