# 🌐 Web Version - Guessing Game

This is the web version of the Guessing Game built with vanilla HTML, CSS, and JavaScript.

## 🚀 How to Run

### Option 1: Direct File Opening
1. Navigate to the `web` folder
2. Double-click `index.html` to open in your browser

### Option 2: Local Server (Recommended)
1. Navigate to the `web` folder in your terminal
2. Run a simple HTTP server:

**Python 3:**
```bash
python -m http.server 8000
```

**Python 2:**
```bash
python -m SimpleHTTPServer 8000
```

**Node.js (if you have it):**
```bash
npx http-server
```

3. Open your browser and go to `http://localhost:8000`

## 🎮 Features

- ✨ **Beautiful UI**: Modern, responsive design with smooth animations
- 🎯 **All Java Features**: Includes all features from the Java version
- 📱 **Mobile Friendly**: Works great on phones and tablets
- ⌨️ **Keyboard Support**: Use Enter key to navigate through forms
- 🎨 **Visual Feedback**: Clear error messages and success states
- 🔄 **Smooth Transitions**: Animated phase transitions

## 🛠️ Technical Details

- **HTML**: Semantic structure with accessible forms
- **CSS**: Modern CSS with Flexbox, gradients, and animations
- **JavaScript**: Clean ES6+ code with proper error handling
- **No Dependencies**: Pure vanilla code, no frameworks needed

## 📱 Responsive Design

The interface adapts to different screen sizes:
- **Desktop**: Full-width layout with fixed round counter
- **Tablet**: Optimized spacing and button sizes
- **Mobile**: Stacked layout with full-width buttons

## 🎯 Game Flow

1. **Setup**: Choose player count (2-6) and enter names
2. **Secret Number**: Guesser sets the secret number (1-100)
3. **Guessing**: Each player takes their turn
4. **Results**: View game summary and winners
5. **Continue**: Play another round or start a new game
