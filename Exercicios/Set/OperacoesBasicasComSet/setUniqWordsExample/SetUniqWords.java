package setUniqWordsExample;

import java.util.HashSet;
import java.util.Set;

public class SetUniqWords {
    public static Set<String> uniqWords = new HashSet<String>();

    public static void addWord(String word){
        uniqWords.add(word);
    }

    public static void removeWord(String word){
        uniqWords.removeIf(word::equalsIgnoreCase);
    }

    public static boolean isWordPresent(String word){
        return uniqWords.stream().anyMatch(word::equalsIgnoreCase);
    }

    public static void showUniqWords(){
        uniqWords.forEach(System.out::println);
    }
}
