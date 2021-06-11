package src;

import java.util.*;

public class ejercicio1{
	public static void main(String[] args){
		ejercicio1 ej = new ejercicio1();
	}
	
	//global a mi clase ejercicio1
	int[] elementos = new int[5];
	Scanner sn = new Scanner(System.in);
	
	public ejercicio1(){	
		for(int i = 0; i < 5; i++){
			pedirValor(i);
		}	
		for(int i = 0; i < 5; i++){
			mostrarDato(i);
		}
		double promedio = getPromedio();
		System.out.println("El promedio es: "+promedio);
	}
	
	public double getPromedio(){
		int total = 0;
		for(int i=0;i<5;i++){
			total += elementos[i];
		}
		
		double promedio = (double)total/5;
		return promedio;
	}
	
	public void mostrarDato(int numero){
		System.out.println("El indice es "+numero+ " el valor es: "+elementos[numero]);
	}
	
	public void pedirValor(int numero){
		
		System.out.println("\nIngrese el valor No. "+numero);
		elementos[numero] = sn.nextInt();
	}
}