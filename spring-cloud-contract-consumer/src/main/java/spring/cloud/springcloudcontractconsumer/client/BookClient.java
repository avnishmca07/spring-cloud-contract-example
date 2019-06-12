package spring.cloud.springcloudcontractconsumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import spring.cloud.springcloudcontractconsumer.domain.Book;

@FeignClient("bookservice")
public interface BookClient {

    @RequestMapping(method = RequestMethod.GET, path = "/api/books/{isbn}", consumes = MediaType.APPLICATION_JSON_VALUE)
    Book getBook(@PathVariable("isbn") String isbn);

    @RequestMapping(method = RequestMethod.POST, path = "/api/books", consumes = MediaType.APPLICATION_JSON_VALUE)
    Book createBook(@RequestBody Book book);


}
