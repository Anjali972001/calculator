package Anjali;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // using infinite loop.
        System.out.println("Enter the input ");
        int ans = 0;
        while (true) {//if we are using infinite loop the we need to breAK IT ALSO.
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/') {
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num2 * num1;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                } else if (op == 'x' || op == 'X') {
                    break;
                } else {
                    System.out.println("Invalid operator");
                }


            }
            System.out.println("Your answer is " + ans);

        }
    }
}


