package daniel.com.br.crud.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Dias on 27/05/2017.
 */

@Entity(tableName = "tbBooks")
public class Book {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;
    private String author;

    public Book(){ }

    //getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString(){
        return title;
    }

}
