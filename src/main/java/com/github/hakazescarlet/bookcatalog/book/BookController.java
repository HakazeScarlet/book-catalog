package com.github.hakazescarlet.bookcatalog.book;

import com.github.hakazescarlet.bookcatalog.author.AuthorReferences;
import org.apache.tomcat.util.http.fileupload.FileUploadBase;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

// TODO: add response status annotations or response entity
@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookSimpleDto> getAllBooks() {
        return bookService.getAll();
    }

    @GetMapping("/{bookId}")
    public BookDto getBookById(@PathVariable Long bookId) {
        return bookService.getById(bookId);
    }

    @GetMapping("/author/{authorId}")
    public AuthorReferences getBookByAuthorId(@PathVariable Long authorId) {
        return new AuthorReferences();
    }

    @PostMapping
    public Long createBook(@RequestBody BookCreateUpdateCommand command) {
        return bookService.save(command);
    }

    @PostMapping(value = "/{bookId}", consumes = FileUploadBase.MULTIPART_FORM_DATA)
    public void saveBookCover(@RequestParam("file") MultipartFile file, @PathVariable Long bookId) {
        bookService.saveBookCover(file, bookId);
    }

    @DeleteMapping("/{bookId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBookById(@PathVariable Long bookId) {
        bookService.deleteBookById(bookId);
    }
}
