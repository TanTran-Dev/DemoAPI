package com.trantan.demoapi.model.response;

import com.google.gson.annotations.SerializedName;

public class School {
    @SerializedName("id")
    private String mId;

    @SerializedName("name")
    private String mName;

    @SerializedName("shortName")
    private String mShortName;

    @SerializedName("logoUrl")
    private String mLogoUrl;

    public School(String mId, String mName, String mShortName, String mLogoUrl) {
        this.mId = mId;
        this.mName = mName;
        this.mShortName = mShortName;
        this.mLogoUrl = mLogoUrl;
    }

    public School() {
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmShortName() {
        return mShortName;
    }

    public void setmShortName(String mShortName) {
        this.mShortName = mShortName;
    }

    public String getmLogoUrl() {
        return mLogoUrl;
    }

    public void setmLogoUrl(String mLogoUrl) {
        this.mLogoUrl = mLogoUrl;
    }

    @Override
    public String toString() {
        return "School{" +
                "mId='" + mId + '\'' +
                ", mName='" + mName + '\'' +
                ", mShortName='" + mShortName + '\'' +
                ", mLogoUrl='" + mLogoUrl + '\'' +
                '}';
    }
}
