package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод, например (3 + 2):");
        while (true) {
        String input = scanner.nextLine();
            try {
                String result = calc(input);  
                System.out.println("Результат: " + result);  
            } catch (Exception e) {
                System.out.println("Ошибка " + e.getMessage()); 
                break;
            }
        }3
    }

    public static String calc(String input) throws Exception {
        
        input = input.trim();

        
        String[] parts = input.split(" ");

        
        if (parts.length != 3) {
            throw new Exception("Неверный формат);
        }

       
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        String operator = parts[1];

       
        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new Exception("Числа должны быть от 1 до 10 включительно.");
        }

       
        String result = "";
        switch (operator) {
            case "+":
                result = String.valueOf(a + b);
                break;
            case "-":
                result = String.valueOf(a - b);
                break;
            case "*":
                result = String.valueOf(a * b);
                break;
            case "/":

                result = String.valueOf(a / b); 
                break;
            default:
                throw new Exception("Неверная операия. Используйте +, -, *, /.");
        }
        return String.valueOf(result);

    }
}
