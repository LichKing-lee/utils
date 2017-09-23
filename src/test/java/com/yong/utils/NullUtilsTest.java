package com.yong.utils;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
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

    @Test
    public void allNullCollection_true(){
        // when
        boolean result = NullUtils.allNullCollection(Arrays.asList(null, null, null));

        // then
        assertTrue(result);
    }

    @Test
    public void allNullCollection_false(){
        // when
        boolean result = NullUtils.allNullCollection(Arrays.asList(null, null, new Object()));

        // then
        assertFalse(result);
    }

    @Test
    public void allNonNull_true_인자1개(){
        // given
        Object object = new Object();

        // when
        boolean result = NullUtils.allNonNull(object);

        // then
        assertTrue(result);
    }

    @Test
    public void allNonNull_false_인자1개(){
        // given
        Object object = null;

        // when
        boolean result = NullUtils.allNonNull(object);

        // then
        assertFalse(result);
    }

    @Test
    public void allNonNull_true_인자5개(){
        // given
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();

        // when
        boolean result = NullUtils.allNonNull(object1, object2, object3, object4, object5);

        // then
        assertTrue(result);
    }

    @Test
    public void allNonNull_false_인자5개(){
        // given
        Object object1 = new Object();
        Object object2 = null;
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();

        // when
        boolean result = NullUtils.allNonNull(object1, object2, object3, object4, object5);

        // then
        assertFalse(result);
    }

    @Test
    public void allNonNullCollection_true(){
        // when
        boolean result = NullUtils.allNonNullCollection(Arrays.asList(new Object(), new Object(), new Object()));

        // then
        assertTrue(result);
    }

    @Test
    public void allNonNullCollection_false(){
        // when
        boolean result = NullUtils.allNonNullCollection(Arrays.asList(null, null, new Object()));

        // then
        assertFalse(result);
    }

    @Test
    public void someNull_true_인자1개(){
        // given
        Object object = null;

        // when
        boolean result = NullUtils.someNull(object);

        // then
        assertTrue(result);
    }

    @Test
    public void someNull_false_인자1개(){
        // given
        Object object = new Object();

        // when
        boolean result = NullUtils.someNull(object);

        // then
        assertFalse(result);
    }

    @Test
    public void someNull_true_인자5개(){
        // given
        Object object1 = null;
        Object object2 = null;
        Object object3 = null;
        Object object4 = null;
        Object object5 = new Object();

        // when
        boolean result = NullUtils.someNull(object1, object2, object3, object4, object5);

        // then
        assertTrue(result);
    }

    @Test
    public void someNull_false_인자5개(){
        // given
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();

        // when
        boolean result = NullUtils.someNull(object1, object2, object3, object4, object5);

        // then
        assertFalse(result);
    }

    @Test
    public void someNullCollection_true_인자1개(){
        // when
        boolean result = NullUtils.someNullCollection(Arrays.asList(null, new Object()));

        // then
        assertTrue(result);
    }

    @Test
    public void someNullCollection_false_인자1개(){
        // when
        boolean result = NullUtils.someNullCollection(Arrays.asList(new Object(), new Object()));

        // then
        assertFalse(result);
    }

    @Test
    public void ifNullDefault_null(){
        // given
        Integer num = null;
        Integer defaultNum = 5;

        // when
        Integer result = NullUtils.ifNullDefault(num, defaultNum);

        // then
        assertThat(result, is(5));
    }

    @Test
    public void ifNullDefault_nonNull(){
        // given
        Integer num = 10;
        Integer defaultNum = 5;

        // when
        Integer result = NullUtils.ifNullDefault(num, defaultNum);

        // then
        assertThat(result, is(10));
    }

    @Test
    public void ifNullDefaultSupplier_null(){
        // given
        Integer num = null;
        Integer defaultNum = 5;

        // when
        Integer result = NullUtils.ifNullDefault(num, () -> defaultNum);

        // then
        assertThat(result, is(5));
    }

    @Test
    public void ifNullDefaultSupplier_nonNull(){
        // given
        Integer num = 200;
        Integer defaultNum = 5;

        // when
        Integer result = NullUtils.ifNullDefault(num, () -> defaultNum);

        // then
        assertThat(result, is(200));
    }
}