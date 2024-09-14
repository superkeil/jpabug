package toto.controllers;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import toto.entities.Author;
import toto.entities.Book;
import toto.repositories.AuthorRepository;
import toto.repositories.BookRepository;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private EntityManager entityManager;

    @RequestMapping("/")
    public String initDb() {
        Author author = new Author();
        author.setName("some_author");
        authorRepository.save(author);

        Book book = new Book();
        book.setTitle("some_title");
        book.setAuthorId(author.getId());
        bookRepository.save(book);

        entityManager.clear();

        Book fetchedBook = bookRepository.findAll().iterator().next();
        return "Author name " + fetchedBook.getAuthor().getName();
    }
}
