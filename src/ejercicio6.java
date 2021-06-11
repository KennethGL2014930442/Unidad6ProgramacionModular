package src;
public class ejercicio6{

    public static void main(String args[]){
    
    int elementos [][] = new int [3][3];
    
        elementos[0][0] = 5;
        elementos[0][1] = 6;
        elementos[0][2] = 13;
        elementos[1][0] = 14;
        elementos[1][1] = 2;
        elementos[1][2] = 4;
        elementos[2][0] = 21;
        elementos[2][1] = 7;
        elementos[2][2] = 6;

        System.out.print("\n [ "+(elementos[0][0]+" ] "));
        System.out.print(" [ "+(elementos[0][1]+" ] "));
        System.out.println(" [ "+(elementos[0][2]+" ]\n "));
        System.out.print(" [ "+(elementos[1][0]+" ] "));
        System.out.print(" [ "+(elementos[1][1]+" ] "));
        System.out.println(" [ "+(elementos[1][2]+" ]\n"));
        System.out.print(" [ "+(elementos[2][0]+" ] "));
        System.out.print(" [ "+(elementos[2][1]+" ] "));
        System.out.print(" [ "+(elementos[2][2]+" ] \n"));

        System.out.println("\nLa matriz multiplicada por 2 es \n");
        
        elementos[0][0] = 5*2;
        elementos[0][1] = 6*2;
        elementos[0][2] = 13*2;
        elementos[1][0] = 14*2;
        elementos[1][1] = 2*2;
        elementos[1][2] = 4*2;
        elementos[2][0] = 21*2;
        elementos[2][1] = 7*2;
        elementos[2][2] = 6*2;
    
        System.out.print("\n [ "+(elementos[0][0]+" ] "));
        System.out.print(" [ "+(elementos[0][1]+" ] "));
        System.out.println(" [ "+(elementos[0][2]+" ]\n "));
        System.out.print(" [ "+(elementos[1][0]+" ] "));
        System.out.print(" [ "+(elementos[1][1]+" ] "));
        System.out.println(" [ "+(elementos[1][2]+" ]\n"));
        System.out.print(" [ "+(elementos[2][0]+" ] "));
        System.out.print(" [ "+(elementos[2][1]+" ] "));
        System.out.print(" [ "+(elementos[2][2]+" ] \n"));

        
    }
}
   