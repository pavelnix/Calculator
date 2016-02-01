package ru.pavelnix;

import java.util.Scanner;

/**
 * Class starts the calculator. It supports user input .
 */
public class InteractRunner {
    public static void main(String[] arg) {
        Scanner reader = new Scanner(System.in);
        Calculator calc = new Calculator();
        String exit;
        String use = "no";
        String args;
        float first;
        float second;
        float result = 0;
        do {
            if (use.equals("yes")) {
                first = result;
            } else {
                System.out.println("Enter first arg : ");
                args = reader.next();
                first = Float.valueOf(args);
            }
            System.out.println("Enter second arg : ");
            args = reader.next();
            second = Float.valueOf(args);
            System.out.println("Enter operation (+ - / *): ");
            String operation = reader.next();
            switch (operation) {
                case "+":
                    result = calc.sum(first, second);
                    break;
                case "-":
                    result = calc.minus(first, second);
                    break;
                case "/":
                    result = calc.div(first, second);
                    break;
                case "*":
                    result = calc.mult(first, second);
                    break;
            }
            System.out.println("Result : " + result);
            System.out.println("Exit : yes/no ");
            exit = reader.next();
            System.out.println("Use result in next operation: yes/no");
            use = reader.next();
        } while (!exit.equals("yes"));
    }
}
