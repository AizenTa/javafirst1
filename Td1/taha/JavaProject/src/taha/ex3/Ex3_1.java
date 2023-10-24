package taha.ex3;

import java.util.Scanner;

public class Ex3_1{
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("write your number:");
			int x = sc.nextInt();
			int s = 0;
			for(int i = 1; i < x; i++) {
				if(x % i == 0) {
					s += i;
				}
			}
			if (s==x) {
				System.out.println("perfect");
			} else {
				System.out.println("not perfect");
			}
		}
}