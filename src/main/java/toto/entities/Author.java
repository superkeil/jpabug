package toto.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "author")
@Table(name = "ksu_author")
public class Author {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "authorId", cascade = CascadeType.PERSIST)
    private List<Book> books;

    public Author() {

    }

    public Author(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
