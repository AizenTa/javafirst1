package taha.ex5;

import java.util.Scanner;

public class Ex5_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number  :");
		int n = sc.nextInt();
		int som = 0;
		for (int i = 1 ; i <= n ; i++) {
			if (i%2==0) {
				som+=i;
			}else {
				som=som;
			}
		}
		System.out.println("somme des nombres pairs est : ");
		System.out.println(som);
	}
}