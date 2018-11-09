package sombra.service;

import org.springframework.stereotype.Repository;
import sombra.entity.AuthorBook;

@Repository
public interface AuthorBookService {
    AuthorBook addAuthorBook(AuthorBook authorBook);
    AuthorBook getAuthorBookById(int id);
}
