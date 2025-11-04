package com.pluralsight.workbook6.GenericExercises;

public class Holder<T> {
    private T value;

    public Holder(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T v) {
        this.value = v;
    }
}
