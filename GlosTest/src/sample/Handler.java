package sample;


import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Handler {
    private ArrayList<Glossary> wordList;
    private String CurrentWord;
    private Scanner scanner ;
    public Handler (){
        this.wordList = new ArrayList<Glossary>();

    }

    public void load(Scene scene){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt"));

        File file = fileChooser.showOpenDialog(scene.getWindow());

        try {
            scanner = new Scanner(file);
            String line ="";
            while (scanner.hasNext()) {
                line = scanner.nextLine();
                System.out.println("line " +line);
                makeWordFromLine(line);

            }
            System.out.println("Left while");
            } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println(this.wordList);


    }
private void makeWordFromLine(String line){
    StringTokenizer st = new StringTokenizer(line, ":");
    String wc =  st.nextToken();
    Glossary word;
    switch(wc){
        case "s" :
             word = new Noun();
             makeNoun(st, (Noun)word)
            ;break;
        default:
            word = new Glossary (wc);
            break;
    }

}
private void makeNoun(StringTokenizer st, Noun word){
    word.setGenus(st.nextToken());
    word.setGerman(st.nextToken());
    word.setPlural(st.nextToken());
    word.setSwedish(st.nextToken());
    System.out.println(word);
    this.wordList.add(word);

}

    }


