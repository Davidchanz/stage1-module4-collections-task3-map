package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        sentence = sentence.replaceAll(",", "");
        sentence = sentence.replaceAll("\\.", "");
        for(var word: sentence.toLowerCase().split(" ")){
            if(!word.isBlank()) {
                if (result.containsKey(word)) {
                    result.put(word, result.get(word) + 1);
                } else {
                    result.put(word, 1);
                }
            }
        }
        return result;
    }
}
