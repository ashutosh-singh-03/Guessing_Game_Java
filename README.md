# 🎯 Guessing Game

A fun multiplayer number guessing game built in Java where players try to match the guesser's number!

## 🎮 How to Play

1. **Guesser** enters a secret number
2. **3 Players** each make their guesses
3. **Winners** are those who match the guesser's number
4. Play multiple rounds and track your progress!

## 🚀 Features

- ✨ Interactive console-based gameplay
- 🔄 Multiple rounds with loop functionality
- 📊 Game summary after each round
- 🎉 Celebratory messages for winners
- 📈 Round counter and statistics

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
java -cp bin GuessGame.myGuesserGame
```

## 📁 Project Structure

```
Guesser_Game/
├── src/
│   └── GuessGame/
│       └── myGuesserGame.java    # Main game file
├── bin/                          # Compiled classes
├── lib/                          # Dependencies (if any)
├── run.bat                       # Quick run script
└── README.md                     # This file
```

## 🎯 Game Rules

- Each round consists of one guesser and three players
- Players win by matching the guesser's exact number
- Multiple players can win in the same round
- Game continues until you choose to exit

## 🔧 Requirements

- Java 8 or higher
- Command line interface

## 🤝 Contributing

Feel free to fork this project and submit pull requests for improvements!

## 📝 License

This project is open source and available under the MIT License.
