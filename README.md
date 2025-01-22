# Stack Operations
## Project Overview

Stack Navigator is a Java application that demonstrates fundamental stack data structure operations. Built using an array-based implementation, this tool allows users to interact with a stack through a command-line interface, including pushing, popping, printing, checking for palindromes, and removing the middle element.

This project provides a hands-on exploration of how a stack works, and how it is manipulated.

## Key Features

*   **Stack Push:** Allows users to push multiple strings onto the stack at once.
*   **Stack Pop:** Removes and returns the element at the top of the stack.
*   **Stack Print:** Displays the current content of the stack to the console.
*   **Palindrome Check:** Determines if the elements in the stack form a palindrome.
*   **Middle Element Removal:** Removes the middle element of the stack (if it has an odd number of elements).
*   **Error Handling:** Implements exception handling to deal with user errors and runtime scenarios gracefully.

## How to Use Stack Operations

1.  After launching the application, you'll be presented with a menu of options:
    *   **1 - Push:**  Add elements to the stack.
    *   **2 - Pop:** Remove the element at the top of the stack.
    *   **3 - Print:** Display the content of the stack.
    *   **4 - Delete Middle:** Attempt to remove the middle element of the stack.
    *   **5 - isPalindrome:** Check if the stack’s elements form a palindrome.
    *   **6 - Exit:** Terminate the program.

2.  Enter your choice, and the application will respond accordingly, providing output to the console and requesting further input as needed.

## File Structure
├── StackArray.java # Implementation of the array-based Stack
├── Stack_Operations.java # Main class for the Stack Navigator application
└── README.md # This document

## Technical Details

*   **Array-Based Stack:** The stack is implemented using an array of strings. The array has a fixed capacity.
*   **LIFO Structure:** Implements Last-In-First-Out stack structure. The most recently added element is the first to be removed.
*   **Palindrome Checking:** The palindrome check algorithm is optimized to traverse the stack in a way that only one copy of stack is necessary to do the verification
*  **Middle element deletion:** The deletion of the middle element is done by traversing the stack up to the middle and then doing a pop operation to the middle element.

## Notes and Considerations
*   This project was developed to offer a hands-on experience with stack operations.
*   This code is for educational purposes and emphasizes the understanding and implementation of data structure.
*   This code is easily extendible and can be modified to different implementations of the stack class.
