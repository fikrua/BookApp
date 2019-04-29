package com.company;

public class Book {
    private String author;
    private String title;
    private String description;

    public Book() {
        System.out.println("this a construcat with out a parameter");
    }

    public Book(String author, String title, String description) {
        this.author = author;
        this.title = title;
        this.description = description;
    }

    public String getAuthore() {
        return author;
    }

    public void setAuthore(String authore) {
        this.author = authore;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void getDesplayBook(){
        System.out.println("the title of your book is: " + this.title+"\n"+"the Auther is:  "+this.author+"\n"+this.description);
    }
}
