package _16_collection.listImpl;

import java.util.Stack;

public class Demo25Stack {
    public static void main(String[] args) {
        Stack<String> bookStack = new Stack<>();
        bookStack.push("Inception");
        bookStack.push("Rich Dad Poor Dad");
        bookStack.push("Dogalapan");
        bookStack.push("Think and Grow Rich");
        bookStack.push("Discipline");
        bookStack.push("Champak");
        bookStack.push("do or die");
        bookStack.push("Ramaayan");
        bookStack.push("Mahabharat");
        bookStack.push("Bhagwad Gita");
        bookStack.push("Akbar & Birbal");

        bookStack.pop();
        bookStack.pop();
        bookStack.pop();
        bookStack.pop();
        bookStack.pop();
        bookStack.pop();
        bookStack.pop();
        bookStack.pop();
        bookStack.pop();
        bookStack.pop();
        bookStack.pop();
        bookStack.pop();
        System.out.println("which book is on top of the stack : " + bookStack.peek());
    }
}
