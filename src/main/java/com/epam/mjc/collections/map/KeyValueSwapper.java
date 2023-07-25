package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();
        sourceMap.forEach((key, value) -> {
            if(result.containsKey(value)){
                if(key < result.get(value)) {
                    result.put(value, key);
                }
            }else {
                result.put(value, key);
            }
        });
        return result;
    }
}
