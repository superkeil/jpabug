package toto.repositories;

import org.springframework.data.repository.CrudRepository;
import toto.entities.Author;


public interface AuthorRepository extends CrudRepository<Author, Long> {
}