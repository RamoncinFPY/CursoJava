package compararDosPass;

public class CompararPassword {
    private String pass1;
    private String pass2;

    public CompararPassword() {
    }

    public CompararPassword(String pass1, String pass2) {
        this.pass1 = pass1;
        this.pass2 = pass2;
    }

    public String getPass1() {
        return pass1;
    }

    public void setPass1(String pass1) {
        this.pass1 = pass1;
    }

    public String getPass2() {
        return pass2;
    }

    public void setPass2(String pass2) {
        this.pass2 = pass2;
    }

    @Override
    public String toString() {
        CompararPasswordInterfaz datos = new CompararPasswordInterfaz();
        pass1 = datos.pedirPass1();
        pass2 = datos.pedirPass2();
        String comparar = (pass1.equals(pass2)) ? "Contraseña correcta" : "Error, una de las contraseñas es incorrecta!";

        String imprimir = "CompararPassword:" +
                          "\nPassword 1 = " + pass1 +
                          "\nPassword 2 = " + pass2 +
                          "\nVerificación = " + comparar;
        String salida = datos.mostrarSalida(imprimir);
        return salida;
    }
}
