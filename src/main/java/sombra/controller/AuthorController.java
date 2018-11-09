package sombra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sombra.entity.Authors;
import sombra.service.AuthorsService;

import java.util.Date;

@RestController
@RequestMapping("/authors")
public class AuthorController {


    @Autowired
    private AuthorsService authorsService;

    @PostMapping("/")
    public String addAuthor() {
        authorsService.save(new Authors("Sharma", "male", new Date()));
        return "home";
    }

    @GetMapping
    public Authors getAuthor() {
        return authorsService.getOne(1L);
    }

    @PutMapping
    public Authors updateAuthor() {
        return authorsService.save(new Authors("Sharma", "male", new Date()));
    }

    @DeleteMapping
    public void deleteAuthor() {
        authorsService.delete(new Authors("Sharma", "male", new Date()));
    }

}
