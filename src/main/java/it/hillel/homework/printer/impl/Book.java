package it.hillel.homework.printer.impl;

import it.hillel.homework.printer.Printable;

import java.util.List;

public class Book implements Printable {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Printing book with name " + name);
    }

    public static void printBooks(List<Printable> printableList) {
        for (Printable printable : printableList) {
            if (printable instanceof Book) {
                printable.print();
            }
        }
    }
}
