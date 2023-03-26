import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class Task_1 {
    public static void main(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(Task_1.class.getName());
        FileHandler file_log = new FileHandler("log.txt");
        logger.addHandler(file_log);
        SimpleFormatter format_txt = new SimpleFormatter();
        file_log.setFormatter(format_txt);

        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов числового массива: ");
        int array_size = input.nextInt();
        int array[] = new int[array_size];

        System.out.println("Введите значения элементов числового массива:");

        for (int i = 0; i < array_size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Получен массив: ");
        System.out.println(Arrays.toString(array));
        input.close();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    logger.log(Level.INFO, "Замена элемента " + temp + " на элемент " + array[j]);
                    array[j + 1] = temp;

                }
            }
        }

        System.out.print("Итоговый массив: ");
        System.out.println(Arrays.toString(array));

    }
}
