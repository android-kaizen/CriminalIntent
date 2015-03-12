package com.android_kaizen.criminalintent.model;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Andy on 11-Mar-15.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    private Date mDate;
    private boolean mSolved;



    public Crime() {
        // Generate uinique ID
        mId = UUID.randomUUID();
        mDate = new Date();
    }





    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }
}
