/*
    Jason Medcoff, 2017
    jemedcoff@oakland.edu
 */
package hangman;

public class GameInstance {

    private String objective;
    private String censored;
    private int attempts = 0;
    WordGen w = new WordGen();
    
    public int newObjective(){
        objective = w.getWord();
        
        StringBuilder u = new StringBuilder();
        for (int i = 0; i < objective.length(); i++){
            u.append("_ ");
        }
        censored = u.toString().trim();
        return objective.length();
    }
    
    public String updateObjective(String c){
        StringBuilder u = new StringBuilder();
        for (int i=0; i<objective.length(); i++){
            if (objective.substring(i, i+1).equals(c))
                    u.append(c.toUpperCase()).append(" ");
            else if (censored.substring(2*i, 2*i+1).equals("_"))
                u.append("_ ");
            else
                u.append(objective.substring(i, i+1).toUpperCase()).append(" ");
        }
        // String end = u.toString().trim();
        censored = u.toString().trim();
        return censored;
    }
    
    public String getObjective(){
        return objective;
    }
    
    public void resetAttempts(){
        attempts = 0;
    }
    
    public void incAttempts(){
        attempts += 1;
    }
    
    public String getAttemptsStr(){
        return String.valueOf(attempts);
    }
    
    
}
