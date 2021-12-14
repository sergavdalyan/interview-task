package com.egs.task;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class NumberUtilTest {

    private final NumberUtil underTest = new NumberUtil();

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restore() {
        System.setOut(originalOut);
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void isNumbersDivisibleTest(int start, int end, Map<Integer, String> map,
        String expected) {
        underTest.isNumbersDivisible(start, end, map);

        assertEquals(expected, outContent.toString());
    }

    private static Stream<Arguments> dataProvider() {
        final LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "Fizz");
        map.put(5, "Buzz");

        return Stream.of(
            Arguments.of(1, 100, map, RESULT_FROM_1_TO_100),
            Arguments.of(1, 3, map, RESULT_FROM_1_TO_3),
            Arguments.of(4, 5, map, RESULT_FROM_4_TO_5)
        );
    }

    private static final String RESULT_FROM_1_TO_3 = "1\n"
        + "2\n"
        + "Fizz\n";

    private static final String RESULT_FROM_4_TO_5 = "4\n"
        + "Buzz\n";

    private static final String RESULT_FROM_1_TO_100 = "1\n"
        + "2\n"
        + "Fizz\n"
        + "4\n"
        + "Buzz\n"
        + "Fizz\n"
        + "7\n"
        + "8\n"
        + "Fizz\n"
        + "Buzz\n"
        + "11\n"
        + "Fizz\n"
        + "13\n"
        + "14\n"
        + "Fizz\n"
        + "Buzz\n"
        + "16\n"
        + "17\n"
        + "Fizz\n"
        + "19\n"
        + "Buzz\n"
        + "Fizz\n"
        + "22\n"
        + "23\n"
        + "Fizz\n"
        + "Buzz\n"
        + "26\n"
        + "Fizz\n"
        + "28\n"
        + "29\n"
        + "Fizz\n"
        + "Buzz\n"
        + "31\n"
        + "32\n"
        + "Fizz\n"
        + "34\n"
        + "Buzz\n"
        + "Fizz\n"
        + "37\n"
        + "38\n"
        + "Fizz\n"
        + "Buzz\n"
        + "41\n"
        + "Fizz\n"
        + "43\n"
        + "44\n"
        + "Fizz\n"
        + "Buzz\n"
        + "46\n"
        + "47\n"
        + "Fizz\n"
        + "49\n"
        + "Buzz\n"
        + "Fizz\n"
        + "52\n"
        + "53\n"
        + "Fizz\n"
        + "Buzz\n"
        + "56\n"
        + "Fizz\n"
        + "58\n"
        + "59\n"
        + "Fizz\n"
        + "Buzz\n"
        + "61\n"
        + "62\n"
        + "Fizz\n"
        + "64\n"
        + "Buzz\n"
        + "Fizz\n"
        + "67\n"
        + "68\n"
        + "Fizz\n"
        + "Buzz\n"
        + "71\n"
        + "Fizz\n"
        + "73\n"
        + "74\n"
        + "Fizz\n"
        + "Buzz\n"
        + "76\n"
        + "77\n"
        + "Fizz\n"
        + "79\n"
        + "Buzz\n"
        + "Fizz\n"
        + "82\n"
        + "83\n"
        + "Fizz\n"
        + "Buzz\n"
        + "86\n"
        + "Fizz\n"
        + "88\n"
        + "89\n"
        + "Fizz\n"
        + "Buzz\n"
        + "91\n"
        + "92\n"
        + "Fizz\n"
        + "94\n"
        + "Buzz\n"
        + "Fizz\n"
        + "97\n"
        + "98\n"
        + "Fizz\n"
        + "Buzz\n";
}
