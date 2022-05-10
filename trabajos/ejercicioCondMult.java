package trabajos;

import java.util.Scanner;

/**
 * ejercicioCondMult
 */
public class ejercicioCondMult {

    public static void profesor() {
       System.out.println("La funcion del docente es enseñar"); 
    }
    public static void estudiante() {
         System.out.println("La funcion del estudiante es aprender");
    }

    public void pcgamer() {
        System.out.println("La funcion de la pcgamer es procesar informacion");
    }

    public void proyector() {
        System.out.println("Proyectar una imagen, informacion ");
    }

    public static void main(String[] args) {
        ejercicioCondMult objx=new ejercicioCondMult();
        
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese el algoritmo que desea probar\n1=Profesor"+
        "\n2=Estudiante\n3=pc\n4=proyector");
        int opcMet=lt.nextInt();
        switch (opcMet) {
            case 1:{profesor(); } break;
            case 2: estudiante(); break;
            case 3: objx.pcgamer(); break;
            case 4: objx.proyector(); break;

            default: System.err.println("Opcion no existe"); break;
     
        }
       
    }
}