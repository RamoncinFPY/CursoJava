import javax.swing.*;

public class Formulario2 extends JFrame{
 
 public Formulario2(){
  setLayout(null); 
 }

 public static void main(String args[]){
   Formulario1 formulario1 = new Formulario1();
   formulario1.setBounds(0,0,400,550);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);
   formulario1.setResizable(false);
 }
}