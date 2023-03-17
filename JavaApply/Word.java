package JavaApply;

import java.util.HashSet;
import java.util.Set;

public class Word {
    private String letters;

    public Word(String letters) {
        this.letters = letters;
    }


    public boolean isVowel(int i) {
        String str = "aeiou";
        return str.contains(letters.substring(i, i + 1));
    }

    public boolean isConsonant(int i) {
        String str = "aeiou";
        if (str.contains(letters.substring(i, i + 1)) == true) {
            return false;
        } else {
            return true;
        }
    }
}
