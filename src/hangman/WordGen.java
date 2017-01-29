/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.ArrayList;
import java.util.Random;


public class WordGen {
    
    private ArrayList<String> words = new ArrayList();
    
    public WordGen() {
        words.add("software");
        words.add("engineering");
        words.add("java");
        words.add("professor");
        words.add("computer");
        words.add("science");
        words.add("application");
        words.add("developer");
        words.add("machine");
        words.add("virtual");
        words.add("agile");
        words.add("language");
        words.add("programming");
        words.add("calculus");
        words.add("algebra");
        
    }
    
    public String getWord() {
        return words.get(new Random().nextInt() % words.size());
}
    
    
    
    
    
    
    
    
    
    
    
}

