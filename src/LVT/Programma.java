package LVT;

import java.util.Random;
import java.util.Scanner;

public class Programma {
		
	static void mestKaulinu(int reizes) {
		int skaitlis;
		Random rand = new Random();
		for (int i=1; i<=reizes; i++) {
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzkrita skaitlis: "+skaitlis);
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
