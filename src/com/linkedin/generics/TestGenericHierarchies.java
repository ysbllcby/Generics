package com.linkedin.generics;

public class TestGenericHierarchies {
    public static void main(String[] args) {

        CardboardBox<Fruit> fruitCardboardBox = new CardboardBox<>();

        Box<Fruit> fruitBox = new Box<>();

        fruitBox = fruitCardboardBox;

        System.out.println(fruitBox.getTotalWeight());

        // Type argument hierarchies
        Box<Apple> appleBox = new Box<>();
        // fruitBox = appleBox;
    }
}
