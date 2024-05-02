package calculadora_02_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Soma extends JFrame {
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicar, dividir;
    
    public Soma() {
        super("Calculadora");
        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel("1° Número");
        rotulo2 = new JLabel("2° Número");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        exibir = new JLabel("");
        somar = new JButton("Somar");
        subtrair = new JButton("Subtrair");
        multiplicar = new JButton("Multiplicar");
        dividir = new JButton("Dividir");
        
        rotulo1.setBounds(50, 20, 100, 20);
        rotulo2.setBounds(50, 60, 100, 20);
        
        texto1.setBounds(120, 20, 200, 20);
        texto2.setBounds(120, 60, 200, 20);
        
        exibir.setBounds(100, 175, 200, 20);
        
        somar.setBounds(100, 100, 80, 20);
        subtrair.setBounds(200, 100, 80, 20);
        multiplicar.setBounds(100, 135, 95, 20);
        dividir.setBounds(210, 135, 80, 20);
        
        somar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int numero1, numero2, soma = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        soma = numero1 + numero2;
                        exibir.setVisible(true);
                        exibir.setText("A soma é " + soma);
                    }
                }
        );
        
        subtrair.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int numero1, numero2, subtrair = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        subtrair = numero1 - numero2;
                        exibir.setVisible(true);
                        exibir.setText("O resto é " + subtrair);
                    }
                }
        );
        
        multiplicar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int numero1, numero2, multiplicar = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        multiplicar = numero1 * numero2;
                        exibir.setVisible(true);
                        exibir.setText("O produto é " + multiplicar);
                    }
                }
        );
        
        dividir.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int numero1, numero2, dividir = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        dividir = numero1 / numero2;
                        exibir.setVisible(true);
                        exibir.setText("A divisão é " + dividir);
                    }
                }
        );
        exibir.setVisible(false);
        
        tela.add(rotulo1);
        tela.add(rotulo2);
        
        tela.add(texto1);
        tela.add(texto2);
        
        tela.add(exibir);
        
        tela.add(somar);
        tela.add(subtrair);
        tela.add(multiplicar);
        tela.add(dividir);
        
        setSize(400, 350);
        tela.setBackground(Color.LIGHT_GRAY);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        Soma app = new Soma();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
