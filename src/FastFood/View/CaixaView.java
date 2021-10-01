package FastFood.View;
import FastFood.Caixa;

import javax.swing.*;
import java.util.Date;

public class CaixaView extends JFrame{
    JButton abrir_caixa = new JButton("Abrir Caixa");
    JButton fechar_caixa = new JButton("Fechar Caixa");
    JButton voltar = new JButton("Voltar");
    private String valorAbertura;
    public CaixaView(Caixa caixa, View view){
        this.setLayout(null);
        this.setTitle("Caixa");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.add(fechar_caixa);
        this.add(abrir_caixa);
        this.add(voltar);

        abrir_caixa.setBounds(100, 100, 200, 30);
        fechar_caixa.setBounds(100, 140, 200, 30);
        voltar.setBounds(100,180,200,30);
        abrir_caixa.addActionListener(
            e -> {
                abrirCaixa(caixa);
            }
        );
        fechar_caixa.addActionListener(
            e -> {
                fecharCaixa(caixa);
            }
        );
        voltar.addActionListener(
            e -> {
                Voltar(view);
            }
        );
    }

    private void abrirCaixa(Caixa caixa){
        if(caixa.getIsCaixaOpen()){
            JOptionPane.showMessageDialog(null, "Caixa já está aberto!");
        }else{
            valorAbertura = JOptionPane.showInputDialog(null, "Valor de abertura de caixa: ");
            caixa.setValorAbertura(Float.parseFloat(valorAbertura));
            caixa.setDataInicio(new Date());
            caixa.toggleIsCaixaOpen();
            JOptionPane.showMessageDialog(null, "Caixa foi aberto no valor de " + caixa.getValorAbertura() + " com sucesso!");
        }
    }
    private void fecharCaixa(Caixa caixa){
        if(caixa.getIsCaixaOpen()){
            caixa.setValorAbertura(0);
            caixa.toggleIsCaixaOpen();
            caixa.setDataTermino(new Date());
            JOptionPane.showMessageDialog(null, "Caixa foi fechado com " + caixa.getValorFechamento());
        }else{
            JOptionPane.showMessageDialog(null, "Caixa já está fechado!");
        }
    }
    private void Voltar(View view){
        view.setVisible(true);
        this.dispose();
    }
    public static void main(String[] args){
    }
}
