package taha.ex7;

import java.util.Scanner;

public class Ex7{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Entrer le nombre qui vous voulez : ");
		int n = sc.nextInt();
		if(n%3==0) {
			System.out.print(n);
			System.out.println(" est divisible par 3.");
		} else {
			System.out.print(n);
			System.out.println(" n'est divisible par 3.");
		}
	}
}