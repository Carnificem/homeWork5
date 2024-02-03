public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println("задание 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //задача 2
        System.out.println("задание 2");
        clientOS = 0;
        int clientDeviceYear = 2011;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //задание 3
        System.out.println("задание 3");
        int year = 1900;
        if ((year > 1584) && (year % 4 == 0) && (year % 400 == 0) && (year % 100 != 0)) {
            System.out.println(year + " является высокосным");
        } else {
            System.out.println(year + " не является высокосным");
        }
        //задача 4
        System.out.println("задание 4");
        int diliveryDistance = 100;
        if ((diliveryDistance > 0) && (diliveryDistance <= 20)) {
            System.out.println("потребуется один день на доставку ");
        }
        if ((diliveryDistance > 20) && (diliveryDistance <= 60)) {
            System.out.println("на доставку потребуется два дня");
        }
        if ((diliveryDistance > 60) && (diliveryDistance <= 100)) {
            System.out.println("на доставку потребуется три дня");
        }
        //задача 5
        System.out.println("задание 5");
        int monthNumber = 3;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Зимний сезон.");
                break;
            case 3, 4, 5:
                System.out.println("Весенний сезон.");
                break;
            case 6, 7, 8:
                System.out.println("Летний сезон.");
                break;
            case 9, 10, 11:
                System.out.println("Осенний сезон.");
                break;
            default:
                System.out.println("Такого месяца не сушествует.");
        }

    }
}














