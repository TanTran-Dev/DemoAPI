package com.trantan.demoapi.model.request;

import com.google.gson.annotations.SerializedName;

public class SchoolTypeDto {
    @SerializedName("id")
    private int mId;

    @SerializedName("name")
    private String mName;

    @SerializedName("priority")
    private int mPriority;

    public SchoolTypeDto(int mId, String mName, int mPriority) {
        this.mId = mId;
        this.mName = mName;
        this.mPriority = mPriority;
    }

    public SchoolTypeDto() {
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmPriority() {
        return mPriority;
    }

    public void setmPriority(int mPriority) {
        this.mPriority = mPriority;
    }
}
