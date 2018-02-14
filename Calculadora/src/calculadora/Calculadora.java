/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Calculadora {

   
    public static void main(String[] args) {
        
                Principal miCalculadora;
        miCalculadora = new Principal();

        Scanner miScanner;
        miScanner = new Scanner(System.in);

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
        

    }

}

