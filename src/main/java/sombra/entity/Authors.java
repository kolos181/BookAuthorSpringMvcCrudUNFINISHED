package sombra.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Authors {

    public Authors() {
    }

    public Authors(String name, String gender, Date born) {
        this.name = name;
        this.gender = gender;
        this.born = born;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;

    @Column
    private String name;

    @Column
    private String gender;

    @Column
    private Date born;

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }
}
