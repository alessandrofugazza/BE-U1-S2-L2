import java.util.HashSet;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        HashSet<String> distinctWords = new HashSet<>();
        HashSet<String> duplicatedWords = new HashSet<>();

        System.out.println("Insert a number");
        Scanner input = new Scanner(System.in);
        int numberOfElements = Integer.parseInt(input.nextLine());
        System.out.println("Insert " + numberOfElements + " words.");
        for (int i = 0; i < numberOfElements; i++) {
            String newWord = input.nextLine();
            if (distinctWords.contains(newWord)) {
                distinctWords.remove(newWord);
                duplicatedWords.add(newWord);
            } else {
                distinctWords.add(newWord);
            }
        }
        input.close();
        System.out.println("duplicated words:");
        for(String word: duplicatedWords) {
            System.out.println(word);
        }
        System.out.println("number of distinct words:");
        System.out.println(distinctWords.size());
        System.out.println("distinct words:");
        for(String word: distinctWords) {
            System.out.println(word);
        }

    }
}
