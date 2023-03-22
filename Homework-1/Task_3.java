import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = iScanner.nextInt();
        System.out.print("Введите знак операции: ");
        String sign = iScanner.next();
        System.out.print("Введите второе число: ");
        int num2 = iScanner.nextInt();
        iScanner.close();
        int result = 0;
        switch(sign) {
            case "+": result = num1 + num2;
               break;
            case "-": result = num1 - num2;
               break;
            case "*": result = num1 * num2;
               break;
            case "/": result = num1 / num2;
               break;
            default:  System.out.printf("Ошибка, некорректная операция");
               return;
        }
        System.out.println("Результат = " + result);
    }
}
