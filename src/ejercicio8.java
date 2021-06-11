package src;
import java.util.*;
public class ejercicio8{
    
    String[] palabra1 = new String[5];
    String[] palabra2 = new String[5];
    Scanner entrada = new Scanner (System.in);
    
    public static void main(String args[]){
    ejercicio8 ejercicio = new ejercicio8();
        
    }
    
    public ejercicio8(){
        for (int i = 0; i < 5; i++) {
            solicitarPalabrasArreglo_Uno(i);
        }
        System.out.println("\n");
        for (int i = 0; i < 5; i++) {
            solicitarPalabrasArreglo_Dos(i);
        }
       comparar();
    }
    
   
     public void comparar(){
         boolean iguales= true;
        for (int i = 0; i < palabra1.length && iguales; i++) {
            if (palabra1[0] == palabra2[0]) {
                iguales = false;

            }
        }
        int indice=0;
        int i =0;
         if (iguales) {
             System.out.println("\nIndice:"+indice+ " \nTamañno letra: "+palabra1[i].length()+"\nSon iguales");  
             
         }else{
              System.out.println("No son iguales");
         }

    }
     public void solicitarPalabrasArreglo_Uno( int numero){
        
        System.out.print("Ingrese palabra "+(numero+1)+" Arreglo 1: ");

        int palabra = 0;
        palabra1[palabra]= entrada.nextLine(); 
        
    }

     public void solicitarPalabrasArreglo_Dos( int numero){
        
         System.out.print("Ingrese palabra "+(numero+1)+" Arreglo 2: ");
        int palabra = 0;
        palabra1[palabra]= entrada.nextLine();
        
        
        
    }
    
    
}