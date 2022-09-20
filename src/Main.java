public class Main {

    public static void main(String[] args) {
        knowLeapYear(2020);
        getDeviceLink(1, 2005);
        int deliveryDays = calculateDeliveryDays(90);
        System.out.println(" На доставку потребуется дней  - " + deliveryDays);

    }

    public static void knowLeapYear(int year) {
        System.out.println(" Задание 1 ");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный год ");

        } else {
            System.out.println(year + " - Невисокосный год");
        }
    }

    public static void getDeviceLink(int clientOS, int clientDeviceYear) {
        System.out.println(" Задание 2 ");

        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println(" Установите облегченную версию для IOS");

        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println(" Установите облегченную версию для Андроид");
        } else {
            System.out.println(" Можете скачать приложение ");
        }
    }
    public static int calculateDeliveryDays(int deliveryDistance) {

        System.out.println(" Задание 3 ");

        if (deliveryDistance < 0) {
            System.out.println(" не правильно указано расстояние " + deliveryDistance);
            return 1;
        } else if (deliveryDistance <= 20) {
            return 2;
        } else {
            return (int) Math.round((double) deliveryDistance / 48) + 1;
        }
    }
}