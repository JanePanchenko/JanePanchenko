package it.hillel.homework.printer.demo;

import it.hillel.homework.printer.Printable;
import it.hillel.homework.printer.impl.Book;
import it.hillel.homework.printer.impl.Magazine;

import java.util.ArrayList;
import java.util.List;

public class PrinterDemo {

    public static void main(String[] args) {
        Book technicalBook = new Book("Java 8 Book");
        Book fictionBook = new Book("Black cat");
        Magazine beautyMagazine = new Magazine("Cosmopolitan");
        Magazine animalMagazine = new Magazine("Wild life");

        List<Printable> printableList = new ArrayList<>();
        printableList.add(technicalBook);
        printableList.add(fictionBook);
        printableList.add(beautyMagazine);
        printableList.add(animalMagazine);

        Book.printBooks(printableList);
        Magazine.printMagazines(printableList);
    }
}
