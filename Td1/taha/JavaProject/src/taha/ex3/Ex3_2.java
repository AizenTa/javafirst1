package taha.ex3;

import java.util.Scanner;

public class Ex3_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write your number : ");
		int x = sc.nextInt();
		int s=0;
			for(int i = 1 ; i < x ; i++) {
				if(x%i==0) {
					s+=1;
					} else {
					s=s;
					}
				}
		if(s>=3) {
				System.out.println(x);
				System.out.println(" est non premier");
		} else {
				System.out.println(x);
				System.out.println("est premier");
		}
	}
}