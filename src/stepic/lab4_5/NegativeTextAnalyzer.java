package stepic.lab4_5;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    static {
        label = Label.NEGATIVE_TEXT;
    }

    {
        keywords = new String[]{":(", "=(",  ":|"};
    }

}
