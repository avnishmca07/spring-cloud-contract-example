package spring.cloud.springcloudcontractproducer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.cloud.springcloudcontractproducer.domain.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,String>{
    List<Book> findByAuthor(String author);
    List<Book> findByTitleLike(String title);
}
