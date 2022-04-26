package viernes2204EjDroides;

public class DroideMain {
    public static void main(String[] args) {
        int d2_potencia = 10;
        int d_tiempo = 0;

        Droide d_uno = new Droide(70, 0,false);
        Droide d_dos = new Droide(30, 0,false);

        if (d_uno.getPotencia() >= 50){
            d_tiempo = d_uno.getPotencia() - 50;
            d_uno.setTiempo(d_tiempo);
            d_uno.setE(true);
            System.out.println("Droide d_uno activado" + d_uno.toString());
        }else {
            System.out.println("Droide d_uno desactivado" + d_uno.toString());
        }

        if (d_dos.getPotencia() >= 50){
            d_tiempo = d_dos.getPotencia() - 50;
            d_dos.setTiempo(d_tiempo);
            d_dos.setE(true);
            System.out.println("Droide d_dos activado" + d_dos.toString());
        }else {
            System.out.println("Droide d_dos desactivado" + d_dos.toString());
        }
    }
}
