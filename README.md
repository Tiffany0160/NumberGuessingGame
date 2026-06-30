# Number Guessing Game 

## Overview

The Number Guessing Game is a simple Java console application where the computer randomly generates a number between **1 and 10**. The player must guess the correct number. After each guess, the program provides feedback indicating whether the guess is too high or too low until the correct number is guessed.

This project is ideal for beginners learning Java programming concepts such as loops, conditional statements, random number generation, and user input.

---

## Features

- Randomly generates a number between 1 and 10
- Accepts user input through the console
- Provides hints if the guess is too high or too low
- Continues until the correct number is guessed
- Displays a success message when the correct number is found

---

## Technologies Used

- Java
- Scanner Class
- Random Class
- While Loop
- Conditional Statements (if, else if, else)
- Console Input/Output

---

## Project Structure

```
NumberGuessingGame/
│
├── NumberGuessingGame.java
└── README.md
```

---

## How the Program Works

1. The program generates a random number between **1 and 10**.
2. The user is prompted to enter a guess.
3. The program compares the guess with the secret number.
4. If the guess is:
   - Lower than the secret number, the program displays **"Too low!"**
   - Higher than the secret number, the program displays **"Too high!"**
   - Correct, the program displays **"Correct! 🎉"**
5. The game continues until the correct number is guessed.

---

## Example Output

```
Guess number (1-10): 3
Too low!

Guess number (1-10): 8
Too high!

Guess number (1-10): 6
Correct! 🎉
```

---

## Learning Outcomes

This project demonstrates how to:

- Generate random numbers using the Random class
- Accept user input using the Scanner class
- Use a while loop for repetition
- Apply conditional statements
- Compare values
- Build a simple interactive console application

---

## Future Improvements

Possible enhancements include:

- Add difficulty levels (Easy, Medium, Hard)
- Limit the number of guesses
- Count and display the total number of attempts
- Allow the player to play multiple rounds
- Validate invalid user input
- Add a scoring system
- Generate numbers within larger ranges
- Create a graphical user interface (GUI)

---

## Requirements

- Java Development Kit (JDK) 8 or later
- Any Java IDE (NetBeans, IntelliJ IDEA, Eclipse, or VS Code)

---

## Author

Created as a beginner Java programming project to practice loops, user input, random number generation, and conditional logic.
