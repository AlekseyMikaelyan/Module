package org.example.module.fourthtasksolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringValidator {

    public static boolean stringChecking(String str) {
        boolean validString = false;

        if (str.isBlank() || str.isEmpty()) {
            validString = true;
        } else {

            char[] charsArray = str.toCharArray();

            if (charsArray[0] == ')' || charsArray[0] == '}' || charsArray[0] == ']') {
                validString = false;

            } else {

                int count = 0;
                for (char c : charsArray) {
                    if (c == '(' || c == ')' || c == '{' || c == '}' || c == '[' || c == ']') {
                        count++;
                    }
                }
                if (count % 2 != 0) {
                    validString = false;

                } else {
                    for (int i = 0; i < charsArray.length; i++) {
                        for (int j = i + 1; j < charsArray.length; j++) {
                            if (charsArray[i] == '(' && charsArray[j] == ')') {
                                if (j == i + 1) {
                                    validString = true;
                                    continue;
                                }
                                for (int a = i + 1; a < j; a++) {
                                    for (int b = a + 1; b < j; b++) {
                                        if (charsArray[a] != '(' && charsArray[b] != '(' && charsArray[a] != ')' && charsArray[b] != ')' && charsArray[a] != '{' && charsArray[b] != '{' && charsArray[a] != '}' && charsArray[b] != '}' && charsArray[a] != '[' && charsArray[b] != '[' && charsArray[a] != ']' && charsArray[b] != ']') {
                                            validString = true;
                                        }
                                        if ((charsArray[a] == '{' && charsArray[b] == '}') || (charsArray[a] == '[' && charsArray[b] == ']') || (charsArray[a] == '(' && charsArray[b] == ')')) {
                                            validString = true;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (charsArray[i] == '{' && charsArray[j] == '}') {
                                if (j == i + 1) {
                                    validString = true;
                                    continue;
                                }
                                for (int a = i + 1; a < j; a++) {
                                    for (int b = a + 1; b < j; b++) {
                                        if (charsArray[a] != '(' && charsArray[b] != '(' && charsArray[a] != ')' && charsArray[b] != ')' && charsArray[a] != '{' && charsArray[b] != '{' && charsArray[a] != '}' && charsArray[b] != '}' && charsArray[a] != '[' && charsArray[b] != '[' && charsArray[a] != ']' && charsArray[b] != ']') {
                                            validString = true;
                                        }
                                        if ((charsArray[a] == '{' && charsArray[b] == '}') || (charsArray[a] == '[' && charsArray[b] == ']') || (charsArray[a] == '(' && charsArray[b] == ')')) {
                                            validString = true;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (charsArray[i] == '[' && charsArray[j] == ']') {
                                if (j == i + 1) {
                                    validString = true;
                                    continue;
                                }
                                for (int a = i + 1; a < j; a++) {
                                    for (int b = a + 1; b < j; b++) {
                                        if (charsArray[a] != '(' && charsArray[b] != '(' && charsArray[a] != ')' && charsArray[b] != ')' && charsArray[a] != '{' && charsArray[b] != '{' && charsArray[a] != '}' && charsArray[b] != '}' && charsArray[a] != '[' && charsArray[b] != '[' && charsArray[a] != ']' && charsArray[b] != ']') {
                                            validString = true;
                                        }
                                        if ((charsArray[a] == '{' && charsArray[b] == '}') || (charsArray[a] == '[' && charsArray[b] == ']') || (charsArray[a] == '(' && charsArray[b] == ')')) {
                                            validString = true;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return validString;
    }
}
