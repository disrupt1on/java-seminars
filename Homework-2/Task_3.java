import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String user_string = input.nextLine();
        input.close();
        System.out.println(palindrom(user_string));
    }

    public static boolean palindrom (String userString) {
        int i1 = 0;
        int i2 = userString.length()-1;
        while (i1 <= i2) {
            if (userString.charAt(i1) == userString.charAt(i2)) {
                i1++;
                i2--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
