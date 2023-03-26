package org.example;

import org.example.book.Book;

import java.util.ArrayList;

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

        Animal parrot = new Parrot("Pityu",new Age(1,2,5),50);
        Animal dog = new Dog("Morzsa",new Age(3,5,12),"26473856");
        Animal fish = new Fish("Ling lang",new Age(0,2,5),27000);

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(parrot);
        animalList.add(dog);
        animalList.add(fish);

        System.out.println(animalList.get(0) + "\n" + animalList.get(1) + "\n" + animalList.get(2));
        System.out.println(animalList);


    }
}