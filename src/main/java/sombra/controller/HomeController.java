package sombra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sombra.entity.Books;
import sombra.service.AuthorBookService;
import sombra.service.BooksService;

import java.util.Date;

@Controller
public class HomeController {

    @Autowired
    private BooksService booksService;

    @Autowired
    private AuthorBookService authorBookService;


    @RequestMapping(value = "/addBook")
    public void addBook() {
        booksService.addBook(new Books("Monk who sold his ferrari", new Date(), "Self help", 4));
    }

}
