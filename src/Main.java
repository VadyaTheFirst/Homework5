public class Main {
    public static void main(String[] args) {

        //Задача1
        byte clientOS = 1;
        boolean verify = (clientOS == 0);
        if (verify) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 2
        int clientDeviceYear = 2015;
        boolean modern = (clientDeviceYear>=2015);
        if (verify && modern) {
                System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (verify && !modern) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if  (!(verify) && modern) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


        //Задача 3
        var year =2100;
        boolean divide4 = ((year%4)==0);
        boolean divide100 = ((year%100)==0);
        boolean divide400 = ((year%400)==0);

            if ((divide4) && !(divide100)) {
                System.out.println(year + " год является високосным");
            } else if (divide400) {
                System.out.println(year + " год является високосным");
            } else if (divide100) {
                System.out.println(year + " год не является високосным");
            } else if (!(divide4)){
                System.out.println(year + " год не является високосным");
        }
        //Задача 4
        int deliveryDistance = 95;
        boolean shortTime = (deliveryDistance<=20);
        boolean middleTime = (deliveryDistance>20 && deliveryDistance<=60);
        boolean longTime = (deliveryDistance>60 && deliveryDistance<=100);

        int term= (deliveryDistance / 40)+1;
        if (shortTime) {
            System.out.println("Потребуется дней: " + term);
        } else if (middleTime) {
            System.out.println("Потребуется дней: " + term);
        } else if (longTime) {
            System.out.println("Потребуется дней: " + term);
        } else {
            System.out.println("Нестандартное расстояниеб потребуется дней: " + term);
        }

        //Задача 5
        byte monthNumber = 7;
        if (monthNumber>0 && monthNumber<13) {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                default:
                    System.out.println("Осень");
                    break;
            }
        } else {
            System.out.println("Задан неверный месяц");
        }


    }
}
