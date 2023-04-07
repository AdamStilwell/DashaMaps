package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMap1Test {
    DashaMap map;

    @Before
    public void before(){
        map = new DashaMap();
    }

    @Test
    public void setTest(){
        String key = "key";
        Integer value = 1;
        long expected = 1;

        map.set(key, value);
        long actual = map.bucketSize("k");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deleteTest() {
        String key = "key";
        Integer value = 1;
        long expected = 0;

        map.delete(key);
        long actual = map.bucketSize("k");

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getTest() {
        String key = "key";
        Integer expected = 3;

        map.set(key, expected);

        Integer actual = map.get(key);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest() {
        String e = "Frisk";
        Integer value = 4;

        map.set(e, value);

        Assert.assertFalse(map.isEmpty());
    }

    @Test
    public void isEmptyTest2() {
        Assert.assertTrue(map.isEmpty());
    }

    @Test
    public void sizeTest() {
        String key = "key";
        Integer value = 4;

        Long expected = 1L;

        map.set(key, value);
        Long actual = map.size();

        Assert.assertEquals(expected, actual);
    }
}
