package com.github.hakazescarlet.bookcatalog.author;

import com.github.hakazescarlet.bookcatalog.book.BookSimpleDto;

import java.util.List;

public class AuthorReferences {

    private Long authorId;
    private BookSimpleDto bookSimpleDto;
    private List<BookSimpleDto> bookSimpleDtos;

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

    public List<BookSimpleDto> getBookSimpleDtos() {
        return bookSimpleDtos;
    }

    public void setBookSimpleDtos(List<BookSimpleDto> bookSimpleDtos) {
        this.bookSimpleDtos = bookSimpleDtos;
    }
}
