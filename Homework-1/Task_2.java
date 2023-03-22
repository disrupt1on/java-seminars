import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.print("Введите число, которое является последним для проверки: ");
        Scanner iScanner = new Scanner(System.in);
        int input = iScanner.nextInt();
        boolean b = true;
        iScanner.close();
        for (int i = 2; i <= input; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(i);
            else b = true;
        }
    } 
}