package it.hillel.homework.printer.impl;

import it.hillel.homework.printer.Printable;

import java.util.List;

public class Magazine implements Printable {

    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Printing magazine with name " + name);
    }

    public static void printMagazines(List<Printable> printableList) {
        for (Printable printable : printableList) {
            if (printable instanceof Magazine) {
                printable.print();
            }
        }
    }
}
