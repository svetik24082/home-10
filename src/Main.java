public class Main {
    public static void knowLeapYear(int year) {
        System.out.println(year + " -  високосный год");
    }
    public static void getDeviceLink(int clientOS, int clientDeviceYear) {
    }
    public static int itWillTakeDays(int time) {
        System.out.println(" На доставку потребуется дней  - " + time);
        return time;
    }
    public static void main(String[] args) {
        System.out.println(" Задание 1 ");
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            knowLeapYear(year);
        } else {
            System.out.println(year + " - Невисокосный год");
        }

        System.out.println(" Задание  2 ");
        int clientOS = 1;
        int clientDeviceYear = 2020;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println(" Установите облегченную версию для IOS");

        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println(" Установите облегченную версию для Андроид");
        } else {
            System.out.println(" Можете скачать приложение ");
            ;
        }
        System.out.println(" Задание 3 ");

        int distance = 95;
        if (distance < 0) {
            System.out.println(" не правильно указано расстояние " + distance);
            return;
        }
        int time = 0;
        for (int i = 0; i < distance; i += 40) {
            time = time + 1;
        }
        itWillTakeDays(time);
    }
}










        










