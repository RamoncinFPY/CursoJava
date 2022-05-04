public class Vocales {

    public static void main(String[] args) {
        String frase = "La vida es bella";
        char[] fraseChar = frase.toCharArray();
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (fraseChar[i] == 'a' || fraseChar[i] == 'e' || fraseChar[i] == 'i' || fraseChar[i] == '0' || fraseChar[i] == 'u') {
                contador++;
            }
        }
        System.out.println("Se encontraron  = " + contador + " vocales.");
    }
}
