package Deberes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CalcularEdad {
    public static void main(String[] args) {

        System.out.println("Ingresa tu fecha de nacimiento <FORMATO> 'yyyy-MM-dd'");
        Scanner entrada = new Scanner(System.in);
        //Doy el formato para la fecha que se va a solicitar.
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        try{
            //Solicito el ingreso de la fecha de nacimiento.
            //Se puede declarar de las dos maneras.
            //Date nacimiento = formato.parse(entrada.next());
            var nacimiento = formato.parse(entrada.next());
            //System.out.println("Fecha de nacimiento = " + nacimiento);
            System.out.println("Fecha de nacimiento = " + formato.format(nacimiento));

            Date fechaActual = new Date();
            //System.out.println("fechaActual = " + fechaActual);
            System.out.println("Fecha actual = " + formato.format(fechaActual));

            //Me devuelve la edad en milisegundos con getTime().
            long edad = fechaActual.getTime() - nacimiento.getTime();
            //Realizo la conversión (1 año = 3.154e+10 milisegundos.
            long anios = (long) (edad / (3.154e+10));
            System.out.println("Tienes " +anios+" años.");
            //System.out.println("Años de diferencia en milisegundos = " + edad);

        }catch (ParseException e){
            e.printStackTrace();
        }



    }
}
