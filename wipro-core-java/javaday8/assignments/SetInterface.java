package javaday8.assignments;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        String text ="This is a string";
        String[] words = text.split("\\s+");
        Set<String> uniqueWords = new HashSet<>();
        for(String word : words){
            uniqueWords.add(word.toLowerCase());
        }
        System.out.println("number of unique words:" + uniqueWords.size());
    }
    
}
