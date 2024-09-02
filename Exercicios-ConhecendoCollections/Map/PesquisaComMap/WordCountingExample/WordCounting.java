package Set.PesquisaComMap.WordCountingExample;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class WordCounting {
    private static Map<String, Integer> wordCount = new HashMap<String, Integer>();

    public static Map<String, Integer> getWordCount() {
        return wordCount;
    }

    public static void addWord(String word, int count) {
        wordCount.put(word, count);
    }

    public static void removeWord(String word) {
        wordCount.remove(word);
    }

    public static void showWordCounting(){
        wordCount.forEach((k,v)-> System.out.printf("%s: %d", k, v));
    }

    public static Optional<Map.Entry<String, Integer>> getMostFrequentWord() {
        return wordCount.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
    }
}
