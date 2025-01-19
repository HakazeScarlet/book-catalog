package com.github.hakazescarlet.bookcatalog.book;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final BookCoverRepository bookCoverRepository;

    public BookService(BookRepository bookRepository, BookCoverRepository bookCoverRepository) {
        this.bookRepository = bookRepository;
        this.bookCoverRepository = bookCoverRepository;
    }

    public List<BookSimpleDto> getAll() {
        List<Book> books = bookRepository.findAll();
        return books.stream()
            .map(book -> {
                BookSimpleDto bookSimpleDto = new BookSimpleDto();
                bookSimpleDto.setId(book.getId());
                bookSimpleDto.setIsbn(book.getIsbn());
                bookSimpleDto.setTitle(book.getTitle());
                bookSimpleDto.setPublicationDate(book.getPublicationDate());
                return bookSimpleDto;
            })
            .toList();
    }

    public BookDto getById(Long bookId) {
        Book book = bookRepository.getReferenceById(bookId);
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setAuthors(book.getAuthors());
        bookDto.setIsbn(book.getIsbn());
        bookDto.setTitle(book.getTitle());
        bookDto.setPublicationDate(book.getPublicationDate());
        return bookDto;
    }

    public Long save(BookCreateUpdateCommand command) {
        Book book = new Book();
        book.setTitle(command.getTitle());
        book.setIsbn(command.getIsbn());
        book.setPublicationDate(command.getPublicationDate());
        return bookRepository.save(book).getId();
    }

    public void deleteBookById(Long bookId) {
        bookRepository.deleteById(bookId);
    }

    public void saveBookCover(MultipartFile file, Long bookId) {
        byte[] image = null;
        try {
            image = file.getBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Book book = new Book();
        book.setId(bookId);
        BookCover bookCover = new BookCover();
        bookCover.setImage(image);
        bookCover.setBook(book);
        // TODO: поискть как делать связь по ID, а не по объекту
        bookCoverRepository.save(bookCover);
    }
}
