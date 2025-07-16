@echo off
cd /d "%~dp0"
javac -d bin src\GuessGame\*.java
java -cp bin GuessGame.myGuesserGame
pause
