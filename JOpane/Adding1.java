package JOpane;
import javax.swing.JOptionPane;

public class Adding1 {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog(null, "First Number");
        String n2 = JOptionPane.showInputDialog(null, "Second Number");

        int r = new Integer(n1) + new Integer(n2);

        JOptionPane.showMessageDialog(null, "the result is " + r);
    }
}

