package Deberes;
import javax.swing.JOptionPane;

public class Adding2 {

    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog(null, "First number to add");
        while (!isNumber(n1)) {
            n1 = JOptionPane.showInputDialog(null,
                    "Invalid first number. Please insert another number");
        }
        String n2 = JOptionPane.showInputDialog(null, "Second number to add");
        while (!isNumber(n2)) {
            n2 = JOptionPane.showInputDialog(null,
                    "Invalid second number. Please insert another number");

        }

        int r = new Integer(n1) + new Integer(n2);
        JOptionPane.showMessageDialog(null, "The result of the addition of: "
                + n1 + " and: " + n2 + " is " + r);

    }

    private static boolean isNumber(String n) {
        try {
            Integer.parseInt(n);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}