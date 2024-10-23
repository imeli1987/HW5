public class Main {
    public static void main(String[] args) {
//Task 1
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");
//Task 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
//    Task 3
        System.out.println("Задача 3");
        int year = 2021;
        if (year >= 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.printf("%d год является високосным\n", year);
            } else {
                System.out.printf("%d год не является високосным\n", year);
            }
        } else {
            System.out.println("Введите год больше 1584");
        }
//    Task 4
        System.out.println("Задача 4");
        int deliveryDistance = 65;
        int countDay = 1;
        if ( deliveryDistance >= 0 && deliveryDistance < 20){
            System.out.println("Потребуется дней: " + countDay);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60 ) {
            System.out.println("Потребуется дней: " + (countDay+1));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (countDay+2));
        } else {
            System.out.println("Доставки нет");
        }
//    Task 5
        System.out.println("Задача 5");
        int monthNumber = 12;
        if (monthNumber <= 12){
            switch (monthNumber){
                case 1:
                    System.out.printf("%d-й месяц (он же январь) принадлежит к сезону зима.\n", monthNumber);
                    break;
                case 2:
                    System.out.printf("%d-й месяц (он же февраль) принадлежит к сезону зима.\n", monthNumber);
                    break;
                case 3:
                    System.out.printf("%d-й месяц (он же март) принадлежит к сезону весна.\n", monthNumber);
                    break;
                case 4:
                    System.out.printf("%d-й месяц (он же апрель) принадлежит к сезону весна.\n", monthNumber);
                    break;
                case 5:
                    System.out.printf("%d-й месяц (он же май) принадлежит к сезону весна.\n", monthNumber);
                    break;
                case 6:
                    System.out.printf("%d-й месяц (он же июнь) принадлежит к сезону лето.\n", monthNumber);
                    break;
                case 7:
                    System.out.printf("%d-й месяц (он же июль) принадлежит к сезону лето.\n", monthNumber);
                    break;
                case 8:
                    System.out.printf("%d-й месяц (он же август) принадлежит к сезону лето.\n", monthNumber);
                    break;
                case 9:
                    System.out.printf("%d-й месяц (он же сентябрь) принадлежит к сезону осень.\n", monthNumber);
                    break;
                case 10:
                    System.out.printf("%d-й месяц (он же октябрь) принадлежит к сезону осень.\n", monthNumber);
                    break;
                case 11:
                    System.out.printf("%d-й месяц (он же ноябрь) принадлежит к сезону осень.\n", monthNumber);
                    break;
                case 12:
                    System.out.printf("%d-й месяц (он же декабрь) принадлежит к сезону зима.\n", monthNumber);
                    break;
            }
        } else {
            System.out.println("Введите существующий номер месяца");
        }
    }
}