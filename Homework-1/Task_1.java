
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = iScanner.nextInt();
        int triangular_number = 0;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            triangular_number += i;
            factorial *= i;
        }
        iScanner.close(); 
        System.out.println("Треугольное число: " + triangular_number);
        System.out.println("Факториал: " + factorial);
    }
}