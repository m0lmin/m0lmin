import java.util.Scanner;
public class Pract54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше ім'я:");
        String firstName = scanner.nextLine();
        System.out.println("Введіть друге ім'я:");
        String secondName = scanner.nextLine();
        if (firstName.equalsIgnoreCase(secondName)) {
            System.out.println("Введені імена ідентичні.");
        } else {
            System.out.println("Введені імена не є ідентичними.");
        }
    }
}
