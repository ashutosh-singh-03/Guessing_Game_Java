// Simple Game State
let players = [];
let currentPlayerIndex = 0;
let secretNumber = null;
let guesses = [];
let roundNumber = 1;

// Get DOM elements
const setupPhase = document.getElementById('setup-phase');
const guesserPhase = document.getElementById('guesser-phase');
const guessingPhase = document.getElementById('guessing-phase');
const resultsPhase = document.getElementById('results-phase');

// Initialize when page loads
document.addEventListener('DOMContentLoaded', function() {
    document.getElementById('set-players-btn').onclick = setupPlayers;
    document.getElementById('start-game-btn').onclick = startGame;
    document.getElementById('set-secret-btn').onclick = setSecret;
    document.getElementById('submit-guess-btn').onclick = submitGuess;
    document.getElementById('play-again-btn').onclick = playAgain;
    document.getElementById('new-game-btn').onclick = newGame;
});

// Show specific game phase
function showPhase(phase) {
    document.querySelectorAll('.phase').forEach(p => p.classList.remove('active'));
    document.getElementById(phase + '-phase').classList.add('active');
}

// Setup players
function setupPlayers() {
    const count = parseInt(document.getElementById('player-count').value);
    
    if (count < 2 || count > 6) {
        alert('Please enter a number between 2 and 6');
        return;
    }
    
    // Create name input fields
    const nameInputs = document.getElementById('name-inputs');
    nameInputs.innerHTML = '';
    
    for (let i = 0; i < count; i++) {
        const div = document.createElement('div');
        div.innerHTML = `
            <input type="text" id="player-${i}" placeholder="Player ${i + 1} name" maxlength="15">
        `;
        nameInputs.appendChild(div);
    }
    
    document.getElementById('player-names').classList.remove('hidden');
    document.getElementById('start-game-btn').classList.remove('hidden');
    document.getElementById('set-players-btn').disabled = true;
}

// Start the game
function startGame() {
    const nameInputs = document.querySelectorAll('#name-inputs input');
    players = [];
    
    // Get all player names
    for (let input of nameInputs) {
        const name = input.value.trim();
        if (!name) {
            alert('Please enter all player names');
            return;
        }
        if (players.includes(name)) {
            alert('Player names must be unique');
            return;
        }
        players.push(name);
    }
    
    showPhase('guesser');
}

// Set secret number
function setSecret() {
    const secret = parseInt(document.getElementById('secret-number').value);
    
    if (!secret || secret < 1 || secret > 100) {
        alert('Please enter a number between 1 and 100');
        return;
    }
    
    secretNumber = secret;
    currentPlayerIndex = 0;
    guesses = [];
    
    showPhase('guessing');
    updateCurrentPlayer();
}

// Update current player display
function updateCurrentPlayer() {
    if (currentPlayerIndex < players.length) {
        document.getElementById('current-player-name').textContent = 
            players[currentPlayerIndex] + "'s turn";
        document.getElementById('player-guess').value = '';
    } else {
        showResults();
    }
}

// Submit player guess
function submitGuess() {
    const guess = parseInt(document.getElementById('player-guess').value);
    
    if (!guess || guess < 1 || guess > 100) {
        alert('Please enter a number between 1 and 100');
        return;
    }
    
    guesses.push({
        player: players[currentPlayerIndex],
        guess: guess
    });
    
    currentPlayerIndex++;
    updateCurrentPlayer();
}

// Show game results
function showResults() {
    showPhase('results');
    
    // Show secret number
    document.getElementById('secret-reveal').innerHTML = 
        `<h4>🎯 Secret Number: ${secretNumber}</h4>`;
    
    // Show all guesses
    const allGuesses = document.getElementById('all-guesses');
    allGuesses.innerHTML = '<h4>📋 All Guesses:</h4>';
    
    guesses.forEach(item => {
        const div = document.createElement('div');
        div.className = 'guess-item';
        if (item.guess === secretNumber) {
            div.classList.add('winner');
        }
        div.innerHTML = `
            <span>${item.player}</span>
            <span>${item.guess} ${item.guess === secretNumber ? '🎉' : ''}</span>
        `;
        allGuesses.appendChild(div);
    });
    
    // Show winners
    const winners = guesses.filter(item => item.guess === secretNumber);
    const announcement = document.getElementById('winners-announcement');
    
    if (winners.length === 0) {
        announcement.innerHTML = '😔 No winners this round. Better luck next time!';
        announcement.className = 'no-winners';
    } else if (winners.length === 1) {
        announcement.innerHTML = `🎉 Congratulations ${winners[0].player}! You won!`;
        announcement.className = 'winners';
    } else {
        const names = winners.map(w => w.player).join(', ');
        announcement.innerHTML = `🎉 Congratulations ${names}! You won!`;
        announcement.className = 'winners';
    }
    
    // Update round counter
    document.getElementById('round-counter').textContent = `Round ${roundNumber}`;
}

// Play another round
function playAgain() {
    roundNumber++;
    currentPlayerIndex = 0;
    guesses = [];
    secretNumber = null;
    
    document.getElementById('secret-number').value = '';
    showPhase('guesser');
}

// Start completely new game
function newGame() {
    players = [];
    currentPlayerIndex = 0;
    secretNumber = null;
    guesses = [];
    roundNumber = 1;
    
    // Reset all inputs
    document.getElementById('player-count').value = '3';
    document.getElementById('secret-number').value = '';
    document.getElementById('player-guess').value = '';
    document.getElementById('player-names').classList.add('hidden');
    document.getElementById('start-game-btn').classList.add('hidden');
    document.getElementById('set-players-btn').disabled = false;
    document.getElementById('name-inputs').innerHTML = '';
    
    showPhase('setup');
}
