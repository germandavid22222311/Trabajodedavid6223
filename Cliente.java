package Patronestrategia;

import java.util.Scanner;

public class Cliente {
private static Object lavadora;
private static Scanner in;



public static void main(String[] args) {
		
		ControlPanel controlPanel = new ControlPanel();
		int opcion;
		do {
			opcion = Menu1();
			if (opcion != 7) {
				controlPanel.SeleccionControl(opcion-1);
			}
			
		}while (opcion!=7);
		
	}
	public static int Menu1() {
		int opcion = 0;
		in = new Scanner(System.in);
		do {
			System.out.println("Seleccione alguna Opcion:");
			System.out.println("1.Encender Lavadora");
			System.out.println("2.Enjuagar Lavadora");
			System.out.println("3.Secar Lavadora");
			System.out.println("4.Temperatura Lavadura");
			System.out.println("5.Apagar Lavadora");
			opcion = in.nextInt();
			if (opcion < 1 || opcion > 5) {
				System.out.println("Opcion incorrecta intente de nuevo");
			}
			
		}while(opcion < 1 || opcion > 5);
		return opcion;
	}
		
	
	
	public static Object getLavadora() {
		return lavadora;
	}
	public static void setLavadora(Object lavadora) {
		Cliente.lavadora = lavadora;
	}

}//MAIN

