/*
Exercise 2:
        Given 3 int values, a b c, print to console their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count.
        So for example, if b is 13, then both b and c do not count.
        Example:
        int a = 1;
        int b = 13;
        int c = 2;

        should print 1
*/

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {

        int a, b, c;
        int sum = 0;

        Scanner s = new Scanner(System.in);
        System.out.print("Input first number: ");
        a = s.nextInt();
        System.out.print("Input second number: ");
        b = s.nextInt();
        System.out.print("Input third number: ");
        c = s.nextInt();

        if (a != 13) {
            sum = a;
            if (b != 13) {
                sum += b;
                if (c != 13) {
                sum += c;
                }
            }
        }
        System.out.println("Sum: " + sum);
    }
}
