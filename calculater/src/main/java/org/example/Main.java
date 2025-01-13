package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите арифметическое выражение, например (3 + 2):");
        while (true) {
        String input = scanner.nextLine();
            try {
                String result = calc(input);  // Вызов метода для вычисления
                System.out.println("Результат: " + result);  // Вывод результата
            } catch (Exception e) {
                System.out.println("Ошибка " + e.getMessage());  // Ошибка
                break;
            }
        }3
    }

    public static String calc(String input) throws Exception {
        // Убираем лишние пробелы
        input = input.trim();

        // Разделяем строку по пробелам
        String[] parts = input.split(" ");

        // Проверяем, что строка разделена на 3 части: число, оператор, число
        if (parts.length != 3) {
            throw new Exception("Неверный формат. Используйте формат 'a операция b', например '3 + 2'.");
        }

        // Преобразуем числа из строк в целые числа
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        String operator = parts[1];

        // Проверяем, что числа находятся в диапазоне от 1 до 10
        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new Exception("Числа должны быть от 1 до 10 включительно.");
        }

        // Выполняем операцию в зависимости от знака
        String result = ""; // Объявляем переменную result только один раз
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

                result = String.valueOf(a / b);  // Целочисленное деление
                break;
            default:
                throw new Exception("Неверная операия. Используйте +, -, *, /.");
        }
        return String.valueOf(result);

    }
}