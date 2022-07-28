import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        public static void leapYear( int year)
        {
            boolean leapYear = false;
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        leapYear = true;
                    } else {
                        leapYear = false;
                    }
                }
                leapYear = true;
            } else if (!leapYear) {
                System.out.println("13.09."+year);
            } else {
                System.out.println("12.09."+year);
            }
        }

    }
}