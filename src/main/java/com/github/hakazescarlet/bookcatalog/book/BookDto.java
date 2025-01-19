package com.github.hakazescarlet.bookcatalog.book;

import com.github.hakazescarlet.bookcatalog.author.Author;

import java.util.List;

public class BookDto extends BookSimpleDto {

    private List<Author> authors;

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}