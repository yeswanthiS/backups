package javaday8.assignments;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        String inputString="This si a string";
        Map<String, Integer> wordFrequency = countWordFrequency(inputString);
        for(Map.Entry<String, Integer> entry : wordFrequency.entrySet()){
            System.out.println(entry.getKey() + ":"+entry.getValue());
        }
    }
    public static Map<String, Integer> countWordFrequency(String inputString)
    {
        Map<String, Integer> wordFrequency= new HashMap<>();
        String[] words = inputString.split("\\s+");
        for(String word :words){
            word=word.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
            if(!word.isEmpty()){
                wordFrequency.put(word, wordFrequency.getOrDefault(word,0)+1);
            }
        }
        return wordFrequency;
    }
}
