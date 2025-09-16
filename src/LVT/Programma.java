package LVT;

import java.util.Random;
import java.util.Scanner;

public class Programma {
		
	static void mestKaulinu(int reizes) {
		int skaitlis;
		int [] skaituSkaits = new int[6];
		Random rand = new Random();
		for (int i=1; i<=reizes; i++) {
		skaitlis = rand.nextInt(6)+1;
		skaituSkaits[skaitlis -1]++;
		System.out.println("Uzkrita skaitlis: "+skaitlis);
		}
		System.out.println("\nMetienu statistika: ");
		for(int i=0; i< skaituSkaits.length; i++) {
			double procenti = (skaituSkaits[i] * 100.0) / reizes;
			System.out.printf("%d: %d rezies (%.2f%%)\n", i + 1, skaituSkaits[i], procenti);
		}
	}

	
	
	public static void main(String[] args) {
		System.out.println("Esi sveicināts manā metamā kauliņa programma!");
		int reizes;
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reizes mest kaulinu?");
		reizes = scan.nextInt();
		mestKaulinu(reizes);
		scan.close();
		
	
	}
}
