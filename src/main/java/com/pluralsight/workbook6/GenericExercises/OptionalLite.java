package com.pluralsight.workbook6.GenericExercises;

public class OptionalLite<T> {
    private T value;

    public OptionalLite(T value) {
        this.value = value;
    }

    public static <T> OptionalLite<T> of (T v) {
        return new OptionalLite<>(v);
    }

    public static <T> OptionalLite<T> empty() {
        return new OptionalLite<>(null);
    }

    public boolean isPresent() {
        return value != null;
    }

    public T getValue() {
        return value;
    }
}
