
package busord;


public class Burbuja {
    
    
    public void OrdenamientoBurbuja(int[] arreglo1){
        
        int aux = 0;
        int arreglo[] = arreglo1;
        
        System.out.println("\n####### ALGORITMO DE BURBUJA EJECUTANDOSE: ########");
        System.out.println("\n--> Arreglo Desordenado: ");
        for(int i = 0; i < arreglo.length; i++){
                    System.out.print("[" + arreglo[i] + "]");
                }
        System.out.println("\n");
        
        /*Metodo de burbuja*/
        for(int i = 0; i < (arreglo.length - 1); i++){
            for(int j = 0; j < (arreglo.length - 1); j++){
                if(arreglo[j] > arreglo[j+1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        
        System.out.println("\n--> Arreglo Ordenado: ");
        for(int i = 0; i < arreglo.length; i++){
                    System.out.print("[" + arreglo[i] + "]");
                }
        System.out.println("\n");
        
        System.out.println("\n####### FIN DE EJECUCION DEL ALGORITMO DE BURBUJA: ########");
        
    }
}
