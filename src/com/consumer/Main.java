package com.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(4, 5, 6, 7, 8);
        Consumer<Integer> c = new ConsImp();
        values.forEach(c);
    }
}