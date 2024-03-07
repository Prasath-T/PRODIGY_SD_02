import java.util.Scanner; 

public class GuessingGame {
     
        public static void main(String[] args) 
       {
           System.out.println("\n\nLet's play a game.  \nI'll pick a number between 1 and 100");
           System.out.println("\nyou can try to guess it.");
           Scanner sc1 = new Scanner(System.in); 
           String playAgain;
           String play="y";

           do {
              playGame();  // call subroutine to play one game
              System.out.println("Would you like to play again?Y/N");
              playAgain = sc1.nextLine();  
              } while (playAgain.equals(play));
          System.out.println("Thanks for playing.Goodbye.");
        }         
        
        static void playGame() {
            int computersNumber; 
            int usersGuess;      
            int guessCount;      
            computersNumber = (int)(100 * Math.random()) + 1;
            guessCount = 0;
            System.out.println();
            System.out.println("What is your first guess?");
            Scanner sc= new Scanner(System.in);  

            while (true) {
               usersGuess = sc.nextInt();  
               guessCount++;
               if (usersGuess == computersNumber) {
                  System.out.println("You got it in " + guessCount
                          + " guesses!  My number was " + computersNumber);
                  break;  
               }

               if (usersGuess < computersNumber)
                  System.out.println("That's too low.  Try again:");
               else if (usersGuess > computersNumber)
                  System.out.println("That's too high.  Try again:");
            }
            System.out.println();
        } 
                    
     } 

     