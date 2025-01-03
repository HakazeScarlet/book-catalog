package com.github.hakazescarlet.bookcatalog.book;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<BookSimpleDto> getAllBooks() {
        List<BookSimpleDto> bookSimpleDtos = null;
        return bookSimpleDtos;
    }

    @GetMapping("/books/{bookId}")
    public BookDto getBookById(@PathVariable Long bookId) {
        return new BookDto();
    }

    @PostMapping("/books")
    public Long createBook(@RequestBody BookCreateUpdateCommand bookCreateUpdateCommand) {
        return 111111111111L;
    }
}
