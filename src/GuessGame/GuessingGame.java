package GuessGame;

import java.util.Scanner;

class Guesser {
    int guessedNumber;

    public int getGuessedNumber(Scanner scanner) {
        System.out.println("Guesser, please enter your number: ");
        guessedNumber = scanner.nextInt();
        return guessedNumber;
    }
}

class Player {
    int guessedNumber;

    public int getGuessedNumber(Scanner scanner) {
        guessedNumber = scanner.nextInt();
        return guessedNumber;
    }
}

class Umpire {
    int guesserNumber, player1Number, player2Number, player3Number;

    public void collectNumberFromGuesser(Scanner scanner) {
        Guesser guesser = new Guesser();
        guesserNumber = guesser.getGuessedNumber(scanner);
    }

    public void collectNumberFromPlayers(Scanner scanner) {
        System.out.println("Player 1, please enter your guess: ");
        Player player1 = new Player();
        player1Number = player1.getGuessedNumber(scanner);

        System.out.println("Player 2, please enter your guess: ");
        Player player2 = new Player();
        player2Number = player2.getGuessedNumber(scanner);

        System.out.println("Player 3, please enter your guess: ");
        Player player3 = new Player();
        player3Number = player3.getGuessedNumber(scanner);
    }

    public void compareResults() {
        if (guesserNumber == player1Number) {
            if (guesserNumber == player2Number && guesserNumber == player3Number)
                System.out.println("🎉 Congratulations! All players won the game!");
            else if (guesserNumber == player2Number)
                System.out.println("🎉 Congratulations! Player 1 and Player 2 won the game!");
            else if (guesserNumber == player3Number)
                System.out.println("🎉 Congratulations! Player 1 and Player 3 won the game!");
            else
                System.out.println("🎉 Congratulations! Player 1 won the game!");
        } else if (guesserNumber == player2Number) {
            if (guesserNumber == player3Number)
                System.out.println("🎉 Congratulations! Player 2 and Player 3 won the game!");
            else
                System.out.println("🎉 Congratulations! Player 2 won the game!");
        } else if (guesserNumber == player3Number)
            System.out.println("🎉 Congratulations! Player 3 won the game!");
        else
            System.out.println("😔 Sorry! All players lost the game. Better luck next time!");
    }

    public void displayGameSummary() {
        System.out.println("\n📊 === GAME SUMMARY ===");
        System.out.println("Guesser's number: " + guesserNumber);
        System.out.println("Player 1's guess: " + player1Number);
        System.out.println("Player 2's guess: " + player2Number);
        System.out.println("Player 3's guess: " + player3Number);
        System.out.println("========================\n");
    }
}

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        int gameCount = 1;
        
        System.out.println("🎯 === WELCOME TO THE GUESSING GAME ===");
        
        while (playAgain) {
            System.out.println("\n🎮 === ROUND " + gameCount + " ===");
            
            Umpire umpire = new Umpire();
            umpire.collectNumberFromGuesser(scanner);
            umpire.collectNumberFromPlayers(scanner);
            umpire.displayGameSummary();
            umpire.compareResults();
            
            System.out.println("\n🔄 Do you want to play another round? (y/n): ");
            String choice = scanner.next().toLowerCase();
            
            if (choice.equals("y") || choice.equals("yes")) {
                gameCount++;
                playAgain = true;
            } else {
                playAgain = false;
            }
        }
        
        System.out.println("🎯 === GAME OVER - THANKS FOR PLAYING! ===");
        System.out.println("📊 Total rounds played: " + gameCount);
        scanner.close();
    }
}
