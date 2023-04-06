import java.util.LinkedList;
import java.util.Scanner;

public class Task_1 {

    static LinkedList<String> flip(LinkedList<String> linked_list) {
        LinkedList<String> new_linked_list = new LinkedList<>();
        while (!linked_list.isEmpty()) {
            new_linked_list.add(linked_list.getLast());
            linked_list.removeLast();
        }
        return new_linked_list;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> linked_list = new LinkedList<>();
        System.out.print("Введите количество элементов: ");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("Введите значение элемента: ");
            String text = scanner.next();
            linked_list.add(text);
        }
        scanner.close();
        System.out.println("Начальный список: " + linked_list);
        System.out.println("Перевернутый список: " + flip(linked_list));
    }
}
