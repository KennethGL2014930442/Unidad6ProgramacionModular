package src;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        ejercicio5 ejercicio = new ejercicio5(); 

    }
    Scanner scanner = new Scanner(System.in);
    int numero[] = new int[valorI()];
    int cant=0,total=0;


    public ejercicio5(){
        System.out.println("ingrese cuantos grupos de notas desea calcular la media");
        int rep = scanner.nextInt(); 
        do{
            perdirNumero();
            System.out.println("la media es "+promedio(cant,total));
            rep--;
        }while(rep > 0);
        

    }


    public void perdirNumero() {
        int numAux = 0;
        
        System.out.println("solo acepta notas de 1 a 10");
        System.out.println("para terminar de ingresar notas, digite -50");
        for (int i = 0; i < numero.length; i++){
            System.out.print("ingrese la nota "+ (i+1)+". --  ");
            numAux= scanner.nextInt();
            if(numAux != -50){
                if(numAux <= 10 && 1<= numAux ){
                    numero[i] = numAux;
                    total+=numAux;
                    cant++;
                }
            }else{
                break;
            }
            
        }

    }

    public int promedio(int cant, int total){
        int promedio= total/cant;
        return promedio;
    }
    public int valorI(){
        return 100;
    }
}
