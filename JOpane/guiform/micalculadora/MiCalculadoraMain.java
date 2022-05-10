package jopane.guiform.micalculadora;

import javax.swing.*;

public class MiCalculadoraMain {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame contenedor;
                contenedor = new MiCalculadora();
                contenedor.setSize(350,400);
                contenedor.setVisible(true);
                contenedor.setResizable(false);
                contenedor.setLocationRelativeTo(null);
                contenedor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}
