package com.company;

public class BooApp {
    public static void main(String[] args){
        Book book = new Book(" Haddis Alemayehu","fikr eske mekaber ","Ethiopian most popular book");
        book.getDesplayBook();
        Book book1 = new Book();
        book1.setTitle("MERKE");
        book1.setAuthore("Adam Ereta");
        book1.setDescription("it best selling book in Ethiopia");
        book1.getDesplayBook();
    }
}
