package src;
public class ejercicio4 {

    int[] valores = new int[10];   

    public static void main (String [] argss){

        ejercicio4 ejercicio4 = new ejercicio4();
    }


    public ejercicio4 (){

        int distancia;
       
        for (int i = 0 ;  i < 10 ; i++){

            valores[i] = obtenerAleatorio(i);
            System.out.println (" El indice es "+i+ " el valor es = "+valores[i]);
        }

         System.out.println("-------------------------------------------");
         diferenciaNumeros();
    }

    public int obtenerAleatorio (int aleatorio){

        aleatorio = (int)(Math.random()*15+1);
        return aleatorio;
    } 

    public void diferenciaNumeros ( ){

        int distancia;
        for (int i = 0; i < 10; i++) {

             distancia =  15 - valores[i];
            System.out.println(" La distancia entre "+ 15 + " - "+ valores[i] +" es : "+distancia);
        }
    } 
}