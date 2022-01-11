package exercise;
import java.util.Stack;
import java.io.*;


public class Stack1 {

	public static void main(String[] args) {
		Stack stack1=new Stack();
		Stack<String> stack2 = new Stack<String>(); 
		

		 stack1.push("Mango"); 
	     stack1.push("Grape"); 
	     stack1.push("Orange"); 
	     stack1.push("Apple");
	     stack1.push("Banana");
         stack1.push("Bangalore");
         stack1.push("Delhi");
         stack1.push("Mangalore");
         stack1.push("Udupi");
	     stack1.push(1);
	     stack1.push(2);
	     stack1.push(3);
	     stack1.push(4);
	     stack1.push('a');
	     stack1.push('b');
	     System.out.println(stack1);
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.pop()); 
	     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.pop()); 
	     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek()); 
         
	     System.out.println("index of elemtn All inside the stack"+ stack1.indexOf("Apple"));
	     System.out.println("index of elemtn All inside the stack"+ stack1.indexOf("Delhi"));


	     
	     
	}

}

	