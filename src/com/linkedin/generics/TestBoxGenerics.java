package com.linkedin.generics;

public class TestBoxGenerics {
    public static void main(String[] args) {
        Box<Book> bookBox = new Box<>();
        bookBox.addItem(new Book("Harry Potter", "JK Rowling", 1.5));
        bookBox.addItem(new Book("Harry Potter 2", "JK Rowling", 1.6));
        System.out.println(bookBox.getLatestItem());
        System.out.println(bookBox);

        Box<Fruit> fruitBox = new Box<>();
        fruitBox.addItem(new Fruit("Mango", "Philippines", "Yellow", 1));
        System.out.println(fruitBox.getLatestItem());
        System.out.println(fruitBox);
    }
}
