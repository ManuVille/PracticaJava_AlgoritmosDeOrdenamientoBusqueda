
package busord;

import java.util.Scanner;


public class Binario {
    /*atributos*/
    int inferior, superior, mitad;
    boolean bandera = false;
    
    public void busquedaBinaria(int[] arreglo){
    
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nArreglo: ");
        for(int i = 0; i < arreglo.length; i++){
                    System.out.print("[" + arreglo[i] + "]");
                }
        System.out.println("\n¿Que valor desea encontrar?");
        int buscar = entrada.nextInt();/*Valor a buscar en el arreglo*/
        
        /*Algoritmo de busqueda Binaria*/
        
        inferior = 0;
        superior = arreglo.length;
        while(inferior <= superior){
        
            mitad = (inferior + superior)/2;
            
            if(arreglo[mitad] == buscar){ /*ya se encontro el valor*/
                bandera = true;
                break;
            }
            if(arreglo[mitad] > buscar){
                superior = mitad;
                mitad = (inferior+superior)/2;
            }
            if(arreglo[mitad] < buscar){
                inferior = mitad;
                mitad = (inferior+superior)/2;
            }
        }/*End while*/
        if(bandera){
            System.out.println("Se a encontrado el valor ["+buscar+"] en la posicion: ["+mitad+"].");
        }
        
    }
}
