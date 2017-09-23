package com.yong.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Supplier;

public class NullUtils {
    public static boolean allNull(Object object, Object... objects) {
        if(Objects.nonNull(object)){
            return false;
        }

        return Arrays.stream(objects)
                .allMatch(Objects::isNull);
    }

    public static boolean allNullCollection(Collection<?> collection){
        return collection.stream()
                .allMatch(Objects::isNull);
    }

    public static boolean allNonNull(Object object, Object... objects) {
        if(Objects.isNull(object)){
            return false;
        }

        return Arrays.stream(objects)
                .allMatch(Objects::nonNull);
    }

    public static boolean allNonNullCollection(Collection<?> collection){
        return collection.stream()
                .allMatch(Objects::nonNull);
    }

    public static boolean someNull(Object object, Object... objects) {
        if(Objects.isNull(object)){
            return true;
        }

        return Arrays.stream(objects)
                .anyMatch(Objects::isNull);
    }

    public static boolean someNullCollection(Collection<?> collection) {
        return collection.stream()
                .anyMatch(Objects::isNull);
    }

    public static <T> T ifNullDefault(T target, T aDefault) {
        return Objects.isNull(target) ? aDefault : target;
    }

    public static <T> T ifNullDefault(T target, Supplier<T> supplier) {
        return Objects.isNull(target) ? supplier.get() : target;
    }
}
