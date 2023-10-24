package taha.ex11;

import java.util.Scanner;

public class Ex11{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("entrer le 1 er nombre : ");
		int a = sc.nextInt();

		System.out.print("entrer le 2 eme nombre : ");
		int b = sc.nextInt();

		System.out.print("entrer le 3 eme nombre : ");
		int c = sc.nextInt();
		
		if ( (a > b) && (a > c)) {
			System.out.print(a);
			System.out.println(" est le plus grand.");
		} else if ((b > a) && (b > c)) {
			System.out.print(b);
			System.out.println(" est le plus grand.");
		} else {
			System.out.print(c);
			System.out.println(" est le plus grand.");
		}
		
		if ( (a < b) && (a < c)) {
			System.out.print(a);
			System.out.println(" est le plus petit.");
		} else if ((b < a) && (b < c)) {
			System.out.print(b);
			System.out.println(" est le plus petit.");
		} else {
			System.out.print(c);
			System.out.println(" est le plus petit.");
		}
		
	
	}
}