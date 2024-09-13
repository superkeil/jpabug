package toto.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "book")
@Table(name = "ksu_book")
public class Book {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "author_id")
    private Long authorId;

    @Column(name = "title")
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id", insertable = false, updatable = false)
    private Author author;

    public Book() {
    }

    public Book(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
