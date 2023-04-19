package com.linkedin.generics;

//public class TestWildcards extends Box<?> {
public class TestWildcards {
    public static void main(String[] args) {
        // new Box<?>();

        // var box = BoxUtils.<?>emptyBox();

        Box<Book> bookBox = new Box<>();
        bookBox.addItem(new Book("Harry Potter", "JK Rowling", 1.5));
        bookBox.addItem(new Book("Harry Potter 2", "JK Rowling", 1.6));
        // Unbounded wildcards
        System.out.println(BoxUtils.getCountOfItems(bookBox));

        // Upperbounded wildcards
        Box<Fruit> fruitBox = new Box<>();
        fruitBox.addItem(new Fruit("Mango", "Philippines", "Yellow", 1));
        fruitBox.addItem(new Fruit("Strawberry", "Philippines", "Red", 1));
        System.out.println(Box.getAverageWeightOfFruit(fruitBox));

        Box<Apple> appleBox = new Box<>();
        Box.getAverageWeightOfFruit(appleBox);
        Box<Boxable> boxableBox = new Box<>();
        // Box.getAverageWeightOfFruit(boxableBox);
        // Box.getAverageWeightOfFruit(bookBox);

        // Lowerbounded wildcards
        Box.addAppleToBox(appleBox);
        Box.addAppleToBox(fruitBox);
        Box.addAppleToBox(boxableBox);
        // Box.addAppleToBox(bookBox);
    }
}
