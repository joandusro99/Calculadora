
package calculadora;

import java.util.Scanner;


public class Calculadora {

    public static void main(String[] args) {

        Principal miCalculadora;
        miCalculadora = new Principal();

        Scanner miScanner;
        miScanner = new Scanner(System.in);

          Trigonometrica miTrigonometrica;
        miTrigonometrica=new Trigonometrica();
        
        int entrada;
        System.out.println("Ingresar el valor de X:");
        entrada = miScanner.nextInt();
        miCalculadora.setX(entrada);

        System.out.println("Ingresar el valor de Y:");
        entrada = miScanner.nextInt();
        miCalculadora.setY(entrada);

        miCalculadora.sumar();
        System.out.println("El resultado de la suma es:");
        System.out.println(miCalculadora.getZ());

        miCalculadora.restar();
        System.out.println("El resultado de la resta es:");
        System.out.println(miCalculadora.getZ());
        
        miTrigonometrica.coseno();
        System.out.println("El coseno de z es:");
        System.out.println(miTrigonometrica.getZ());
        
        
    }

}
