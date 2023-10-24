package taha.ex10;

import java.util.Scanner;

public class Ex10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer le nombre qui vous voulez : ");
		int t = sc.nextInt();
		if ( t < 0) {
			System.out.println("Glace");
		} else if (t > 100) {
			System.out.println("Vapeur");
		} else { 
			System.out.println("Eau");
		}
	}
}