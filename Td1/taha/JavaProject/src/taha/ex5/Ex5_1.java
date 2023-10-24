package taha.ex5;


import java.util.Scanner;

public class Ex5_1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number : ");
		int n = sc.nextInt();
		int som = 0 ;
		for (int i = 0 ; i <=n ; i++) {
			som+=i;
		}
		System.out.println("la somme est  : ");
		System.out.println(som);
	}
	
}