package com.github.hakazescarlet.bookcatalog.author;

import com.github.hakazescarlet.bookcatalog.book.BookSimpleDto;

public class AuthorReferences {

    private Long authorId;
    private BookSimpleDto bookSimpleDto;

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public BookSimpleDto getBookSimpleDto() {
        return bookSimpleDto;
    }

    public void setBookSimpleDto(BookSimpleDto bookSimpleDto) {
        this.bookSimpleDto = bookSimpleDto;
    }
}
