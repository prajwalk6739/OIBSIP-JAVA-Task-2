public class GuessTheNumberGameOOPconcept {
    public static void main(String arg[]){ Game g=new Game();
        boolean b=false;
        while(!b){
        g.takeUserInput();
        b=g.isCorrectNumber();
        }     
    }  
}
