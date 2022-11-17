
package busord;

import java.util.Scanner;


public class Secuencial {
    /*Atributos*/
    
    /*Metodos*/
    public void busquedasecuencial(int[] arreglo){
        Scanner entrada = new Scanner(System.in);
        int pos = 0; /*Posicion del numero solicitado*/
        int bandera = 0; /*bandera para senalar que se encontro el valor*/
        System.out.print("\nArreglo: ");
        for(int i = 0; i < arreglo.length; i++){
                    System.out.print("[" + arreglo[i] + "]");
                }
        System.out.println("\n¿Que valor desea encontrar?");
        int buscar = entrada.nextInt();/*Valor a buscar en el arreglo*/
        /*Algoritmo de busqueda Secuencial*/
        for(int i = 0; i < arreglo.length; i++){
                if(buscar == arreglo[i]){/*Si el valor de Buscar es igual al valor de la posicion i del arreglo...*/
                    System.out.println("El valor: ["+buscar+"] se encontró en la posicion: "+i+ " del arreglo.");
                    bandera = 1;
                    break;
                }
            }
        if(bandera == 0){
            System.out.print("No se encuentra el valor: [" + buscar + "] en el arreglo.");
        }
    }
}
