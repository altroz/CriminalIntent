package com.example.ramrooter.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Ram Rooter on 10/15/2016.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId(){
        return mId;
    }

    public void setTitle(String title){
        mTitle = title;
    }

    public String getTitle(){
        return mTitle;
    }

    public Date getDate(){
        return mDate;
    }

    public boolean isSolved(){
        return mSolved;
    }

    public void setSolved(boolean solved){
        mSolved = solved;
    }

}
