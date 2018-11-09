package sombra.entity;

import javax.persistence.*;

@Entity
@Table
public class AuthorBook {

    public AuthorBook() {
    }

    public AuthorBook(Books bookId, Authors authorId) {
        this.bookId = bookId;
        this.authorId = authorId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "bookId")
    private Books bookId;

    @ManyToOne
    @JoinColumn(name = "authorId")
    private Authors authorId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Books getBookId() {
        return bookId;
    }

    public void setBookId(Books bookId) {
        this.bookId = bookId;
    }

    public Authors getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Authors authorId) {
        this.authorId = authorId;
    }
}

//@ManyToOne
//@OnDelete(action = OnDeleteAction.CASCADE)
//    @JoinColumn(name = "patient_id", nullable = false)
////    private Patient patient;