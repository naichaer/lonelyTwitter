package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.List;

/**
 * Created by hong8 on 9/16/15.
 */
public abstract class Mood {
    private Date date;

    public Mood(Date date) {
        this.setDate(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public abstract Boolean IsHappyMood();
}
