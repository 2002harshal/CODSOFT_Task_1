import java.util.Random;
import java.util.Scanner;
class Game {
    public int number;
    public int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random r = new Random();
        number = r.nextInt(100);
    }
    public int inputNumber;
    void takeUserInput() {
        System.out.println("Gauss the Number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.format("Yes your Guessed is right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("too low...");
        }
        else if(inputNumber>number){
            System.out.println("too high...");

        }

        return false;
    }
}
public class NumberGame {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
