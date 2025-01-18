# Series Calculation

This Java program calculates and prints a series of numbers based on user input.

## How it Works

The program takes three integer inputs: `a`, `b`, and `n`. It then generates a series of numbers using the following formula:

(a + (2^0) * b), (a + (2^0) * b + (2^1) * b), (a + (2^0) * b + (2^1) * b + (2^2) * b), ..., (a + (2^0) * b + (2^1) * b + ... + (2^(n-1)) * b)


where:

* `a` is the initial value
* `b` is the base value
* `n` is the number of terms in the series

The program calculates each term of the series and prints it to the console.

## How to Run

1.  Save the code as a `.java` file (e.g., `Solution.java`).
2.  Compile the code using a Java compiler:
    ```bash
    javac Solution.java
    ```
3.  Run the compiled code:
    ```bash
    java Solution
    ```
4.  Enter the values for `a`, `b`, and `n` when prompted.

## Example Usage

**Input:**

a = 2
b = 3
n = 5


**Output:**

2 5 11 23 47


**Explanation:**

The program calculates the following series:

2 + 3, 2 + 3 + 2(3), 2 + 3 + 2(3) + 4(3), 2 + 3 + 2(3) + 4(3) + 8(3)
= 2 + 3, 2 + 3 + 6, 2 + 3 + 6 + 12, 2 + 3 + 6 + 12 + 24


and prints each term:

2 5 11 23 47
