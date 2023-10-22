package org.example.problem3.observerPatternDemo.News;

import java.util.Random;

public class MessageGenerator {
    private static String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static String generateMessage(int size){
        Random rand = new Random();
        StringBuffer messageBuffer = new StringBuffer();
        char [] lettersArray = letters.toCharArray();
        for (int i = 0; i < size; i++){
            messageBuffer.append(lettersArray[rand.nextInt(lettersArray.length)]);
        }
        return messageBuffer.toString();
    }
}
