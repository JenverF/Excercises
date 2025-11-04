package com.pluralsight.workbook6.GenericExercises;

public class Labelled<T> {
    private String label;
    private T value;

    public Labelled(String label, T value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return label + " = " + value;
    }
}
