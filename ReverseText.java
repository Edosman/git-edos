package com.company;
import java.util.Stack;

public class ReverseText {

    private String inputString;


    public ReverseText(String inputString) {
        this.inputString = inputString;
    }

    public void revers(){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < inputString.length() ; i++) {
            stack.push(inputString.charAt(i));
        }
        for (int i = 0; i < inputString.length() ; i++) {
            System.out.print(stack.pop());
        }

    }
}
