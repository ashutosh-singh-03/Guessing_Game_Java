# 🎯 Guessing Game

A fun multiplayer number guessing game built in Java where players try to match the guesser's number! Features flexible player count, custom names, and robust input validation.

## 🎮 How to Play

1. **Choose Players**: Select 2-6 players for each round
2. **Enter Names**: Each player enters their custom name
3. **Guesser Sets Number**: Guesser enters a secret number (1-100)
4. **Players Guess**: Each player tries to guess the number
5. **Winners Announced**: Players who match the guesser's number win!
6. **Play Multiple Rounds**: Continue playing as many rounds as you want

## 🚀 Features

### ✨ Core Gameplay
- 🎯 **Flexible Player Count**: Choose 2-6 players per round
- 👥 **Custom Player Names**: Personalized gameplay with your own names
- 🎲 **Number Range**: Guess numbers between 1-100
- 🏆 **Multiple Winners**: Multiple players can win in the same round
- 🔄 **Endless Rounds**: Play as many rounds as you want

### 🛡️ Input Validation & Error Handling
- ✅ **Number Range Validation**: Only accepts numbers 1-100
- 🚫 **Invalid Input Protection**: Handles non-numeric input gracefully
- � **Name Validation**: Names must be 1-15 characters, no duplicates
- 💬 **Clear Error Messages**: User-friendly feedback with helpful guidance
- 🔄 **Smart Input Prompts**: Re-prompts for valid input automatically

### 🎨 Enhanced User Experience
- 🎉 **Celebratory Messages**: Fun congratulatory messages for winners
- � **Game Summary**: Clear display of all guesses after each round
- 🎮 **Round Tracking**: Shows current round number and total rounds played
- 👋 **Welcome Messages**: Personal welcome for each player
- 🎯 **Section Headers**: Clear visual separation of game phases

## 🛠️ How to Run

### Option 1: Using the Batch File
```bash
run.bat
```

### Option 2: Manual Compilation and Execution
```bash
# Navigate to project directory
cd Guesser_Game

# Compile the Java files
javac -d bin src\GuessGame\*.java

# Run the game
java -cp bin GuessGame.GuessingGame
```

## 📁 Project Structure

```
Guesser_Game/
├── src/
│   └── GuessGame/
│       └── GuessingGame.java     # Main game file with all features
├── bin/                          # Compiled classes (auto-generated)
├── lib/                          # Dependencies (if any)
├── .gitignore                    # Git ignore file
├── LICENSE                       # MIT License
├── run.bat                       # Quick run script for Windows
└── README.md                     # This documentation
```

## 🎯 Game Rules

- **Player Count**: 2-6 players per round
- **Number Range**: All numbers must be between 1-100
- **Winning Condition**: Players win by exactly matching the guesser's number
- **Multiple Winners**: Several players can win in the same round
- **Round System**: Play continues until you choose to exit
- **Name Rules**: Each player must have a unique name (1-15 characters)

## 🎲 Sample Gameplay

```
🎯 === WELCOME TO THE GUESSING GAME ===

🎮 === ROUND 1 ===
How many players will be playing? (2-6): 3

👥 Let's get to know the players!
Player 1, please enter your name: Alice
✅ Welcome, Alice!
Player 2, please enter your name: Bob
✅ Welcome, Bob!
Player 3, please enter your name: Charlie
✅ Welcome, Charlie!

Guesser, please enter your number (1-100): 42

🎯 Time for guesses!
Alice, please enter your guess (1-100): 35
Bob, please enter your guess (1-100): 42
Charlie, please enter your guess (1-100): 50

📊 === GAME SUMMARY ===
Guesser's number: 42
Alice's guess: 35
Bob's guess: 42
Charlie's guess: 50
========================

🎉 Congratulations! Bob won the game!
```

## 🆕 Recent Updates

### Version 2.0 Features:
- ✅ **Input Validation**: Robust error handling and input validation
- ✅ **Flexible Player Count**: Support for 2-6 players per round
- ✅ **Custom Player Names**: Personalized gameplay experience
- 🔄 **Coming Soon**: Player scoring system across multiple rounds

## 🐛 Error Handling

The game gracefully handles:
- Invalid number inputs (letters, symbols, etc.)
- Numbers outside the 1-100 range
- Duplicate player names
- Invalid player count selections
- Improper yes/no responses