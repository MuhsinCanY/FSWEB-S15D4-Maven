package org.example;


public class Main {
    public static void main(String[] args) {
//        checkForPalindrome
        checkForPalindrome("I did, did I?");
        checkForPalindrome("Racecar");
        checkForPalindrome("hello");
        checkForPalindrome("Was it a car or a cat I saw ?");
        checkForPalindrome("Kavak");

        System.out.println(convertDecimalToBinary(5) + " 101");
        System.out.println(convertDecimalToBinary(6) + " 110");
        System.out.println(convertDecimalToBinary(13) + " 1101");
        System.out.println(convertDecimalToBinary(20) + " 10100");
        System.out.println(convertDecimalToBinary(17) + " 10001");
    }

    public static boolean checkForPalindrome(String word){
        word = word.replaceAll("[^a-zA-Z\\s]", "").toLowerCase().trim().replaceAll(" ", "");
        String reverse = new StringBuilder(word).reverse().toString();
//        System.out.println(word);
//        System.out.println(reverse);
//        System.out.println(reverse.equals(word));
//        System.out.println();
        return reverse.equals(word);
    }

    public static String convertDecimalToBinary(int number){
        StringBuilder binary = new StringBuilder();

        while(number>0){
            if(number%2==0){
                binary.append("0");
            }else {
                binary.append("1");
            }
            number = number /2;
//            System.out.println(number);
        }

        return binary.reverse().toString();
    }

}