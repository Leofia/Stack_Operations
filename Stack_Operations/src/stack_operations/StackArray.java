/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_operations;

/**
 *
 * @author ANIL
 */
public class StackArray {
    String data[]; 
 int top; 
 
 public StackArray(int N) {
 data = new String[N];
 top = -1;
 }
  
 
 public void push(String element) {
 if (!isFull()) {
 top++;
 data[top] = element;

 }
 }
 public String pop() {
 if (isEmpty()) {
 throw new java.util.NoSuchElementException();
 } else {
 top--;
 return data[top + 1];
 }
 }
 public boolean isFull() {
 return top == data.length - 1;
 }
 public boolean isEmpty() {
 return top == - 1;
 }

    
}
