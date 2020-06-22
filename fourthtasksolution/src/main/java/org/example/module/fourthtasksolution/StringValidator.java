package org.example.module.fourthtasksolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StringValidator {

    static char reverse(char c) {
        switch (c) {
            case')':
                return '(';
            case'}':
                return '{';
            default:
                return '[';
        }
    }

    public static boolean stringChecking(String str) {
        boolean validString = false;
        Stack<Character> stack = new Stack<>();
        int flag = 0;
        if(str.isBlank() || str.isEmpty()) {
            validString = true;
            System.out.println("Строка допустима!");
        } else {
            for(int i = 0; i < str.length(); i++) {
                if(flag > 0) {
                    break;
                }
                if((str.charAt(i) == '(') || (str.charAt(i) == '{') || (str.charAt(i) == '[')) {
                    stack.push(str.charAt(i));
                }
                if((str.charAt(i) == ')') || (str.charAt(i) == '}') || (str.charAt(i) == ']')) {
                    if(stack.empty() || (stack.peek() != reverse(str.charAt(i)))) {
                        flag = 1;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(!stack.empty()) {
                flag = 1;
            }
            if(flag > 0) {
                validString = false;
                System.out.println("Строка НЕдопустима!");
            } else {
                validString = true;
                System.out.println("Строка допустима!");
            }
        }
        return validString;
    }
}
