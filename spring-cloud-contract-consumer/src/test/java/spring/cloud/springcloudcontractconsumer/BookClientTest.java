package spring.cloud.springcloudcontractconsumer;

import spring.cloud.springcloudcontractconsumer.client.BookClient;
import spring.cloud.springcloudcontractconsumer.domain.Book;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(
        ids = "spring.cloud:spring-cloud-contract-producer:+:stubs:9080",
        stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class BookClientTest {

    @Autowired
    private BookClient bookClient;

    @Test
    public void getBookByisbnCompliesToContract() {
        Book book = bookClient.getBook("123");
        Assertions.assertThat(book.getIsbn()).isEqualToIgnoringCase("123");
    }

    @Test
    public void createBookCompliesToContract() {
        Book book= new Book("123", "Ferok Book", "Fero Hero");
        Book createdBook = bookClient.createBook(book);
        Assertions.assertThat(createdBook.getIsbn()).isEqualToIgnoringCase("123");
    }
}
