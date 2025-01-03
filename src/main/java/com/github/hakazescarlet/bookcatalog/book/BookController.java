package com.github.hakazescarlet.bookcatalog.book;

import com.github.hakazescarlet.bookcatalog.author.AuthorReferences;
import org.apache.tomcat.util.http.fileupload.FileUploadBase;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<BookSimpleDto> getAllBooks() {
        return new ArrayList<>();
    }

    @GetMapping("/books/{bookId}")
    public BookDto getBookById(@PathVariable Long bookId) {
        return new BookDto();
    }

    @GetMapping("/books/author/{authorId}")
    public List<AuthorReferences> getBookByAuthorId(@PathVariable Long authorId) {
        return new ArrayList<>();
    }

    @PostMapping("/books")
    public Long createBook(@RequestBody BookCreateUpdateCommand bookCreateUpdateCommand) {
        return 111L;
    }

    @PostMapping(value = "/books/{bookId}", consumes = FileUploadBase.MULTIPART_FORM_DATA)
    public void createBookImage(@RequestParam("image") MultipartFile file, @PathVariable Long bookId) {
        System.out.println();
    }
}
