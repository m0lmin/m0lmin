import java.util.Scanner;
public class Pract52 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше слово:");
        String word1 = scanner.nextLine();
        System.out.println("Введіть друге слово:");
        String word2 = scanner.nextLine();
        System.out.println("Введіть третє слово:");
        String word3 = scanner.nextLine();
        System.out.println("Введіть четверте слово:");
        String word4 = scanner.nextLine();
        System.out.println("Введіть п'яте слово:");
        String word5 = scanner.nextLine();
        String firstLetter1 = word1.substring(0, 1);
        String firstLetter2 = word2.substring(0, 1);
        String firstLetter3 = word3.substring(0, 1);
        String firstLetter4 = word4.substring(0, 1);
        String firstLetter5 = word5.substring(0, 1);
        System.out.println("Перші літери введених слів:");
        System.out.println("Перша літера першого слова: " + firstLetter1);
        System.out.println("Перша літера другого слова: " + firstLetter2);
        System.out.println("Перша літера третього слова: " + firstLetter3);
        System.out.println("Перша літера четвертого слова: " + firstLetter4);
        System.out.println("Перша літера п'ятого слова: " + firstLetter5);
            }
        }

