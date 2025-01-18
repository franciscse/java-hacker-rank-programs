# Java Datatype Fit Checker

This Java program determines which primitive data types can hold a given integer.

## Problem Description

Java has 8 primitive data types: `char`, `boolean`, `byte`, `short`, `int`, `long`, `float`, and `double`. This program focuses on the integer data types:

*   `byte`: 8-bit signed integer.
*   `short`: 16-bit signed integer.
*   `int`: 32-bit signed integer.
*   `long`: 64-bit signed integer.

Given an input integer, the program determines which of these data types can store it.

## How it Works

The program takes an integer input and checks if it falls within the range of each data type. If the input fits within the range of a data type, it prints a message indicating that the data type can store the input.

## How to Run

1.  Save the code as a `.java` file (e.g., `Solution.java`).
2.  Compile the code using a Java compiler:
    ```bash
    javac Solution.java
    ```
3.  Run the compiled code:
    ```bash
    java solution
    ```
4.  Enter the number of test cases when prompted.
5.  For each test case, enter an integer.

## Example Usage

**Input:**

5<br>
-150<br>
150000<br>
1500000000<br>
213333333333333333333333333333333333<br>
-100000000000000<br>


**Output:**

-150 can be fitted in:<br>

short<br>
int<br>
long 150000 can be fitted in:<br>
int<br>
long 1500000000 can be fitted in:   <br>
int<br>
long 213333333333333333333333333333333333 can't be fitted anywhere. -100000000000000 can be fitted in:<br>
long   <br>


