package taha.ex2;

import java.util.Scanner;

public class Minplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours between 0 and 23 : ");
        int hrs = sc.nextInt();
        System.out.println("Enter minutes between 0 and 59 : ");
        int min = sc.nextInt();
        if (min == 59) {
            min = 0;
            hrs = hrs + 1;
            System.out.print("hours is ");
            System.out.print(hrs);
            System.out.print(" and next min is ");
            System.out.print(min);
        } else {
            min = min + 1;
            System.out.print("hours is ");
            System.out.print(hrs);
            System.out.print(" and next min is ");
            System.out.print(min);
        }
    }
}