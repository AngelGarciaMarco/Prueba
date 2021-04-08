package Restaurante;

import java.util.InputMismatchException;
import java.util.Scanner;

import Peso.Peso;

public class RestauranteMain {

	public static void main(String[] args) {
		/**
		*declaracion de todas las variables 
		**/
		Scanner entrada=new Scanner(System.in);
		Restaurante r1 = new Restaurante();
		double apapa=0;
		double achoco=0;
		double bpapa=0;
		double bchoco=0;
		int clientes=0;
		int a=0;
		
		do {//creacion del bucle
		
		try {//creacion de el corrector de errores
			
			/**
			 * Seleccion de las opciones del menú
			 **/
			System.out.println("Que desea hacer");
			System.out.println("1)Añadir papas");
			System.out.println("2)Añadir chocos");
			System.out.println("3)Quitar papas");
			System.out.println("4)Quitar chocos");
			System.out.println("5)Enseñar a cuantos clientes podemos atender");
			a=entrada.nextInt();//Entrada de la seleccion del menú
			
		
		switch(a) {//creacion de switch
		case 1:/**
				*En este caso te dice cuantas papas tenemos en el almacen y cuantos kilos quieres añadir
				*Cogemos el valor por el parametro de entrada
				*Y añadimos papas con el metodo añadirpapas
				*Despues muestra por pantalla las papas que tenemos 
				**/
		System.out.println("Tenemos " + apapa + " de papas en el almacen");
		System.out.println("¿Cuantos kilos de papas quieres añadir?");
		r1.setBpapa(entrada.nextDouble());
		r1.añadirpapas();
		System.out.println("Tenemos " + r1.getApapa() + "de papas en el almacen");
		r1.getApapa();
		
		break;
		
		case 2:/**
				*Hace lo mismo que el caso uno pero con chocos
				**/
		System.out.println("Tenemos " + achoco + " de choco en el almacen");
		System.out.println("¿Cuantos kilos de choco quieres añadir?");
		r1.setBchoco(entrada.nextDouble());
		r1.añadirchoco();
		System.out.println("Tenemos " + r1.getAchoco() + " de chocos en el almacen");
		
		break;
		
		case 3:/**
				*En la opcion 3 pregunta cuantos kilos se han estropeado
				*Con el valor de entrada lo recoge 
				*Y muestra los kilos de papa que quedan en el almacen
				**/
		System.out.println("Cuantos kilos de papas se han estropeado");
		r1.setBpapa(entrada.nextDouble());
		r1.quitarpapas();
		System.out.println("Tenemos " + r1.getApapa() + " de papas en el almacen");
		
		break;
		
		case 4:/**
			*Hace lo mismo que el caso tres pero con chocos
			**/
		System.out.println("Cuantos kilos de choco se han estropeado");
		r1.setBchoco(entrada.nextDouble());
		r1.quitarchoco();
		System.out.println("Tenemos " + r1.getAchoco() + " de choco en el almacen");
		r1.clientes();
		break;
		
		case 5:/**
			*En el caso 5 muestra la cantidad de clientes que puedes dar de comer
			**/
		r1.clientes();
		
		break;
		default:/**
			*El mensaje que sale si pones un valor que no corresponde en el switch
			**/
			System.out.println("Error");
			break;
		}
		
		}catch(InputMismatchException e) {//El mensaje que muestra si pones una letra 
			entrada.nextLine();System.out.println("No esta permitido poner letras");
		}
		
		}while(a!=5);/**
					*Acaba el bucle 
					**/
		
	}

}/**
	*Acaba el programa
	**/
