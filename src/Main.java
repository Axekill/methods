import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();

    }

    public static void calculateYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }

    private static void task1() {
        System.out.println("Задача 1");
        int year = 2023;
        calculateYear(year);
    }

    public static void typeOS(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    private static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2023;
        typeOS(clientOS, clientDeviceYear);
    }

    public static int deliveryCard(int deliveryDistance) {
        int deliveryDay=1;
        if (deliveryDistance < 20) {
            System.out.println("доставка занимает " + deliveryDay + " дней");
        } else if (deliveryDistance <= 60) {
            deliveryDay++;
            System.out.println("доставка занимает " + deliveryDay + " дней");
        } else if (deliveryDistance <= 100) {
            deliveryDay += 2;
            System.out.println("доставка занимает " + deliveryDay + " дней");
        } else {
            System.out.println("доставки нет");
        }
        return deliveryDay;
    }

    private static void task3() {
        int deliveryDistance = 15;
        deliveryCard(deliveryDistance);
    }


}