package taha.ex4;

import java.util.Scanner;

public class Ex4{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("pour homme entrer M / pour femme entrer F:");
		char ktb=sc.next().charAt(0);
		System.out.println("entrer l'age : ");
		int age=sc.nextInt();
		if((ktb=='M')&&(age >= 20)) {
			System.out.println("avec impot");
		} else if ((ktb=='F')&&((age <=35)&&(age >= 18))) {
			System.out.println("avec impot");
		} else {
			System.out.println("sans impot");
		}
	}
}