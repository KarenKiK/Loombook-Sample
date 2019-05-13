package ru.itpark;

import ru.itpark.domain.Book;

public class Main {
  public static void main(String[] args) {
    Book book = new Book("War and Piece", "Tolstoy");
    System.out.println(book.getTitle());
  }
}
