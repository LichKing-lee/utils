package com.yong.utils;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NullUtilsTest {
    @Test
    public void allNull_true_인자1개(){
        // given
        Object object = null;

        // when
        boolean result = NullUtils.allNull(object);

        // then
        assertTrue(result);
    }

    @Test
    public void allNull_true_인자5개(){
        // given
        Object object1 = null;
        Object object2 = null;
        Object object3 = null;
        Object object4 = null;
        Object object5 = null;

        // when
        boolean result = NullUtils.allNull(object1, object2, object3, object4, object5);

        // then
        assertTrue(result);
    }

    @Test
    public void allNull_false_인자1개(){
        // given
        Object object = new Object();

        // when
        boolean result = NullUtils.allNull(object);

        // then
        assertFalse(result);
    }

    @Test
    public void allNull_false_인자5개(){
        // given
        Object object1 = new Object();
        Object object2 = null;
        Object object3 = null;
        Object object4 = null;
        Object object5 = null;

        // when
        boolean result = NullUtils.allNull(object1, object2, object3, object4, object5);

        // then
        assertFalse(result);
    }
}