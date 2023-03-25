package org.example;

public class Book {
    private String title;
    private String author;

    private int pageNumber;


    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPageNumber(){
        return this.pageNumber;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public void setPageNumber(int pageNumber){
        this.pageNumber=pageNumber;
    }

    @Override
    public String toString() {
        return "A cím: " + this.title + " A szerző: " + this.author + " Az oldal száma: " + this.pageNumber;
    }
}
