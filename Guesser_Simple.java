
import java.util.Random;
import java.util.Scanner;

/***************************************************************/
/***          Guesser_Simple - Number guessing game          ***/
/***************************************************************/

public class Guesser_Simple {

    public static void main(String[] args) {

        boolean victory = false;                                //Set bolean victory = False initially

        Random rand = new Random();
        int random_value = rand.nextInt(10);                    //Random_value = random number between 1 and 10
        try {
            Scanner guessed = new Scanner(System.in);               //User input 'guessed' needs to be an integer


            while (victory != true){                                        //While 'victory' is false
                System.out.println("Guess a number between 1 and 10.");     //Print this statement
                int n = guessed.nextInt();                                  //n = guessed

                if (n > random_value){                                          //If 'n' is greater than 'random_value'
                    System.out.println("Your guess is too high. Try again.");   //Print this statement
                    victory = false;}                                           //'victory' is still false
                else if (n < random_value) {                                            //If 'n' is less than 'random_value'
                    System.out.println("Your guess is too low. try again.");            //Print this statement
                    victory = false;}                                                   //'victory' is still false
                else if (n == random_value){                                    //If 'n' is equal to 'random_value'
                    System.out.println("Yes, you are correct!");                //Print this statement
                    victory = true;}}                                           //'victory' is now true
        }
        catch (Exception e){                                                        //Catch anything that is not an integer
            System.out.println("You must guess an integer between 1 and 10.");      //Print this statement
        }






    }
}