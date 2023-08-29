package org.example;

import java.util.Arrays;

public class Library {
    private Book[] array;

    public Book[] getArray() {
        return array;
    }

    public void setArrays(Book[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Library{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
