import java.util.Scanner;
public class Main {
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
        String sentence = word1.concat(" ").concat(word2).concat(" ").concat(word3).concat(" ").concat(word4).concat(" ").concat(word5);
        System.out.println("Складене речення:");
        System.out.println(sentence);
            }
        }

