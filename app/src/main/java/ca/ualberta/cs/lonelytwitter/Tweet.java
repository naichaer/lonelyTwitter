
package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by hong8 on 9/16/15.
 */
public abstract class Tweet {
    private String text;                      //attributes
    protected Date date;
    private ArrayList<Mood> Moods;

    public Tweet(String tweet,Date date) {     //constructor
        this.setText(tweet);
        this.date=date;
    }
    public Tweet(String tweet) n{
        this.setText(tweet);
        this.date=new Date();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        if (text.length() <= 140) {
            this.text = text;
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract Boolean isImportant();
}

