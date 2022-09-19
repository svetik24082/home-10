public class Main {
    public static void leapYear( int year ) {
        System.out.println(year + " -  високосный год");

    }
    public static void nonLeapYear ( int year) {

        System.out.println( year + "  - не  високосным год ");
    }
    public static void easyVersionIos ( int clientOS ) {
        System.out.println(" Установите облегченную версию для IOS по ссылке ");
    }
    public static void easyVersionAndroid( int clientOS) {
        System.out.println(" Установите облегченную версию для Андроид по ссылке ");
    }

    public static void  installAppendix ( int clientOS) {
        System.out.println(" Можете скачать приложение ");
    }
    public static void getDeliveryTime (int distance) {

            System.out.println(" не правильно указано расстояние");

        }
        public static void itWillTakeDays ( int time) {
            System.out.println( " потребуется дней "+ time);
        }


    public static void main(String[] args) {
        System.out.println(" Задание 1 ");
        int year = 2030;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            leapYear(year);
        } else {
            nonLeapYear(year);
        }


        System.out.println(" Задание 2 ");
        int clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            easyVersionIos( clientOS);
        }

    else if (clientDeviceYear < 2015 && clientOS == 1) {
        easyVersionAndroid( clientOS);

            }else {
        installAppendix(clientOS);
    }
        System.out.println( " Задание 3 ");
    int distance = 95;
        if (distance < 0) {
            getDeliveryTime(distance);

            return;
        }
        int time = 0;
        for (int i = 0; i < distance; i += 40) {
            time = time + 1;
        }
      itWillTakeDays ( time);

        }




        }










        










