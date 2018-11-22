package com.company;
import java.util.Stack;

public class Brackets {

    private String inputStr;

    public Brackets(String inputStr) {
        this.inputStr = inputStr;
    }

    public void checkBrackets(){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);

            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (stack.isEmpty()) {
                        System.out.println("Error: " + ch + " at " + i);
                    } else {
                        Character topChar = stack.pop();
                        if (ch == '}' && topChar != '{' ||
                                ch == ']' && topChar != '[' ||
                                ch == ')' && topChar != '(') {
                            System.out.println("Error: " + ch + " at " + i);
                        }
                    }
                    break;
                default:
                    break;
            }
        }

        if ( !stack.isEmpty() ) {
            System.out.println("Error: missing right delimiter");
        }
    }
}
