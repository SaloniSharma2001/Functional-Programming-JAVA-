package com.consumer;
import java.util.function.Consumer;

public class ConsImp implements Consumer<Integer> {
    @Override
    public void accept(Integer value) {
        System.out.println("Iterating on values using consumer: " + value);
    }
}