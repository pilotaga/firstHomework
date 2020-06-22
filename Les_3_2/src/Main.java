import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        task1App();
        task2App();
    }

    public static void task2App(){
        Note[] notes = new Note[5];

        notes[0] = new Note("Denis", "12345");
        notes[1] = new Note("Maks", "94848399");
        notes[2] = new Note("Andrey", "647382");
        notes[3] = new Note("Artem", "23456");
        notes[4] = new Note("Artem", "12345");

        PhoneBook book = new PhoneBook();
        for (Note note : notes) {
            book.add(note);
        }

        book.showPhoneBook();
        System.out.println(book.get("Artem"));
    }

    public static void task1App() {
        String[] wordArr = new String[]{"asd", "asd", "qwe", "qwe", "zxc", "zxc", "zxc", "zxc", "zxc", "sdf", "wer", "xcv", "xcv", "sdf", "sdf", "sdf", "ert", "dfg", "cvb", "ghj"};

        System.out.println(Arrays.toString(wordArr));
        Arrays.sort(wordArr);
        System.out.println(Arrays.toString(wordArr));

        Set<String> wordSet = new HashSet<>();

        for (String word : wordArr) {
            wordSet.add(word);
        }

        System.out.println(wordSet.toString());

        wordCounter(wordArr);

        System.out.println(listWordCounter(wordArr));

    }

    public static Map<String, Integer> listWordCounter(String[] wordArr) {
        Map<String, Integer> wordMap = new HashMap<>();
        Integer counter = 0;

        for (String word : wordArr) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, (wordMap.get(word) + 1));
            } else {
                wordMap.put(word, 1);
            }
        }

        return wordMap;
    }

    public static void wordCounter(String[] wordArr) {
        int counter = 0;
        if (!wordArr[0].equals(wordArr[1])) {
            System.out.println(String.format("Array contains word %s %s times", wordArr[0], 1));
        }
        for (int i = 1; i < wordArr.length; i++) {
            if (wordArr[i].equals(wordArr[i - 1])) {
                counter++;
            } else {
                System.out.println(String.format("Array contains word %s %s times", wordArr[i - 1], counter + 1));
                counter = 0;
            }
        }
        if (wordArr[wordArr.length - 1].equals(wordArr[wordArr.length - 2])) {
            System.out.println(String.format("Array contains word %s %s times", wordArr[wordArr.length - 1], counter + 1));
        } else {
            System.out.println(String.format("Array contains word %s %s times", wordArr[wordArr.length - 1], 1));
        }
    }
}
