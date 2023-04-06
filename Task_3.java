import java.util.ArrayList;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> results = new ArrayList<>();

        while (true) {
            System.out.println("Введите первую переменную:");
            double num1 = scanner.nextDouble();

            System.out.println("Введите знак операции (+, -, *, /):");
            char operator = scanner.next().charAt(0);

            System.out.println("Введите вторую переменную:");
            double num2 = scanner.nextDouble();

            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Неверный знак операции.");
                    continue;
            }
            results.add(result);
            System.out.println("Результат: " + result);

            System.out
                    .println("Введите 'отмена' для отмены последней операции или любую другую строку для продолжения:");
            String cancel = scanner.next();
            if (cancel.equalsIgnoreCase("отмена")) {
                if (results.size() > 0) {
                    results.remove(results.size() - 1); 
                    System.out.println("Последняя операция была успешно отменена.");
                } else {
                    System.out.println("Нет операций для отмены.");
                }
            }
            System.out.println("Результаты всех операций:");
            for (double res : results) {
                System.out.println(res);
            }

            System.out.println("Введите 'выход' для завершения программы или любую другую строку для продолжения:");
            String exit = scanner.next();
            if (exit.equalsIgnoreCase("выход")) {
                System.out.println("Программа завершена.");
                break; 
            }
        }
    }
}
