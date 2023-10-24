package taha.ex3;

import java.util.Scanner;

public class Ex3_3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write your first number : ");
		int x = sc.nextInt();
		System.out.println("write your second number : ");
		int y = sc.nextInt();
		int z = 1;
		if (x < y) {
			for (int j = 2 ; j <= x ; j++) {
				if ((x%j==0)&&(y%j==0)) {
					z = j;
				}
			}
		} else {
			for (int i = 2; i <= y ; i++) {
				if ((x%i==0)&&(y%i==0)) {
					z = i;
				}
		}
	}
		System.out.println("le pgcd est : ");
		System.out.println(z);
	}
}