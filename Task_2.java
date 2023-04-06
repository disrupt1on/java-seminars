import java.util.LinkedList;
import java.util.Scanner;

public class Task_2 {

    static LinkedList<String> enqueue (LinkedList<String> linkedList, String i) {
        linkedList.addLast(i);
        return linkedList;
    }

    static String dequeue (LinkedList<String> linkedList) {
        return ("Первый элемент в очереди: " + linkedList.pop() + ", cписок после удаления элемента: " + linkedList);
    }

    static String first (LinkedList<String> linkedList) {
        return ("Первый элемент в очереди: " + linkedList.getFirst());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> linked_list = new LinkedList<>();
        System.out.print("Введите количество элементов списка LinkedList: ");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("Введите значение элемента: ");
            String text = scanner.next();
            linked_list.add(text);
        }
        System.out.println("Получен список: " + linked_list);
        System.out.print("Выберите действие:\n 1. enqueue() - помещает элемент в конец очереди;\n 2. dequeue() - возвращает первый элемент из очереди и удаляет его;\n 3. first() - возвращает первый элемент из очереди, не удаляя;\n Для выбора действия введите цифру: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Введите значение элемента: ");
            System.out.println(enqueue(linked_list, scanner.next()));
        }
        if (choice == 2) {
            System.out.println(dequeue(linked_list));
        }
        if (choice == 3) {
            System.out.println(first(linked_list));
        }
        scanner.close();
    }
}
