package trabajos;

public class EjerciciosRepetitivas {
    
    public static void ejerWhile() {
         int contador=1;
         int suma=0;
         while (contador<20) {
            if (contador%2==0) {
                suma=suma+contador; 
            }
            contador++;
        }
        System.out.println("la respouesta es:"+suma); 

        
    }

    public static void main(String[] aStrings) {
        
    }

}
