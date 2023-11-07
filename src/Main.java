import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    //Task1
    public static void task1(){
        System.out.println("Введите дату рождения в формате (12 декабря 1974 г)");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();

        String[] strings = string.split(" ");
        int data;
        String monthByText;
        int month = 0;
        int year;
        String zodiac = "";
        String chinaCalendar = "";

        data = Integer.parseInt(strings[0]);
        monthByText = strings[1];
        year = Integer.parseInt(strings[2]);


        if(monthByText.equalsIgnoreCase("января")){
            month = 1;
        }if(monthByText.equalsIgnoreCase("февраля")){
            month = 2;
        }if(monthByText.equalsIgnoreCase("марта")){
            month = 3;
        }if(monthByText.equalsIgnoreCase("апреля")){
            month = 4;
        }if(monthByText.equalsIgnoreCase("мая")){
            month = 5;
        }if(monthByText.equalsIgnoreCase("июня")){
            month = 6;
        }if(monthByText.equalsIgnoreCase("июля")){
            month = 7;
        }if(monthByText.equalsIgnoreCase("августа")){
            month = 8;
        }if(monthByText.equalsIgnoreCase("сентября")){
            month = 9;
        }if(monthByText.equalsIgnoreCase("октяря")){
            month = 10;
        }if(monthByText.equalsIgnoreCase("ноября")){
            month = 11;
        }if(monthByText.equalsIgnoreCase("декабря")){
            month = 12;
        }


        switch (month) {
            case 1:
                if (data <= 20) {
                    zodiac = "Козерог";
                } else {
                    zodiac = "Водолей";
                }
                break;
            case 2:
                if (data <= 19) {
                    zodiac = "Водолей";
                } else {
                    zodiac = "Рыбы";
                }
                break;
            case 3:
                if (data <= 20) {
                    zodiac = "Рыбы";
                } else {
                    zodiac = "Овен";
                }
                break;
            case 4:
                if (data <= 20) {
                    zodiac = "Овен";
                } else {
                    zodiac = "Телец";
                }
                break;
            case 5:
                if (data <= 21) {
                    zodiac = "Телец";
                } else {
                    zodiac = "Близнецы";
                }
                break;
            case 6:
                if (data <= 21) {
                    zodiac = "Близнецы";
                } else {
                    zodiac = "Рак";
                }
                break;
            case 7:
                if (data <= 22) {
                    zodiac = "Рак";
                } else {
                    zodiac = "Лев";
                }
                break;
            case 8:
                if (data <= 21) {
                    zodiac = "Лев";
                } else {
                    zodiac = "Дева";
                }
                break;
            case 9:
                if (data <= 23) {
                    zodiac = "Дева";
                } else {
                    zodiac = "Весы";
                }
                break;
            case 10:
                if (data <= 23) {
                    zodiac = "Весы";
                } else {
                    zodiac = "Скорпион";
                }
                break;
            case 11:
                if (data <= 22) {
                    zodiac = "Скорпион";
                } else {
                    zodiac = "Стрелец";
                }
                break;
            case 12:
                if (data <= 22) {
                    zodiac = "Стрелец";
                } else {
                    zodiac = "Козерог";
                }
                break;
        }

        switch (year % 12) {
            case 0:
                chinaCalendar = "Обезьяны";
                break;
            case 1:
                chinaCalendar = "Петуха";
                break;
            case 2:
                chinaCalendar = "Собаки";
                break;
            case 3:
                chinaCalendar = "Свиньи";
                break;
            case 4:
                chinaCalendar = "Крысы";
                break;
            case 5:
                chinaCalendar = "Быка";
                break;
            case 6:
                chinaCalendar = "Тигра";
                break;
            case 7:
                chinaCalendar = "Кролика";
                break;
            case 8:
                chinaCalendar = "Дракона";
                break;
            case 9:
                chinaCalendar = "Змеи";
                break;
            case 10:
                chinaCalendar = "Лошади";
                break;
            case 11:
                chinaCalendar = "Овцы";
                break;

        }
        System.out.println("Вывод: ");
        System.out.print("Знак: " + zodiac + " ");
        System.out.println("Год: " + chinaCalendar);

    }
}
