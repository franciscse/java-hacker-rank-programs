# Java End-of-File Solution

This repository contains a Java solution to the "End-of-File" problem, often found on coding challenge websites like HackerRank.

## Problem Description

The challenge requires reading lines of input from standard input (stdin) until the End-of-File (EOF) is reached. Each line contains a non-empty string. The program should then output each line, preceded by its line number.

## Solution

The Java program `EOFRead.java` provides a solution using the `Scanner` class and its `hasNextLine()` method to detect EOF.

**Key Concepts:**

* **`Scanner` class:** Used for reading input from various sources, including `System.in`.
* **`hasNextLine()` method:**  Returns `true` if there is another line of input to read, and `false` when EOF is reached.
* **`nextLine()` method:** Reads the next line of input.

## How to Run

1.  **Save:** Save the `EOFRead.java` file to your local machine.
2.  **Compile:** Open a terminal or command prompt and compile the code using the following command:
    ```bash
    javac EOFRead.java
    ```
3.  **Run:** Execute the compiled code with the following command:
    ```bash
    java EOFRead
    ```
4.  **Input:** The program will wait for input. Type or paste your input lines, and press Enter after each line. To signal EOF, you typically use Ctrl+D (Linux/macOS) or Ctrl+Z (Windows).

## Sample Input and Output

**Input:**
Hello world <br>
I am a file<br>
Read me until end-of-file.<br>


**Output:**

1 Hello world<br>
2 I am a file<br>
3 Read me until end-of-file.<br>


## Contributing

Feel free to fork this repository and submit pull requests for improvements or alternative solutions.
