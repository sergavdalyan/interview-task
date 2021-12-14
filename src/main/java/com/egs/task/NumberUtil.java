package com.egs.task;

import java.util.Map;
import java.util.Map.Entry;

public class NumberUtil {

    /**
     * The method to find all numbers which divisible to provided numbers.
     *
     * @param start the start number
     * @param end   the end number
     * @param map   the map of integer and string
     */
    public void isNumbersDivisible(int start, int end, Map<Integer, String> map) {
        for (int i = start; i <= end; i++) {
            boolean found = false;
            for (Entry<Integer, String> entry : map.entrySet()) {
                if (i % entry.getKey() == 0) {
                    System.out.println(entry.getValue());
                    found = true;
                }
            }
            if (!found) {
                System.out.println(i);
            }
        }
    }
}
