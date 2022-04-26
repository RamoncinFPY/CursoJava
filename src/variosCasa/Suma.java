package variosCasa;

import java.util.*;

public class Suma{
   public static void main(String[] args){

      Scanner entrada = new Scanner(System.in);
      System.out.println("Ingresa el primer numero: ");
      int a = entrada.nextInt();

      System.out.println("Ingresa el segundo numero: ");
      int b = entrada.nextInt();

      int suma = a + b;
      System.out.println("La suma de " + a + " + " + b + " = "+ suma);
 }
}