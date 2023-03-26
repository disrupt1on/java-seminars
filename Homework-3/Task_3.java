import java.util.Random;
import java.util.ArrayList;
import java.util.Comparator;

public class Task_3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> random_list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            random_list.add(random.nextInt(1, 100));
        }
        System.out.println("Дан список: " + random_list);

        random_list.sort(Comparator.naturalOrder());
        int min = random_list.get(0);
        int max = random_list.get(random_list.size()-1);

        int sum = 0;
        for (int i = 0; i < random_list.size(); i++) {
            sum += random_list.get(i);
        }
        double middle = (double) sum / random_list.size();
        
        System.out.println("Минимальное число : " + min);
        System.out.println("Максимальное число : " + max);
        System.out.println("Среднее арифметическое : " + middle);
    }
}
