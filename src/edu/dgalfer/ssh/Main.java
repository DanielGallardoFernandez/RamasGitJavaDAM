package edu.dgalfer.ssh;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		//Investiga el uso de random y genera por pantalla los números de la lotería primitiva.
        Random rnd = new Random();
        // Genera 5 números principales
        int p1 = rnd.nextInt(0,4)+1;
        int p2 = rnd.nextInt(0,4)+1;
        int p3 = rnd.nextInt(0,4)+1;
        int p4 = rnd.nextInt(0,4)+1;
        int p5 = rnd.nextInt(0,4)+1;
        
        
        // Número complementario
        int c = rnd.nextInt(0,20)+1;
        System.out.println("Números de la Lotería Primitiva:" + p1 + p2 + p3 + p4 + p5+c);
        System.out.println("¡Buena suerte en el sorteo!");
		System.out.println("Cambio realizado desde GitHub.");
	}

}
