package testpackage;

import java.util.Arrays;

public class SpamAnalizer extends KeywordAnalyzer {

    static {
        label = Label.SPAM;
    }

    public SpamAnalizer(String[] newKeywords){
        keywords = Arrays.copyOf(newKeywords, newKeywords.length);
    }

}
