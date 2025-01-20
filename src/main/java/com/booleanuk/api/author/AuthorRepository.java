package com.booleanuk.api.author;

import java.util.ArrayList;

public class AuthorRepository {
    private ArrayList<Author> authors;

    public AuthorRepository() {
        this.authors = new ArrayList<>();

        this.authors.add(new Author("JRR Tolkien", "jrr@tolkien.com"));
        this.authors.add(new Author("Charles Dickens", "charles@bleakhouse.com"));
    }

    public ArrayList<Author> getAll() {
        return this.authors;
    }

    public Author getOne(int id) {
        for (Author author : this.authors) {
            if (author.getId() == id) {
                return author;
            }
        }
        return null;
    }

    public Author create(Author author) {
        this.authors.add(author);
        return author;
    }

    public Author update(int id, Author author) {
        for (int i = 0; i < authors.size(); i++) {
            if(authors.get(i).getId() == id) {
                authors.get(i).setName(author.getName());
                authors.get(i).setEmail(author.getEmail());
                return authors.get(i);
            }
        }
        return null;
    }

    public Author delete(int id) {
        Author deletdAuthor;
        for (int i = 0; i < authors.size(); i++) {
            if(authors.get(i).getId() == id) {
                deletdAuthor = authors.get(i);
                authors.remove(i);
                return deletdAuthor;
            }
        }
        return null;
    }
}
