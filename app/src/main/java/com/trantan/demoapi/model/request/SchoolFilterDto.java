package com.trantan.demoapi.model.request;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SchoolFilterDto {
    @SerializedName("userName")
    private String mUserName;

    @SerializedName("name")
    private String mName;

    @SerializedName("shortName")
    private String mShortName;

    @SerializedName("educatedScale")
    private Integer mEducatedScale = null;

    @SerializedName("regionID")
    private Integer mRegionID = null;

    @SerializedName("schoolTypeID")
    private Integer mSchoolTypeID = null;

    @SerializedName("email")
    private String mEmail;

    @SerializedName("ids")
    private List<String> mIds;

    @SerializedName("employerID")
    private String mEmployerID;

    @SerializedName("connected")
    private boolean isConnected;

    @SerializedName("createdDate")
    private int mCreatedDate;

    public SchoolFilterDto(String mUserName, String mName, String mShortName, int mEducatedScale, int mRegionID, int mSchoolTypeID, String mEmail, List<String> mIds, String mEmployerID, boolean isConnected, int mCreatedDate) {
        this.mUserName = mUserName;
        this.mName = mName;
        this.mShortName = mShortName;
        this.mEducatedScale = mEducatedScale;
        this.mRegionID = mRegionID;
        this.mSchoolTypeID = mSchoolTypeID;
        this.mEmail = mEmail;
        this.mIds = mIds;
        this.mEmployerID = mEmployerID;
        this.isConnected = isConnected;
        this.mCreatedDate = mCreatedDate;
    }

    public SchoolFilterDto() {

    }

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
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

    public int getmEducatedScale() {
        return mEducatedScale;
    }

    public void setmEducatedScale(int mEducatedScale) {
        this.mEducatedScale = mEducatedScale;
    }

    public int getmRegionID() {
        return mRegionID;
    }

    public void setmRegionID(int mRegionID) {
        this.mRegionID = mRegionID;
    }

    public int getmSchoolTypeID() {
        return mSchoolTypeID;
    }

    public void setmSchoolTypeID(int mSchoolTypeID) {
        this.mSchoolTypeID = mSchoolTypeID;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public List<String> getmIds() {
        return mIds;
    }

    public void setmIds(List<String> mIds) {
        this.mIds = mIds;
    }

    public String getmEmployerID() {
        return mEmployerID;
    }

    public void setmEmployerID(String mEmployerID) {
        this.mEmployerID = mEmployerID;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    public int getmCreatedDate() {
        return mCreatedDate;
    }

    public void setmCreatedDate(int mCreatedDate) {
        this.mCreatedDate = mCreatedDate;
    }
}
