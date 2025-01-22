package stack_operations;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;


/**
 *
 * @author ANIL
 */
public class Stack_Operations {
    static StackArray stack =new  StackArray(100);
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        int menu = 0;
        
        Scanner scn = new Scanner(System.in);
    
        while(menu != 6){
            System.out.println("Which task you want to do?");
            System.out.println("1- push");
            System.out.println("2- pop");
            System.out.println("3- Print");
            System.out.println("4- Delete middle");
            System.out.println("5- isPalindrome");
            System.out.println("6- exit");
            System.out.println("Please enter a digit (1-6):");
        
           try {
                 menu = scn.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                scn.next(); // Clear the invalid input from scanner.
                continue; // Go back to the beginning of loop.
            }
    
     switch(menu){
        case 1:
            try {
                System.out.println("How may pushes you want to do?" );
                int pushTime = scn.nextInt();
                System.out.println("Enter "+pushTime+" strings" );
                for(int i=0; i<pushTime; i++){
                    String str = scn.next();
                    stack.push(str);
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input for push count. Please enter an integer.");
                scn.next(); // Clear the invalid input from scanner.
            }
            
            break;
        case 2:
            try{
               stack.pop();
                System.out.println("Top element has been removed");
            }
            catch(NoSuchElementException e) {
                System.out.println("Stack is empty. Cannot pop.");
            }
            break;
        case 3:
            System.out.println("The content of stack is:" );
            printStack(stack);
            break;
        case 4:
            deleteMiddle(stack);
            break;
        case 5:
            if(ispalindrome(stack)){
                System.out.println("The stack is palindrome.");
            }
            else {
                System.out.println("The stack is not palindrome");
            }
            break;
        case 6:
            System.out.println("Exiting...");
            System.exit(0);
            break;
        default:
              System.out.println("Invalid input. Please enter a number between 1 and 6.");
              break;
     }    
    }
    
}

     public static void printStack(StackArray stack){
        if(stack.isEmpty()){
            System.out.println(" There is nothing to print");
            return;
           
        }
        StackArray temp=new StackArray(stack.top+1);
        while(!stack.isEmpty()){
        

        String newPeek = stack.pop();
        temp.push(newPeek);
        
        
        System.out.print(newPeek+" ");
     }
         System.out.println(" ");
         while(!temp.isEmpty()){
              
             stack.push(temp.pop());
         }
        
        
    }
     public static boolean ispalindrome(StackArray enteredStack) {
        StackArray tempStack = new StackArray(enteredStack.top+1);
        int bottomCount=enteredStack.top;
        int count=0;
        String topValue;
        String bottomValue;


        if(enteredStack.isEmpty()){
            System.out.println("Stack is empty");
            return false;


        }else if((enteredStack.top+1)%2!=0){


           do{
               for(int i=0;i<count;i++){

                   tempStack.push(enteredStack.pop());

               }
               topValue=enteredStack.data[enteredStack.top];
                while(!tempStack.isEmpty()){
                   enteredStack.push(tempStack.pop());
               }

               for(int j=0;j<bottomCount;j++){
                   tempStack.push(enteredStack.pop());

               }
               bottomValue=enteredStack.data[enteredStack.top];

               while(!tempStack.isEmpty()){
                   enteredStack.push(tempStack.pop());
               }
               if((!topValue.equals(bottomValue))){
                   return false;
               }
               count++;
               bottomCount--;


           }while(topValue.equals(bottomValue)&& bottomCount>=0);

           return true;
        }

        else
           do{
               for(int i=0;i<count;i++){

                   tempStack.push(enteredStack.pop());

               }
               topValue=enteredStack.data[enteredStack.top];
                while(!tempStack.isEmpty()){
                   enteredStack.push(tempStack.pop());
               }

               for(int j=0;j<bottomCount;j++){
                   tempStack.push(enteredStack.pop());

               }
               bottomValue=enteredStack.data[enteredStack.top];

               while(!tempStack.isEmpty()){
                   enteredStack.push(tempStack.pop());
               }
               if((!topValue.equals(bottomValue))){
                   return false;
               }
               count++;
               bottomCount--;


           }while((topValue.equals(bottomValue))&& bottomCount>=0);

           return true;
     }
     
        
        
     
     public static void deleteMiddle(StackArray stack) {
         
          StackArray temp = new StackArray(stack.top+1);
         if((stack.top +1) %2==0){
             System.out.println("Array is even, there is not a middle value");
         }
         else if(stack.isEmpty()){
             System.out.println("Array is empty, there is not a middle value");
         }
         else{
             int size = (stack.top+1) ;
             int middle = (stack.top+2)/2;
             
             for(int i=0; i<middle-1; i++){
                 
                
                 temp.push(stack.pop());

                 
             }
           try {
                 stack.pop();
                  System.out.println("middle element has been deleted");
             }
              catch (NoSuchElementException e){
             
              System.out.println("Cannot delete middle element because the stack is empty");
             }
             while(!temp.isEmpty()){
                 
                 stack.push(temp.pop());
                 
                 
             }
            
                        
         }                 
     }
     
     

       
    
}