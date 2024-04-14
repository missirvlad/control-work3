import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileWordAnalyzer {

    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            int wordCount = 0;
            String longestWord = "";
            Map<String, Integer> wordFrequency = new HashMap<>();

            while (scanner.hasNext()) {
                String word = scanner.next();
                wordCount++;

                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }

                if (wordFrequency.containsKey(word)) {
                    wordFrequency.put(word, wordFrequency.get(word) + 1);
                } else {
                    wordFrequency.put(word, 1);
                }
            }
