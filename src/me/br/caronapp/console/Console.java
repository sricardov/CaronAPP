package me.br.caronapp.console;

import java.util.Scanner;

/* Implementado por Eperson Cardoso Mayrink Xavier Filho */

public class Console {
	
	Scanner scan;
	int stage = 0;
	
	public Console() {
		scan = new Scanner(System.in);
		stage = 0;
	}
	
	public boolean draw() {
		
		switch (stage) {
		case 0:
			System.out.println("Decida o que fazer:\n1 - ");
			stage = scan.nextInt();
			break;
		case 1:
			break;
		case 2:
			break;
		default:
			System.out.println("Finalizando console.");
			scan.close();
			break;
		}
		
		
		return true;
	}
	
}
