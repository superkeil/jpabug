package toto.repositories;

import org.springframework.data.repository.CrudRepository;
import toto.entities.Book;


public interface BookRepository extends CrudRepository<Book, Long> {
}