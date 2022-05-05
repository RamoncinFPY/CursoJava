package deberes;

import java.util.Scanner;

/*Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en
las notas (double). Mostrar el promedio de las notas mayores a 5, promedio de
notas inferiores a 4 y la cantidad de notas 1, además mostrar el promedio total.
Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las
notas una a una para realizar los cálculos (contadores, sumas).
Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y
mostrar un mensaje de error finalizando el programa.*/
public class NotasFinales {
    public static void main(String[] args) {
        //Declaro las variables.
        int numeroNotas = 20;
        double notas    = 0.0D;
        double max      = 7.0D;
        double min      = 1.0D;
        double sumaNotas= 0.0D;
        double promedio = 0.0D;
        int contadorMay = 0;
        double sumaNoMa = 0;
        double promMayor= 0.0D;
        int contadorMen = 0;
        double sumaNoMe = 0.0D;
        double proMenor = 0.0D;
        int notasUno    = 0;


        //Creo un Scanner para la entrada de datos.
        Scanner entrada = new Scanner(System.in);
        //Uso el for solicitado para pedir las 20 notas.
        System.out.println("Ingrese las 20 notas, mínimo " +min+ ", máximo " +max);;
        for (int i = 1; i <= numeroNotas; i++) {
            System.out.println("Ingrese la nota " +i);
            notas = entrada.nextDouble();
            //Realizo la comprobación de las condiciones
            if (notas == 0 || notas > 7){
                System.out.println("Error, la nota ingresada es incorrecta");
                break;
            }
            if (notas == min){
                notasUno++;
            }

            if (notas >= min && notas <=max) {
                sumaNotas += notas;
            }

            if (notas > 5){
                sumaNoMa += notas;
                contadorMay++;
            }

            if (notas < 4){
                sumaNoMe += notas;
                contadorMen++;
            }
        }

        if (notas>=1 && notas <= max) {
            promMayor = (sumaNoMa / contadorMay);
            System.out.println("Promedio notas mayores de 5 = " + promMayor);

            proMenor = sumaNoMe / contadorMen;
            System.out.println("Promedio notas menores de 4 = " + proMenor);

            promedio = sumaNotas / numeroNotas;
            System.out.println("Promedio total = " + promedio);

            System.out.println("Notas iguales a uno => " + notasUno);
        } else{
            System.out.println("\"Vuelva a iniciar el programa.\"");
        }
    }
}