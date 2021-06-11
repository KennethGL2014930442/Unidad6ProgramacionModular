package src;

import java.util.*;

public class ejercicio2{
	public static void main(String[] args){
		ejercicio2 ej = new ejercicio2();
	}
	
	int[] aleatorios = new int[10];
	int mayor;
	
	Scanner sn = new Scanner(System.in);
	
	public ejercicio2(){
		for (int i = 0; i <= 9; i++){
			llenarAleatorios(i);
		}
		
		encontrarMayor();
		darRepeticionesMayor();
	}
	
	public void llenarAleatorios(int numero){
		aleatorios[numero] = (int)(Math.random()*99+1);
		System.out.println("El indice es "+numero+" el valor es: "+aleatorios[numero]);
	}
		
	public void encontrarMayor(){
		int mayor = 0;
		
		for(int i = 0; i < aleatorios.length; i++){
			if( aleatorios[i] > mayor){
				mayor = aleatorios[i];
			}
		}
		System.out.println("El valor mas grande del arreglo es: "+mayor);
	}
		
		public void darRepeticionesMayor(){
			
			int contador=0;
			for	(int i = 0; i < aleatorios.length; i++){
				if (mayor==aleatorios[i]){
					mayor++;
				}			
			}
			System.out.println("El numero mayor se repite "+mayor+" veces");
			
		}
		
	}	
	


