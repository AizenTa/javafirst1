package taha.ex1;

import java.util.Scanner;

public class Ex1_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number : ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("number is pair.");
        } else {
            System.out.println("number is impair");
        }
    }
}
