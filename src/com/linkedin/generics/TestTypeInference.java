package com.linkedin.generics;

import java.util.Collections;

public class TestTypeInference {
    public static void main(String[] args) {
        // Type witness demo
        var list = Collections.<String>emptyList();

        // This is type inference demo
        Number number = pickOne(12, 23.45);
        System.out.println(number);

        Fruit fruit = new Fruit("Mango", "Philippines", "Yellow", 1);
        Apple apple = new Apple("Fuji", "Japan", "Red", 1);

        Boxable pickedFruit = pickOne(fruit, apple);
        System.out.println(pickedFruit);

        // Type inference with instantiation
        Box<Fruit> fruitBox = new Box<>();

        // Type inference with method arguments
        var box = Box.of(fruit);
        var box1 = Box.of(apple);

        // Type inference with target types
        Box<Fruit> fruitBox1 = BoxUtils.emptyBox();
        Box<Apple> appleBox = BoxUtils.emptyBox();
    }

    public static <T> T pickOne(T t1, T t2) {
        if (Math.random() > 0.5) {
            return t1;
        } else {
            return t2;
        }
    }
}
