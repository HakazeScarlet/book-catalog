package com.github.hakazescarlet.bookcatalog.book;

import com.github.hakazescarlet.bookcatalog.author.AuthorReferences;
import org.apache.tomcat.util.http.fileupload.FileUploadBase;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/")
    public List<BookSimpleDto> getAllBooks() {
        return new ArrayList<>();
    }

    @GetMapping("/{bookId}")
    public BookDto getBookById(@PathVariable Long bookId) {
        return new BookDto();
    }

    @GetMapping("/author/{authorId}")
    public AuthorReferences getBookByAuthorId(@PathVariable Long authorId) {
        return new AuthorReferences();
    }

    @PostMapping("/")
    public Long createBook(@RequestBody BookCreateUpdateCommand bookCreateUpdateCommand) {
        return 111L;
    }

    @PostMapping(value = "/{bookId}", consumes = FileUploadBase.MULTIPART_FORM_DATA)
    public void saveBookCover(@RequestParam("image") MultipartFile file, @PathVariable Long bookId) {

    }

    @DeleteMapping("/{bookId}")
    public void deleteBookById(@PathVariable Long bookId) {

    }
}
