package GuessGame;

import java.util.Scanner;
import java.util.ArrayList;

class Guesser {
    int guessedNumber;

    public int getGuessedNumber(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Guesser, please enter your number (1-100): ");
                guessedNumber = scanner.nextInt();
                
                if (guessedNumber >= 1 && guessedNumber <= 100) {
                    return guessedNumber;
                } else {
                    System.out.println("❌ Please enter a number between 1 and 100!");
                }
            } catch (Exception e) {
                System.out.println("❌ Invalid input! Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}

class Player {
    int guessedNumber;

    public int getGuessedNumber(Scanner scanner) {
        while (true) {
            try {
                guessedNumber = scanner.nextInt();
                
                if (guessedNumber >= 1 && guessedNumber <= 100) {
                    return guessedNumber;
                } else {
                    System.out.println("❌ Please enter a number between 1 and 100!");
                    System.out.print("Try again: ");
                }
            } catch (Exception e) {
                System.out.println("❌ Invalid input! Please enter a valid number.");
                System.out.print("Try again: ");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}

class Umpire {
    int guesserNumber;
    int[] playerNumbers;
    int numberOfPlayers;

    public int getNumberOfPlayers(Scanner scanner) {
        while (true) {
            try {
                System.out.println("How many players will be playing? (2-6): ");
                numberOfPlayers = scanner.nextInt();
                
                if (numberOfPlayers >= 2 && numberOfPlayers <= 6) {
                    playerNumbers = new int[numberOfPlayers];
                    return numberOfPlayers;
                } else {
                    System.out.println("❌ Please enter a number between 2 and 6!");
                }
            } catch (Exception e) {
                System.out.println("❌ Invalid input! Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
    }

    public void collectNumberFromGuesser(Scanner scanner) {
        Guesser guesser = new Guesser();
        guesserNumber = guesser.getGuessedNumber(scanner);
    }

    public void collectNumberFromPlayers(Scanner scanner) {
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Player " + (i + 1) + ", please enter your guess (1-100): ");
            Player player = new Player();
            playerNumbers[i] = player.getGuessedNumber(scanner);
        }
    }

    public void compareResults() {
        ArrayList<Integer> winners = new ArrayList<>();
        
        for (int i = 0; i < numberOfPlayers; i++) {
            if (guesserNumber == playerNumbers[i]) {
                winners.add(i + 1); // Player numbers start from 1
            }
        }
        
        if (winners.size() == 0) {
            System.out.println("😔 Sorry! All players lost the game. Better luck next time!");
        } else if (winners.size() == 1) {
            System.out.println("🎉 Congratulations! Player " + winners.get(0) + " won the game!");
        } else if (winners.size() == numberOfPlayers) {
            System.out.println("🎉 Congratulations! All players won the game!");
        } else {
            System.out.print("🎉 Congratulations! Player");
            if (winners.size() == 2) {
                System.out.print("s " + winners.get(0) + " and " + winners.get(1));
            } else {
                System.out.print("s ");
                for (int i = 0; i < winners.size() - 1; i++) {
                    System.out.print(winners.get(i) + ", ");
                }
                System.out.print("and " + winners.get(winners.size() - 1));
            }
            System.out.println(" won the game!");
        }
    }

    public void displayGameSummary() {
        System.out.println("\n📊 === GAME SUMMARY ===");
        System.out.println("Guesser's number: " + guesserNumber);
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Player " + (i + 1) + "'s guess: " + playerNumbers[i]);
        }
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
            umpire.getNumberOfPlayers(scanner);
            umpire.collectNumberFromGuesser(scanner);
            umpire.collectNumberFromPlayers(scanner);
            umpire.displayGameSummary();
            umpire.compareResults();
            
            System.out.println("\n🔄 Do you want to play another round? (y/n): ");
            String choice;
            while (true) {
                choice = scanner.next().toLowerCase();
                if (choice.equals("y") || choice.equals("yes") || choice.equals("n") || choice.equals("no")) {
                    break;
                } else {
                    System.out.println("❌ Please enter 'y' for yes or 'n' for no: ");
                }
            }
            
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
