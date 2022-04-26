package CajeroAutomatico;

import java.util.Scanner;

public abstract class ClasePadre_Abstracta {

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int interruptor = 0;
        int seleccion = 0;
        do {
            do {
                System.out.println("-------------------------------------");
                System.out.println("Por favor seleccione una opci�n:");
                System.out.println("-------------------------------------");
                System.out.println("    1. Consulta de saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Deposito de efectivo.");
                System.out.println("    4. Salir.");
                System.out.println("-------------------------------------");
                seleccion = entrada.nextInt();
                
                //Para que no elija una opci�n que no existe.
                if (seleccion >= 1 && seleccion <= 4) {
                    interruptor = 1;
                } else {
                    System.out.println("-------------------------------------------------");
                    System.out.println("Opci�n no disponible, vuelva a intentar por favor.");
                    System.out.println("-------------------------------------------------");
                }
            } while (interruptor == 0);
            
            if(seleccion == 1){
                ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
                mensajero.Transacciones();
            }else if(seleccion == 2){
                ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
                mensajero.Transacciones();
            } else if(seleccion == 3){
                ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
                mensajero.Transacciones();
            } else if(seleccion == 4){
                System.out.println("--------------------------");
                System.out.println("�Gracias!, vuelva pronto.");
                System.out.println("--------------------------");
                interruptor = 2;
            }
        } while (interruptor != 2);
    }
    
    //M�todo para solicitar cantidad de retiro
    public void Retiro(){
        retiro = entrada.nextInt();
    }
    
    //M�todo para solicitar deposito
    public void Deposito(){
        deposito = entrada.nextInt();
    }
    
    //M�todo abstracto
    public abstract void Transacciones();
    
    //M�todos setter y getter
    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
}
