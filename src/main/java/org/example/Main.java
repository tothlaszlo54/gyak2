package org.example;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();

        book1.setAuthor("Zolkó");
        book1.setTitle("Zolkó világa");
        book1.setPageNumber(3);

        book2.setAuthor("Lackó");
        book2.setTitle("Lackó világa");
        book2.setPageNumber(54);

        System.out.println(book1);
        System.out.println(book2);

    }
}