package JOpane.guiForm;

import javax.swing.*;

public class GuiFormMain {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame contenedor;
                contenedor = new GuiForm();
                contenedor.setSize(350,400);
                contenedor.setVisible(true);
                contenedor.setResizable(false);
                contenedor.setLocationRelativeTo(null);
            }
        });
    }
}
