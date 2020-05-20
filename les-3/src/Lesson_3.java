import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Lesson_3 {

    public static void main(String[] args) {
        guessTheNumber();
        guessTheWord();
    }

    static void guessTheWord(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rnd = new Random();
        Scanner scaner = new Scanner(System.in);
        int wordNum = rnd.nextInt(26);
        String word = words[wordNum];
        boolean rightAnswer = false;
        while (!rightAnswer) {
            System.out.println("Guess th word");
            String guessWord = scaner.nextLine();
            char[] guessWordArr = guessWord.toCharArray();
            char[] wordArr = word.toCharArray();
            boolean wrongAnswer = false;
//    System.out.println(Arrays.toString(guessWordArr));
            for (int i = 0; (i < guessWordArr.length) && (!wrongAnswer); i++) {
                if (guessWordArr[i] != wordArr[i]) {
                    System.out.println("Wrong answer");
                    wrongAnswer = true;
                }
                i++;
            }
            if (!wrongAnswer) {
                System.out.println("Right");
                rightAnswer = true;
            } else {
                for (int i = 0; (i < wordArr.length) && (i < guessWordArr.length); i++) {
                    if (wordArr[i] == guessWordArr[i]) {
                        System.out.print(wordArr[i]);
                    } else System.out.print('#');
                }
                for (int i = wordArr.length; i < 15; i++) {
                    System.out.print('#');
                }
                System.out.println();
            }
        }
    }

    static void guessTheNumber() {
        Scanner scaner = new Scanner(System.in);
        boolean isWantToPlay = true;
        boolean isGuessed = false;
        Random rnd = new Random();
        int guess = 0;
        System.out.println("Start the game?");

        if (scaner.nextByte() == 1) {
            while (isWantToPlay) {
                int attempt = 0;
                int number = rnd.nextInt(10);
                isGuessed = false;
                while ((!isGuessed) && (attempt < 3)) {
                    System.out.println("Guess the number");
                    guess = scaner.nextInt();
                    if (number == guess) {
                        isGuessed = true;
                        System.out.println("Right answer");
                        isGuessed = true;
                    } else {
                        System.out.println("Wrong answer");
                        if (number > guess) System.out.println("Number is bigger");
                        else System.out.println("Number is smaller");
                    }
                    attempt++;
                }
                if (!isGuessed) System.out.println("You loose! Number was " + number);
                System.out.println("Want play more?");
                if (scaner.nextInt() == 1) {
                    System.out.println("The game continues.");
                } else {
                    System.out.println("Goodbye");
                    isWantToPlay = false;
                }
            }
        }
    }
}
