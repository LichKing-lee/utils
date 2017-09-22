package com.yong.utils;

import java.util.Arrays;
import java.util.Objects;

public class NullUtils {
    public static boolean allNull(Object object, Object... objects) {
        if(Objects.nonNull(object)){
            return false;
        }

        return Arrays.stream(objects)
                .allMatch(Objects::isNull);
    }
}
