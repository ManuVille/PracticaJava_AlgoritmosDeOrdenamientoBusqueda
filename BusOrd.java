
/*Explicacion e implementacion de algoritmos de busqueda y ordenamiento*/
package busord;

import java.util.Scanner;


public class BusOrd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[] = {9,1,8,2,7,3,6,4,5,0};
        int arregloOrdenado[] = {1,2,3,4,5,6,7,8,9,10};
        Secuencial sec = new Secuencial();
        Binario bin = new Binario();
        Burbuja bur = new Burbuja();
        int banderaOpcion = 0; /*bandera de Menu Principal*/
        int banderaSubopcion = 0; /*bandera de menu interno*/
        Scanner entrada = new Scanner(System.in);
        
        while(banderaOpcion != 4){
        
            System.out.println("***MENU DE ALGORITMOS***");
            System.out.println("Seleccione el tipo: ");
            System.out.println("- 1. Busqueda -");
            System.out.println("- 2. Ordenamiento -");
            System.out.println("- 3. Mostrar Arreglo -");
            System.out.println("- 4. Salir -");
            System.out.print("\n-> Seleccion: ");
            banderaOpcion = entrada.nextInt();
            
           
            if(banderaOpcion == 1){ /*menu de algoritmos de Busqueda*/
                while(banderaSubopcion != 3){
                    System.out.println("\n***MENU DE ALGORITMOS DE BUSQUEDA***");
                    System.out.println("Seleccione el tipo: ");
                    System.out.println("- 1. Secuencial -");
                    System.out.println("- 2. Binario -");
                    System.out.println("- 3. Salir -");
                    System.out.print("\n-> Seleccion: ");
                    
                    banderaSubopcion = entrada.nextInt();
                    
                    switch(banderaSubopcion){
                    
                        case 1:
                            sec.busquedasecuencial(arreglo);
                            break;
                        case 2:
                            bin.busquedaBinaria(arregloOrdenado);
                            break;
                        
                         
                        default:break;
                        
                    }
                   
                }/* Fin de while Subopcion*/
                System.out.println("\n...Saliendo del menu de ALGORITMOS DE BUSQUEDA...\n");
                System.out.println("\n\n");
            }/*fin de If del menu subinterno*/
            
            if(banderaOpcion == 2){ /*menu de algoritmos de Ordenamiento*/
                while(banderaSubopcion != 4){
                    System.out.println("\n***MENU DE ALGORITMOS DE ORDENAMIENTO***");
                    System.out.println("Seleccione el tipo: ");
                    System.out.println("- 1. Burbuja -");
                    System.out.println("- 2. Insercion -");
                    System.out.println("- 3. Quicksort-");
                    System.out.println("- 4. Salir -");
                    System.out.print("\n-> Seleccion: ");
                    
                    banderaSubopcion = entrada.nextInt();
                    
                    switch(banderaSubopcion){
                    
                        case 1:
                            int arreglo1[] = arreglo;
                            bur.OrdenamientoBurbuja(arreglo1);
                            break;
                        case 2:
                            
                            break;
                        
                         
                        default:break;
                        
                    } 
                }/* Fin de while Subopcion*/
                System.out.println("\n...Saliendo del menu de ALGORITMOS DE ORDENAMIENTO...\n");
                System.out.println("\n\n");
            }/*fin de If del menu subinterno*/
            
            if(banderaOpcion == 3){ /*mostrar arreglo*/
                int cantidadElementos = arreglo.length;
                System.out.println("\n.....\n");
                System.out.println("El arreglo consta de "+cantidadElementos+" Elementos.");
                for(int i = 0; i < cantidadElementos; i++){
                    System.out.print("[" + arreglo[i] + "]");
                }
                System.out.println("\n.....\n");
                banderaSubopcion = 0;
            }/*fin de If del menu subinterno*/
                if(banderaOpcion > 4 || banderaOpcion < 0){
                    System.out.println("\nERROR. Opcion Inexistente\n");
                }
        }/* Fin While Menu Principal*/
    } /*main*/
    
}
