package com.egs.task;

import static com.egs.task.Constants.*;

public class NumberUtil {

    /**
     * The method to find all numbers which divisible to 3 and 5 number. If number divisible to 3
     * print Fizz, If number divisible to 5 print Buzz
     *
     * @param start the start number
     * @param end   the end number
     */
    public void isNumbersDivisible(int start, int end) {
        for (int i = start; i <= end; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(FIZZ + BUZZ);
            } else if (i % 3 == 0) {
                System.out.println(FIZZ);
            } else if (i % 5 == 0) {
                System.out.println(BUZZ);
            } else {
                System.out.println(i);
            }
        }
    }
}
