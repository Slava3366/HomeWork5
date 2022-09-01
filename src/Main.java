public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("");
        System.out.println("Task2");

        int clientDeviceYear = 2022;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 1) {
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для IOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для IOS по ссылке");
                }
            }
        }
        System.out.println("");
        System.out.println("Task3");

        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("");
        System.out.println("Task4");

         int deliveryDistance = 102;
         int deliveryDays = 1;

         if (deliveryDistance > 20) {
             deliveryDays++;
         }
         if (deliveryDistance > 60) {
             deliveryDays++;
         }
        System.out.println("Потребуется дней: " + deliveryDays);

        System.out.println("");
        System.out.println("Task5");

        int monthNumber = 6;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Uncorrect month: " + monthNumber);
        }
    }

}
