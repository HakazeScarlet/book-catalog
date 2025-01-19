package com.github.hakazescarlet.bookcatalog.book;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
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
}
