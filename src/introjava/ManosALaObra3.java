/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Juanfra
 */
public class ManosALaObra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new Scanner(System.in);
            
        String nombre;
        System.out.println("Ingrese 2 numeros");
        num1=leer.nextInt();
        num2=leer.nextInt();
    int suma=num1+num2;
    double divi=num1/num2;
    int mult=num1*num2;
    int modulo=num1 % num2;
    int resta=num1-num2;
    System.out.println("Los numeros ingresados son " + num1 + " y " + num2 );
    System.out.println("La resta entre ambos numeros es " + resta);
    System.out.println("La suma entre ambos numeros es " + suma);
    System.out.println("La multiplicacion entre ambos numeros es " + mult);
    System.out.println("La division entre ambos numeros es " + divi);
    System.out.println("El modulo de 5 mod 5 es " + modulo);    
    }
}
