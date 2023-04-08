import java.util.*;

public class Laptop_Store {

    private static final String Laptop_Store = null;
    private static final String Lptop__Stor = null;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                    "1 - Марка\n" +
                    "2 - ОЗУ\n" +
                    "3 - Объем ЖД\n" +
                    "4 - Операционная система\n" +
                    "5 - Цвет\n" +
                    "6 - Цена");

            int filterType = scanner.nextInt();
            Map<Integer, String> filters = new HashMap<>();

            while (filterType >= 1 && filterType <= 6) {
                String filterValue;
                switch (filterType) {
                    case 1:
                        System.out.print("Введите марку: ");
                        filterValue = scanner.next();
                        filters.put(filterType, filterValue);
                        break;
                    case 2:
                        System.out.print("Введите минимальный объем ОЗУ: ");
                        filterValue = scanner.next();
                        filters.put(filterType, filterValue);
                        break;
                    case 3:
                        System.out.print("Введите минимальный объем жесткого диска: ");
                        filterValue = scanner.next();
                        filters.put(filterType, filterValue);
                        break;
                    case 4:
                        System.out.print("Введите операционную систему: ");
                        filterValue = scanner.next();
                        filters.put(filterType, filterValue);
                        break;
                    case 5:
                        System.out.print("Введите цвет: ");
                        filterValue = scanner.next();
                        filters.put(filterType, filterValue);
                        break;
                    case 6:
                        System.out.print("Введите максимальную цену: ");
                        filterValue = scanner.next();
                        filters.put(filterType, filterValue);
                        break;
                    default:
                        System.out.println("Некорректный выбор.");
                        break;
                }
                System.out.println(
                        "Введите цифру, соответствующую необходимому критерию, или любую другую цифру, чтобы завершить:");
                filterType = scanner.nextInt();
            }

            Set<Laptop_Store> filteredLaptop_Stores = filteredLaptop(Laptop_Store, filters);

            if (filteredLaptop_Stores.size() > 0) {
                System.out.println("Результаты фильтрации:");
                for (Laptop_Store laptops : filteredLaptop_Stores) {
                    System.out.println(laptops.toString());
                }
            } else {
                System.out.println("Нет результатов, соответствующих указанным критериям.");
            }
        }
    }

    private static Set<Laptop_Store> createLaptops() {
        return null;
    }

    private static Set<Laptop_Store> filteredLaptop(String lptopStor, Map<Integer, String> filters) {
        return null;
    }

    private static Set<Laptop_Store> createNotebooks() {
        Set<Laptop_Store> laptops = new HashSet<>();
        laptops.add(new Laptop("Lenovo", 8, 256, "Windows 10", "Black", 699.99));
        laptops.add(new Laptop("Apple", 16, 512, "macOS", "Silver", 1299.99));
        laptops.add(new Laptop("Dell", 16, 512, "Windows 10", "Black", 1199.99));
        laptops.add(new Laptop("HP", 8, 512, "Windows 10", "White", 849.99));
        laptops.add(new Laptop("Asus", 8, 256, "Windows 10", "Grey", 799.99));
        laptops.add(new Laptop("Acer", 16, 512, "Windows 10", "Silver", 999.99));
        laptops.add(new Laptop("MSI", 32, 1024, "Windows 10", "Black", 2499.99));
        laptops.add(new Laptop("Huawei", 16, 512, "Windows 10", "Grey", 1099.99));
        laptops.add(new Laptop("Razer", 16, 512, "Windows 10", "Black", 1799.99));
       .add(new Laptop("Samsung", 8, 256, "Windows 10", "Silver", 749.99));
        return laptops;
    }

    private static Set<Laptop_Store> filterNotebooks(Set<Laptop_Store> laptops, Map<Integer, String> filters) {
        Set<Laptop_Store> filteredLaptops = new HashSet<>(laptops);
        Iterator<Laptop_Store> iterator = filteredLaptops.iterator();
        while (iterator.hasNext()) {
            Laptop_Store notebook = iterator.next();
            for (Map.Entry<Integer, String> entry : filters.entrySet()) {
                int filterType = entry.getKey();
                String filterValue = entry.getValue();
                switch (filterType) {
                    case 1:
                        if (!notebook.getBrand().equalsIgnoreCase(filterValue)) {
                            iterator.remove();
                        }
                        break;
                    case 2:
                        if (notebook.getRam() < Integer.parseInt(filterValue)) {
                            iterator.remove();
                        }
                        break;
                    case 3:
                        if (notebook.getStorage() < Integer.parseInt(filterValue)) {
                            iterator.remove();
                        }
                        break;
                    case 4:
                        if (!notebook.getOs().equalsIgnoreCase(filterValue)) {
                            iterator.remove();
                        }
                        break;
                    case 5:
                        if (!notebook.getColor().equalsIgnoreCase(filterValue)) {
                            iterator.remove();
                        }
                        break;
                    case 6:
                        if (notebook.getPrice() > Double.parseDouble(filterValue)) {
                            iterator.remove();
                        }
                        break;
                    default:
                        break;
                }
            }
        }
        return filteredLaptops;
    }

    private double getPrice() {
        return 0;
    }

    private String getColor() {
        return null;
    }

    private String getOs() {
        return null;
    }

    private int getStorage() {
        return 0;
    }

    private int getRam() {
        return 0;
    }

    private String getBrand() {
        return null;
    }
}

