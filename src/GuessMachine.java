
public class GuessMachine {
    private int num, numguess, guess;
    
    public GuessMachine(){
        num = (int)Math.floor((Math.random()*100)+1);
        guess = 0;
        numguess= 0;
    }
    
    public boolean setGuess(int x){
        if (x>0 && x<=100){
            guess= x; 
            numguess++;
            return true;
        }
        else return false;
    }
    public int getNumGuess(){
        return numguess;
    }
    public String giveHint(){
        if (guess==num){
            return ". You guessed it";
        }
        else if (guess> num){
            return ". You guessed too low";
        }
        else 
            return ". You guessed too high";
    }
}
