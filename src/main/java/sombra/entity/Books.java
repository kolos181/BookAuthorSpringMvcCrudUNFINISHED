package sombra.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Books {

    public Books() {
    }

    public Books(String name, Date published, String genre, int rating) {
        this.name = name;
        this.published = published;
        this.genre = genre;
        this.rating = rating;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    @Column
    private String name;

    @Column
    private Date published;

    @Column
    private String genre;

    @Column
    private int rating;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
