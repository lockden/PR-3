import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int intValue = scanner.nextInt();

        System.out.print("Введіть число з плаваючою точкою: ");
        double doubleValue = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Введіть строку: ");
        String text = scanner.nextLine();

        System.out.print("Введіть логічне значення (true/false): ");
        boolean boolValue = scanner.nextBoolean();

        System.out.println("\n===== Вивід даних =====\n");

        System.out.println("1) Ціле: " + intValue +
                ", Дійсне: " + doubleValue +
                ", Строка: " + text +
                ", Логічне: " + boolValue);

        System.out.printf("2) int=%d, double=%.2f, string=%s, bool=%b%n",
                intValue, doubleValue, text, boolValue);

        System.out.printf("3) Ціле (hex): %x%n", intValue);

        System.out.printf("4) Ціле (octal): %o%n", intValue);

        System.out.printf("5) Double (4 знаки): %.4f%n", doubleValue);

        System.out.printf("6) Double (ширина 10): %10.2f%n", doubleValue);

        System.out.printf("7) Строка (5 символів): %.5s%n", text);

        System.out.printf("8) Строка (ширина 15): %15s%n", text);

        System.out.printf("9) Boolean: %b%n", boolValue);

        System.out.printf(
                "10) |%5d| |%8.2f| |%-10s| |%5b|%n",
                intValue, doubleValue, text, boolValue
        );

        scanner.close();
    }
}
