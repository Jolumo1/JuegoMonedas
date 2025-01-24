# Coin Game - Java Project

## Overview
This **Coin Game** is a simple console-based Java application designed to simulate a game where coins are randomly generated with specific values and positions (either "heads" or "tails"). 
The main objective is to generate a sequence of 6 coins, ensuring that each new coin in the sequence shares either its value or position with the previous coin. This project serves as a fun and interactive way to practice Java programming concepts, including random number generation, loops, and condition checking.

All functionality occurs in the **console**, where users can interact with the game through a text-based menu and view the results of the game directly in the console output.

## Purposes:
This project is a great way for beginners to practice Java programming, specifically focusing on:

  - Randomization: Using Random to generate random values.
  - Collections: Storing and working with ArrayList to manage a dynamic list of objects.
  - Condition Checking: Ensuring that generated coins match the required conditions before adding them to the sequence.
  - Looping and Error Handling: Using loops to repeat actions and basic error handling to ensure valid user input.

## Features
- **Random Coin Generation**: Each coin has a random value from a set of possible coin values (e.g., "1 cent", "2 euros") and a random position ("heads" or "tails").
- **Sequence Validation**: The game ensures that each coin in the sequence (after the first) shares either its value or position with the previous coin.
- **Simple Menu System**: The program allows the user to choose between playing the game or exiting the program through a simple text-based menu.
- **ASCII Art**: After the sequence of coins is generated, the program prints a fun coin-themed ASCII art at the end.
- **Error Handling**: The program includes basic error handling to ensure that the user input is valid (e.g., input must be an integer).

## Functions Implemented
- **`main(String[] args)`**: The entry point of the program. Displays a menu and allows the user to either start the game or exit the program.
- **`jugar()`**: The core game logic. This method generates a sequence of 6 coins and ensures that the new coins either match the value or position of the previous coin. It then prints out the generated coins and displays ASCII art at the end.
- **`generarMoneda()`**: This method generates a new coin with a random value and a random position (either "heads" or "tails").
- **`dibujo()`**: Prints a fun ASCII representation of a coin after the sequence is generated.

