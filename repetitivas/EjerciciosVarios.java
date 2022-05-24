import java.math.BigInteger;
import java.util.Scanner;

/**
 * EjerciciosVarios
 */
public class EjerciciosVarios {

    static Scanner leerT=new Scanner(System.in);

    public static void factorialXnum() {
        int n; 
        long result=1;
        System.out.println("Ingrese un numero:");
        n=leerT.nextInt();
        if(n>1){
        for (int i = 1; i <=n; i++) {
            result=result*i; 
            }
        }
        System.out.println("El factorial de "+n+" es:"+result);
    }

    public static long factorialnum(int n) {
        long result=1;
        if(n>1){
        for (int i = 1; i <=n; i++) {
            result=result*i; 
            }
        }
        return result;
    }

    public static BigInteger factorialnumBig(int n) {
        BigInteger result=new BigInteger("1");
        if(n>1){
        for (int i = 1; i <=n; i++) {
            result=result.multiply(new BigInteger(String.valueOf(i)));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        /*factorialXnum();
        Long resultado=factorialnum(5);
        System.out.println("resultado:"+resultado);*/
        System.out.println("ingrese un numero:");
        int numero=leerT.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println("factorial de "+i+"! =" + factorialnumBig(i));
        }

    }
}