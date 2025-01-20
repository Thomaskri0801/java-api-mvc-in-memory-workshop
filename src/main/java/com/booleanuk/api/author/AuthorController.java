package com.booleanuk.api.author;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("authors")
public class AuthorController {
    private AuthorRepository theAuthors;

    public AuthorController() {
        this.theAuthors = new AuthorRepository();
    }

    @GetMapping
    public ArrayList<Author> getAll() {
        return this.theAuthors.getAll();
    }

    @GetMapping("/{id}")
    public Author getOne(@PathVariable(name = "id") int id) {
        return this.theAuthors.getOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Author create(@RequestBody Author author) {
        return theAuthors.create(author);
    }

    @PutMapping("/{id}")
    public Author update(@PathVariable int id, @RequestBody Author author) {
        return theAuthors.update(id, author);
    }

    @DeleteMapping("/{id}")
    public Author delete(@PathVariable int id) {
        return theAuthors.delete(id);
    }

}
