package Set.OperacoesBasicasComMap.DictionaryExample;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private static Map<String,String> dictionary = new HashMap<String,String>();

    public static Map<String, String> getDictionary() {
        return dictionary;
    }

    public static void addWord(String word, String definition) {
        dictionary.put(word, definition);
    }

    public static void removeWord(String word) {
        dictionary.remove(word);
    }

    public static void showDictionary() {
        dictionary.forEach((k,v) -> System.out.printf("%s: %s%n", k,v));
    }

    public static String searchWord(String word) {
        return dictionary.get(word);
    }
}