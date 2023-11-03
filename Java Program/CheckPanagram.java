package com.array;
public class CheckPanagram {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; 

        boolean isPangram = isPangram(input.toLowerCase());
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        boolean[] isLetterPresent = new boolean[26]; 


        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                System.out.println(c);
                System.out.println(index);
                isLetterPresent[index] = true;
                
            }
        }

        for (boolean present : isLetterPresent) {
            if (!present) {
                return false;
            }
        }

        return true; 
    }
}
