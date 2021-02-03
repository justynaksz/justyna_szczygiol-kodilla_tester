package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book blackBook = BookManager.createBook("Mezczyzni, ktorzy nienawidza kobiet", "Stieg Larsson");
        Book whiteBook = BookManager.createBook("Milczaca kobieta", "Tess Gerritsen");
        Book greyBook = BookManager.createBook("Mezczyzni, ktorzy nienawidza kobiet", "Stieg Larsson");

        System.out.println("Number of books in Books Collection: " +  BookManager.books.size());
        System.out.println("------------------------------------------------------------------");
        System.out.println("Title: " + blackBook.getTitle() + ", Author: " + blackBook.getAuthor());
        System.out.println("Title: " + whiteBook.getTitle() + ", Author: " + whiteBook.getAuthor());
        System.out.println("Title: " + greyBook.getTitle() + ", Author: " + greyBook.getAuthor());
        System.out.println("------------------------------------------------------------------");
        System.out.println(blackBook == whiteBook);
        System.out.println(blackBook.equals(whiteBook));



    }
}

