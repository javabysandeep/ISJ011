package _16_collection.listImpl;

import java.util.Stack;

public class Demo26Stack {
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
/*
        System.out.println("size of stack before removal : " + bookStack.size());
        System.out.println(bookStack.pop());
        System.out.println(bookStack.pop());
        System.out.println(bookStack.pop());
        System.out.println(bookStack.pop());
        System.out.println(bookStack.pop());
        System.out.println(bookStack.pop());
        System.out.println("size of stack after removal : " + bookStack.size());*/

        for (String temp : bookStack) {
            System.out.println(temp);
        }
    }
}
