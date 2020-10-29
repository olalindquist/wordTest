package sample;

public class Noun extends Glossary {
    private String plural;
    private String genus;

    public Noun(){


    }
    public Noun(String ger, String genus, String ending, String swe){
        super (ger, swe, "n");
        this.plural = ending;
        this.genus = genus;
    }

    public void setPlural(String ending) {
        this.plural = ending;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getPlural(String plural) {
        return this.plural;
    }


}
