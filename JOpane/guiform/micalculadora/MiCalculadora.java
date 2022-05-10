package jopane.guiform.micalculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MiCalculadora extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton sumarButton;
    private JButton restarButton;
    private JButton multiplicarButton;
    private JLabel numero2Label;
    private JButton dividirButton;
    private JButton raízButton;
    private JButton exponenteButton;
    private JLabel numero1Label;
    private JLabel resultadoLabel;
    private JLabel autorLabel;
    private JSeparator separator1;

    //Variables para las operaciones e ícono para el mensaje de error.
    double num1, num2, total;
    String resultado;
    Icon icono = new ImageIcon(getClass().getResource("monito.png"));

    //Constructor
    public MiCalculadora() {
        //Método para que sólo se admitan números.
        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if (c < '0' || c > '9'){
                    e.consume();
                }
            }
        });

        //Método para que sólo se admitan números.
        textField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if (c < '0' || c > '9'){
                    e.consume();
                }
            }
        });

        //El contenido es el panel que está construido con GUI Form.
        setContentPane(panel1);
        //A la escucha para captar que botón es el que se oprime.
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == sumarButton) {
                    if ((textField1.getText().isBlank() || textField2.getText().isBlank()) && (textField1.getText().isEmpty() ||
                            textField2.getText().isEmpty())) {

                        JOptionPane.showMessageDialog(null, "Los datos no están completos,\no no son números!",
                                "Error", JOptionPane.WARNING_MESSAGE, icono);

                    } else {
                        num1 = Double.parseDouble(textField1.getText());
                        num2 = Double.parseDouble(textField2.getText());
                        total = num1 + num2;
                        resultado = String.valueOf(total);
                        //textField3.setText(resultado);
                        resultadoLabel.setText("Resultado: " + resultado);
                    }
                }
            }
        });

        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == restarButton) {
                    if ((textField1.getText().isBlank()) || textField2.getText().isBlank() && (textField1.getText().isEmpty()) || textField2.getText().isEmpty()){

                        JOptionPane.showMessageDialog(null, "Los datos no están completos,\no no son números!",
                                "Error", JOptionPane.WARNING_MESSAGE, icono);
                    } else {
                        num1 = Double.parseDouble(textField1.getText());
                        num2 = Double.parseDouble(textField2.getText());
                        total = num1 - num2;
                        resultado = String.valueOf(total);
                        //textField3.setText(resultado);
                        resultadoLabel.setText("Resultado: " + resultado);
                    }
                }
            }
        });
        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == multiplicarButton) {
                    if ((textField1.getText().isBlank()) || textField2.getText().isBlank() && (textField1.getText().isEmpty()) || textField2.getText().isEmpty()){

                        JOptionPane.showMessageDialog(null, "Los datos no están completos,\no no son números!",
                                "Error", JOptionPane.WARNING_MESSAGE, icono);
                    } else {
                        num1 = Double.parseDouble(textField1.getText());
                        num2 = Double.parseDouble(textField2.getText());
                        total = num1 * num2;
                        resultado = String.valueOf(total);
                        //textField3.setText(resultado);
                        resultadoLabel.setText("Resultado: " + resultado);
                    }
                }
            }
        });
        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == dividirButton) {
                    if ((textField1.getText().isBlank()) || textField2.getText().isBlank() && (textField1.getText().isEmpty()) || textField2.getText().isEmpty()){

                        JOptionPane.showMessageDialog(null, "Los datos no están completos,\no no son números!",
                                "Error", JOptionPane.WARNING_MESSAGE, icono);
                    } else {
                        num1 = Double.parseDouble(textField1.getText());
                        num2 = Double.parseDouble(textField2.getText());
                        if (num2 == 0){
                            JOptionPane.showMessageDialog(null, "División por cero?",
                                    "Error", JOptionPane.WARNING_MESSAGE, icono);
                        }else {
                            total = num1 / num2;
                            resultado = String.valueOf(total);
                            //textField3.setText(resultado);
                            resultadoLabel.setText("Resultado: " + resultado);
                        }
                    }
                }
            }
        });
        raízButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == raízButton) {
                    if ((textField1.getText().isBlank()) || textField2.getText().isBlank() && (textField1.getText().isEmpty()) || textField2.getText().isEmpty()){

                        JOptionPane.showMessageDialog(null, "Los datos no están completos,\no no son números!",
                                "Error", JOptionPane.WARNING_MESSAGE, icono);
                    } else {
                        num1 = Double.parseDouble(textField1.getText());
                        num2 = Double.parseDouble(textField2.getText());
                        if(num2 != 0) {
                            total = Math.pow(num1, 1 / num2);
                            resultado = String.valueOf(total);
                        }else {
                            JOptionPane.showMessageDialog(null, "El indice Número2 debe ser distinto de cero?",
                                    "Error", JOptionPane.WARNING_MESSAGE, icono);
                        }
                        //textField3.setText(resultado);
                        resultadoLabel.setText("Resultado: " + resultado);
                    }
                }
            }
        });
        exponenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == exponenteButton) {
                    if ((textField1.getText().isBlank()) || textField2.getText().isBlank() && (textField1.getText().isEmpty()) || textField2.getText().isEmpty()){

                        JOptionPane.showMessageDialog(null, "Los datos no están completos,\no no son números!",
                                "Error", JOptionPane.WARNING_MESSAGE, icono);
                    } else {
                        num1 = Double.parseDouble(textField1.getText());
                        num2 = Double.parseDouble(textField2.getText());
                        total = Math.pow(num1, num2);
                        resultado = String.valueOf(total);
                        //textField3.setText(resultado);
                        resultadoLabel.setText("Resultado: " + resultado);
                    }
                }
            }
        });

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
}
