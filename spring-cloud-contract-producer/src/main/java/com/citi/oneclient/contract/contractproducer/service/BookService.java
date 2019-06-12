package spring.cloud.springcloudcontractproducer.service;

import java.util.List;
import java.util.Optional;

import spring.cloud.springcloudcontractproducer.domain.Book;

public interface BookService {

    Book createNew(Book bookDTO);

    Book update(String isbn, Book book);

    Optional<Book> findByIsbn(String isbn);

    List<Book> findByAuthor(String author);

    List<Book> findByTitleLike(String title);

    List<Book> findAll();

    void delete(Book book);
}