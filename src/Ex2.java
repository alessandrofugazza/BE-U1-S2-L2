import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        int numberOfNumbers = 6;
        ArrayList<Integer> randomNumbers = getRandomNumbers(numberOfNumbers);
        ArrayList<Integer> duplicatedAndInvertedList = duplicateAndInvert(randomNumbers);

    }
    public static ArrayList<Integer> getRandomNumbers(int numberOfNumbers) {
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < numberOfNumbers; i++) {
            int randomNumber = (int)(Math.random() * 101);
            randomNumbers.add(randomNumber);
        }
        return randomNumbers;
    }
    public static ArrayList<Integer> duplicateAndInvert(ArrayList<Integer> list) {
        ArrayList<Integer> duplicatedAndInvertedList = new ArrayList<>(list);
        for (int i = duplicatedAndInvertedList.size()-1; i >=0; i--) {
            duplicatedAndInvertedList.add(duplicatedAndInvertedList.get(i));
        }
        return duplicatedAndInvertedList;
    }
    public static void printEvenOrOdd(ArrayList<Integer> list, boolean even) {
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            if (even && i%2 == 0) {
                System.out.println(n);
            } else if (!even && i%2 == 1) {
                System.out.println(n);
            }
        }
    }
}
