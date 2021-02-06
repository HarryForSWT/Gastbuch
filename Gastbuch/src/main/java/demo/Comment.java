package demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comment {
    private  @Id @GeneratedValue Long id;
    private final String author, title,text;

    public Comment(){
        this.author=null;
        this.title=null;
        this.text=null;
    }

    public Comment(String author, String title, String text){
        this.author=author;
        this.title=title;
        this.text=text;
    }
    public Long getId(){
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
