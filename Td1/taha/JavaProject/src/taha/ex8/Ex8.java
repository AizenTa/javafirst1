package taha.ex8;

import java.util.Scanner;

public class Ex8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer le nombre qui vous voulez : ");
		int n = sc.nextInt();
		if ( n > 0) {
			n = n; 
			System.out.print(n);
			System.out.println(" est la valeur absolue.");
		} else {
			n = -n;
			System.out.print(n);
			System.out.println(" est la valeur absolue.");	
		}
	}
}