import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;
    Set<String> textSet = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;
        Collections.addAll(textSet, text.split("\\P{IsAlphabetic}+"));
    }

    public boolean hasWord(String word) {
        return textSet.contains(word);
    }
}

