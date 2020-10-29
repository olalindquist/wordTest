package sample;

import java.io.IOException;
import java.util.logging.FileHandler;

public class Glossary {
    protected String wordClass;
    protected String swedish;
    protected String german;


    public Glossary(String wc){

        this.wordClass = wc;
    }
    public Glossary(String ger, String swe, String wc) {
        this.swedish = swe;
        this.german = ger;
        this.wordClass = wc;

    }

    public Glossary(){

    }
    public String getSwedish() {
        return swedish;
    }

    public String getGerman() {
        return german;
    }

    public void setWordClass(String wordClass) {
        this.wordClass = wordClass;
    }

    public void setSwedish(String swedish) {
        this.swedish = swedish;
    }

    public void setGerman(String german) {
        this.german = german;
    }
public String toString(){
        return this.german +" "+this.swedish;
}
}

