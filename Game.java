import java.util.*;
class Game{
    public int number;
    public int noOfGuess;
    public int inputNumber;
    
    public void setNoOfGuess( int noOfGuess){
        this.noOfGuess=noOfGuess;
    }
    public int getNoofGuess(){
        return noOfGuess;
    }
    
    public Game(){
        Random random=new Random();
        this.number =random.nextInt(100);
    }
    void takeUserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number:");
         inputNumber=sc.nextInt();   
    }
    boolean isCorrectNumber(){
        noOfGuess++;
        if(inputNumber==number){
                    System.out.format("win! Your Value %d is same as Computer Value that is %d \n",inputNumber,number);
                    System.out.println("your attempt is :"+noOfGuess);
                    return true;
                }
                else if(inputNumber>number){
                    System.out.println(" oops!Your Value is grater than Computer Value");
                }
                else if(inputNumber<number){
                    System.out.println("OOPs! Your value is less than computer value");
                }
        return false;
    }
}
