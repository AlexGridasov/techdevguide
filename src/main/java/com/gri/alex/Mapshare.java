package com.gri.alex;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Alex
 * Date: 01-Jan-19
 */
public class Mapshare {

    /**
     * Modify and return the given map as follows:
     * if the key "a" has a value, set the key "b" to have that same value.
     * In all cases remove the key "c", leaving the rest of the map unchanged.
     */
    public Map<String, String> mapShare(Map<String, String> map) {
        Map<String, String> newMap = new HashMap<>(map);

        if (newMap.containsKey("a")) {
            newMap.put("b", newMap.get("a"));
        }
        newMap.remove("c");

        return newMap;
    }

}
