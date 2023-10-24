package taha.ex9;

import java.util.Scanner;

public class Ex9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer a : ");
		float a = sc.nextFloat();
		System.out.println("entrer b : ");
		float  b = sc.nextFloat();
		float x = (-b/a);
		System.out.print("ax + b = ");
		System.out.println(x);
	}
}