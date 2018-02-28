package stepic.lab4_5;

import java.util.Arrays;

public abstract class KeywordAnalyzer implements TextAnalyzer{


    protected String[] keywords;
    protected static Label label;

    protected String[] getKeywords (){
        return Arrays.copyOf(keywords, keywords.length);
    }

    protected Label getLabel(){
        return label;
    }

    @Override
    public Label processText(String text) {
        String[] cur = this.getKeywords();
        for (String s: cur){
            if (text.indexOf(s) != -1){
                return this.getLabel();
            }
        }
        return Label.OK;
    }
}
