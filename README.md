# 🎯 Guessing Game

A multiplayer number guessing game available in both Java console and web versions. Players try to match the guesser's secret number with support for 2-6 players, custom names, and input validation.

## 🎮 How to Play

1. Choose 2-6 players and enter custom names
2. Guesser sets a secret number (1-100)
3. Players take turns guessing the number
4. Winners are announced (multiple players can win)
5. Play multiple rounds or exit anytime

## ✨ Features

- **Flexible Player Count**: 2-6 players per round
- **Custom Names**: Personalized player names (1-15 characters)
- **Input Validation**: Handles invalid inputs and duplicates
- **Multiple Rounds**: Play as many rounds as desired
- **Cross-Platform**: Java console and web browser versions

## 🚀 Quick Start

### Java Console Version
```bash
# Option 1: Use batch file
run.bat

# Option 2: Manual compilation
javac -d bin src\GuessGame\*.java
java -cp bin GuessGame.GuessingGame
```

### Web Browser Version
```bash
# Navigate to web folder and start server
cd web
python -m http.server 8000
# Open browser to http://localhost:8000

# Or simply double-click web/index.html
```

## 📁 Project Structure

```
Guesser_Game/
├── src/GuessGame/
│   └── GuessingGame.java     # Java console version
├── web/
│   ├── index.html            # Web interface
│   ├── style.css             # Styling
│   └── script.js             # Game logic
├── run.bat                   # Quick start script
└── README.md                 # Documentation
```

## 🎯 Version Comparison

| Feature | Java Console | Web Browser |
|---------|--------------|-------------|
| Core Gameplay | ✓ | ✓ |
| Input Validation | ✓ | ✓ |
| Custom Names | ✓ | ✓ |
| Mobile Support | ❌ | ✓ |
| Visual Interface | Text-based | Modern UI |

## 🎲 Sample Gameplay

```
🎯 === GUESSING GAME ===
Players (2-6): 3
Names: Alice, Bob, Charlie
Guesser's number: 42
Alice's guess: 35
Bob's guess: 42
Charlie's guess: 50
🎉 Winner: Bob!
```
