package sombra.service;


import sombra.entity.Books;

public interface BooksService {
    void addBook(Books book);
    Books getBookById(int id);
}
