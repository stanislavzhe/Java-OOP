package com.stas.TasksForTraining;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Stas on 26.03.2017.
 */
public class ArrayCheckerTest {

    @Test
    public void testFirstIncludesSecond() throws Exception {
        // given
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 4};

        // when

        boolean result = ArrayChecker.arrayIncludesSecondArray(a, b);


        //then
//        assertEquals("First array doesn't include second", true, result);
        assertTrue("First array doesn't include second", result);
    }
    @Test
    public void testFirstNotIncludesSecond() throws Exception {
        // given
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {7, 2, 4};

        // when
        boolean result = ArrayChecker.arrayIncludesSecondArray(a, b);

        //then
 //       assertEquals("First array doesn't include second", true, result);
        assertFalse("First array include second", result);
    }

}