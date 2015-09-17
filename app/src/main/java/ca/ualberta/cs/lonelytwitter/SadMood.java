package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hong8 on 9/16/15.
 */
public class SadMood extends Mood {
    public SadMood(Date date) {
        super(date);
    }

    @Override
    public Date getDate(){
        return super.getDate();
    }

    @Override
    public void setDate(Date date){
        super.setDate(date);
    }

    @Override
    public Boolean IsHappyMood(){
        System.out.println("Sad Mood");
        return Boolean.FALSE;
    }
}