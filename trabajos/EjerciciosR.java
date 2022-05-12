package trabajos;

import java.util.Scanner;

public class EjerciciosR {

    public static void imprimirN1_10While() {
        int numInt=1;
        while (numInt<=10) {
            System.out.println(numInt);
            numInt=numInt+1;
        }

    }

    public static void imprimirN1_10dowhile() {
        int numInt=1;
        do {
            System.out.println(numInt);
            numInt=numInt+1;
        } while (numInt<=10);
        
    }

    public static void imprimirN1_10for() {
        for (int numInt = 1; numInt <=10; numInt++) {
            System.out.println(numInt);
        }
        
    }

    public static void imprimirNombreVertical() {
        //Declarar Variables
        String nombre;
        //Datos de entrada
        System.out.println("ingrese su nombre:");
        Scanner lt=new Scanner(System.in);
        nombre=lt.next();
        //Proceso y Salida
        for (int i = 0; i< nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
        }
        
    }
    
    public static void main(String[] args) {
       /* System.out.println("while");
        imprimirN1_10While(); 
        System.out.println("Do while"); 
        imprimirN1_10dowhile();
        System.out.println(); 
        System.out.println("For:");
        imprimirN1_10for(); */
        imprimirNombreVertical();
        
    }
    
}
