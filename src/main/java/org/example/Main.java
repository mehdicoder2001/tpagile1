package org.example;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Entrée with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
     Person person=new Person("Joey","Doe", LocalDate.parse("2013-01-12"));
     System.out.println(person.getDisplayName()+":"+person.getAge()+"years");
    }
}