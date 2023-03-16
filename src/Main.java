import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // task1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any year to check if it is a leap year.");
        int year = scanner.nextInt();
        boolean answer = checkLeapYear(year);
        if(answer){
            System.out.println(year + " year is a leap year.");
        }else{
            System.out.println(year + " year isn't a leap year.");
        }

        //task2
        System.out.println("Enter 0 if your OS is IOS, enter 1 if it is Android:");
        int clientOS = scanner.nextInt();
        System.out.println("Enter the year of manufacture of the device:");
        int clientDeviceYear = scanner.nextInt();
        System.out.println(downloadTheApp(clientOS, clientDeviceYear));

        //task3
        System.out.println("Enter the distance to the client: ");
        int distance = scanner.nextInt();
        System.out.println(calculateDeliveryDay(distance));

    }

    public static boolean checkLeapYear(int year){
        boolean isLeapYear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        return isLeapYear;
    }

    public static String downloadTheApp(int system, int year){
        int currentYear = LocalDate.now().getYear();
        String message = "";
        if(system == 1){
            if(year < currentYear){
                message = "Install the lite version of the Android app from the link...";
            }else{
                message = "Install the Android version of the app from the link";
            }
        } else if(system == 0){
            if(year < currentYear){
                message = "Install the light version of the app for iOS from the link";
            }else{
                message = "Install the iOS version of the app from the link";
            }
        }
        return message;
    }

    public static String calculateDeliveryDay(int deliveryDistance){
        String message;
        int day = 0;
        if(deliveryDistance < 20){
            day = 1;
        } else if(deliveryDistance < 60){
            day = 2;
        } else if(deliveryDistance < 100){
            day = 3;
        }

        if(day > 0){
            message = "It will take days " + day;
        } else {
            message = "There is no delivery";
        }
        return message;
    }
}