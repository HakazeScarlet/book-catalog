package com.github.hakazescarlet.bookcatalog.book;

import com.github.hakazescarlet.bookcatalog.author.Author;

public class BookDto extends BookSimpleDto {

    private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
