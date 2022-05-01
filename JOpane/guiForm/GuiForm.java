package JOpane.guiForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class GuiForm extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton sumarButton;
    private JButton restarButton;
    private JButton multiplicarButton;
    private JLabel numero2Label;
    private JButton dividirButton;
    private JButton raízCuadradaButton;
    private JButton exponenteButton;
    private JLabel numero1Label;
    private JLabel resultadoLabel;
    private JTextField textField3;
    private JLabel autorLabel;

    //Variables para las operaciones e ícono para el mensaje de error.
    double num1, num2, total;
    String resultado;
    Icon icono = new ImageIcon(getClass().getResource("monito.png"));

    //Para controlar que sean números.
    public static boolean esNumero(String n) {
        try {
            Double.parseDouble(n);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    //Constructor
    public GuiForm() {

        //El contenido es el panel que está construido con GUI Form.
        setContentPane(panel1);
        //A la escucha para captar que botón es el que se oprime.
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == sumarButton) {
                    if ( (textField1.getText().contains("[a-zA-Z]*") || textField2.getText().contains("[a-zA-Z]*")) || (textField1.getText() == null || textField2.getText() == null) || (textField1.getText().equals("") || textField2.getText().equals("")) || (!(esNumero(textField1.getText()) || !(esNumero(textField2.getText())) )) ) {
                        JOptionPane.showMessageDialog(null, "Los datos no están completos,\no no son números!",
                                "Error", JOptionPane.WARNING_MESSAGE, icono);
                    } else {
                        num1 = Double.parseDouble(textField1.getText());
                        num2 = Double.parseDouble(textField2.getText());
                        total = num1 + num2;
                        resultado = String.valueOf(total);
                        textField3.setText(resultado);
                    }
                }
            }
        });

        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        raízCuadradaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        exponenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
}
