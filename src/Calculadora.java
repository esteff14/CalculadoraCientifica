import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JLabel label1;
    private JTextField numero1textField1;
    private JLabel label2;
    private JTextField numero2textField1;
    private JButton sumaButton;
    private JButton restaButton;
    private JButton xButton;
    private JButton divisionb;
    private JButton raizCuadradaButton;
    private JButton potencia2;
    private JButton senButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton factorialButton;
    private JButton radianesButton;
    private JButton borrarButton;
    private JButton piButton;
    private JButton porcentajeb;
    private JButton raizEnésimaButton;
    private JButton potenciaEnésimaButton;
    public JPanel menuPrincipal;
    private JLabel resultadolb;


    public Calculadora() {

        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((numero1textField1.getText().matches("[0-9]+")) & (numero2textField1.getText().matches("[0-9]+"))) {
                    resultadolb.setText("Resultado: "+Integer.toString(Integer.parseInt(numero1textField1.getText())+Integer.parseInt(numero2textField1.getText())));
                }else {
                    resultadolb.setText("Resultado: El string tiene caracteres no numericos");
                }
            }
        });
        restaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        divisionb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        raizCuadradaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        potencia2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        senButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        potencia2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
