package src;
public class ejercicio9 {
    
    int[][] matriz1 =  new int [3][3] ;
    int[][] matriz2 =  new int [3][3] ;
    int[][] matrizResultado =  new int [3][3] ;
    
    
 
    
    public static void main (String [] args ){
            
          ejercicio9 ejercicio9 = new ejercicio9();
       }
  
    public ejercicio9 (){
      
      
        primerMatriz();
        segundaMatriz ();
        
        sumaMatrices();
         
        impresionMatrices ();
    
        
    }
    
    
    public void primerMatriz (){
    
        for (int i = 0; i < matriz1.length; i++) {
            
            for (int j = 0; j < matriz1.length; j++) {
                
                matriz1 [i][j] = (int)(Math.random()*10+1);
            }
            
        }
    }
    
    
    
    public void segundaMatriz () {
        for (int i = 0; i < matriz2.length; i++) {
            
            for (int j = 0; j < matriz2.length; j++) {
                
                matriz2 [i][j] = (int)(Math.random()*10+1);
            }
            
        }
    
    
    }
    
    
    public void sumaMatrices ( ){
          
        for (int i = 0; i < matriz1.length; i++) {
            
            for (int j = 0; j < matriz2.length; j++) {
                
                    matrizResultado [i][j] =  matriz1 [i][j] + matriz2 [i][j];
                
            } 
            
           
     }
        
    }
        
         

    
    
    public void impresionMatrices (){
        
        for (int i = 0; i < matriz1.length; i++) {
            
            for (int j = 0; j < matriz1.length; j++) {
                
                System.out.print (" ["+ matriz1[i][j]+"]");
                
            }
            
                if ( i == 1){
                     System.out.print("  +   ");
                }else{
                     System.out.print("      ");
                }
            
           
            
             for (int j = 0; j < matriz2.length; j++) {
                
                System.out.print ("["+ matriz2[i][j]+"]");
            }
            
            
             if ( i == 1){
                     System.out.print("  =   ");
            }else{
                     System.out.print("      ");
            }
             
            for (int j = 0; j < matrizResultado.length; j++) {
                
                System.out.print (" ["+ matrizResultado[i][j]+"]");
            }
            
            System.out.println ("");
        }
    
    }
  
}
