package taha.ex2;

import java.util.Scanner;

public class Secplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours between 0 and 23 : ");
        int hrs = sc.nextInt();
        System.out.println("Enter minutes between 0 and 59 : ");
        int min = sc.nextInt();
        System.out.println("Enter seconds between 0 and 59: ");
        int sec = sc.nextInt();
        if (min == 59 && sec == 59) {
            min = 0;
            sec = 0;
            hrs = hrs + 1;
            System.out.print("hours is ");
            System.out.print(hrs);
            System.out.print(" and next min is ");
            System.out.print(min);
            System.out.print(" and second is ");
            System.out.print(sec);
        } else if (min != 59 && sec == 59) {
            min = min + 1;
            sec = 0;
            System.out.print("hours is ");
            System.out.print(hrs);
            System.out.print(" and next min is ");
            System.out.print(min);
            System.out.print(" and second is ");
            System.out.print(sec);
        } else {
            sec = sec + 1;
            System.out.print("hours is ");
            System.out.print(hrs);
            System.out.print(" and next min is ");
            System.out.print(min);
            System.out.print(" and second is ");
            System.out.print(sec);
        }
    }
}
