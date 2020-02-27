package com.trantan.demoapi.model.response;

import com.google.gson.annotations.SerializedName;
import com.trantan.demoapi.model.request.RegionDto;
import com.trantan.demoapi.model.request.SchoolTypeDto;

public class SchoolDetail {
    @SerializedName("id")
    private String mId;

    @SerializedName("name")
    private String mName;

    @SerializedName("shortName")
    private String mShortName;

    @SerializedName("educatedScale")
    private int mEducatedScale;

    @SerializedName("website")
    private String mWebsite;

    @SerializedName("email")
    private String mEmail;

    @SerializedName("phone")
    private String mPhone;

    @SerializedName("historyDesc")
    private String mHistoryDesc;

    @SerializedName("achievementDesc")
    private String mAchievementDesc;

    @SerializedName("studyEnvDesc")
    private String mStudyEnvDesc;

    @SerializedName("devStrateryDesc")
    private String mDevStrategyDesc;

    @SerializedName("lecturersDesc")
    private String mLecturersDesc;

    @SerializedName("logoUrl")
    private String mLogoUrl;

    @SerializedName("coverUrl")
    private String mCoverUrl;

    @SerializedName("region")
    private RegionDto mRegionDto;

    @SerializedName("address")
    private String mAddress;

    @SerializedName("lat")
    private double mLat;

    @SerializedName("lon")
    private double mLon;

    @SerializedName("schoolType")
    private SchoolTypeDto mSchoolTypeDto;

    @SerializedName("createdDate")
    private long mCreatedDate;

    @SerializedName("connectState")
    private String mConnectState;

    public SchoolDetail(String mId, String mName, String mShortName,
                        int mEducatedScale, String mWebsite, String mEmail,
                        String mPhone, String mHistoryDesc, String mAchievementDesc,
                        String mStudyEnvDesc, String mDevStrategyDesc, String mLecturersDesc,
                        String mLogoUrl, String mCoverUrl, RegionDto mRegionDto,
                        String mAddress, double mLat, double mLon, SchoolTypeDto mSchoolTypeDto, long mCreatedDate,
                        String mConnectState) {
        this.mId = mId;
        this.mName = mName;
        this.mShortName = mShortName;
        this.mEducatedScale = mEducatedScale;
        this.mWebsite = mWebsite;
        this.mEmail = mEmail;
        this.mPhone = mPhone;
        this.mHistoryDesc = mHistoryDesc;
        this.mAchievementDesc = mAchievementDesc;
        this.mStudyEnvDesc = mStudyEnvDesc;
        this.mDevStrategyDesc = mDevStrategyDesc;
        this.mLecturersDesc = mLecturersDesc;
        this.mLogoUrl = mLogoUrl;
        this.mCoverUrl = mCoverUrl;
        this.mRegionDto = mRegionDto;
        this.mAddress = mAddress;
        this.mLat = mLat;
        this.mLon = mLon;
        this.mSchoolTypeDto = mSchoolTypeDto;
        this.mCreatedDate = mCreatedDate;
        this.mConnectState = mConnectState;
    }

    public SchoolDetail() {
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

    public int getmEducatedScale() {
        return mEducatedScale;
    }

    public void setmEducatedScale(int mEducatedScale) {
        this.mEducatedScale = mEducatedScale;
    }

    public String getmWebsite() {
        return mWebsite;
    }

    public void setmWebsite(String mWebsite) {
        this.mWebsite = mWebsite;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public String getmHistoryDesc() {
        return mHistoryDesc;
    }

    public void setmHistoryDesc(String mHistoryDesc) {
        this.mHistoryDesc = mHistoryDesc;
    }

    public String getmAchievementDesc() {
        return mAchievementDesc;
    }

    public void setmAchievementDesc(String mAchievementDesc) {
        this.mAchievementDesc = mAchievementDesc;
    }

    public String getmStudyEnvDesc() {
        return mStudyEnvDesc;
    }

    public void setmStudyEnvDesc(String mStudyEnvDesc) {
        this.mStudyEnvDesc = mStudyEnvDesc;
    }

    public String getmDevStrategyDesc() {
        return mDevStrategyDesc;
    }

    public void setmDevStrategyDesc(String mDevStrategyDesc) {
        this.mDevStrategyDesc = mDevStrategyDesc;
    }

    public String getmLecturersDesc() {
        return mLecturersDesc;
    }

    public void setmLecturersDesc(String mLecturersDesc) {
        this.mLecturersDesc = mLecturersDesc;
    }

    public String getmLogoUrl() {
        return mLogoUrl;
    }

    public void setmLogoUrl(String mLogoUrl) {
        this.mLogoUrl = mLogoUrl;
    }

    public String getmCoverUrl() {
        return mCoverUrl;
    }

    public void setmCoverUrl(String mCoverUrl) {
        this.mCoverUrl = mCoverUrl;
    }

    public RegionDto getmRegionDto() {
        return mRegionDto;
    }

    public void setmRegionDto(RegionDto mRegionDto) {
        this.mRegionDto = mRegionDto;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public double getmLat() {
        return mLat;
    }

    public void setmLat(int mLat) {
        this.mLat = mLat;
    }

    public double getmLon() {
        return mLon;
    }

    public void setmLon(int mLon) {
        this.mLon = mLon;
    }

    public SchoolTypeDto getmSchoolTypeDto() {
        return mSchoolTypeDto;
    }

    public void setmSchoolTypeDto(SchoolTypeDto mSchoolTypeDto) {
        this.mSchoolTypeDto = mSchoolTypeDto;
    }

    public long getmCreatedDate() {
        return mCreatedDate;
    }

    public void setmCreatedDate(int mCreatedDate) {
        this.mCreatedDate = mCreatedDate;
    }

    public String getmConnectState() {
        return mConnectState;
    }

    public void setmConnectState(String mConnectState) {
        this.mConnectState = mConnectState;
    }

    @Override
    public String toString() {
        return "SchoolDetail{" +
                "mId='" + mId + '\'' +
                ", mName='" + mName + '\'' +
                ", mShortName='" + mShortName + '\'' +
                ", mEducatedScale=" + mEducatedScale +
                ", mWebsite='" + mWebsite + '\'' +
                ", mEmail='" + mEmail + '\'' +
                ", mPhone='" + mPhone + '\'' +
                ", mHistoryDesc='" + mHistoryDesc + '\'' +
                ", mAchievementDesc='" + mAchievementDesc + '\'' +
                ", mStudyEnvDesc='" + mStudyEnvDesc + '\'' +
                ", mDevStrategyDesc='" + mDevStrategyDesc + '\'' +
                ", mLecturersDesc='" + mLecturersDesc + '\'' +
                ", mLogoUrl='" + mLogoUrl + '\'' +
                ", mCoverUrl='" + mCoverUrl + '\'' +
                ", mRegionDto=" + mRegionDto +
                ", mAddress='" + mAddress + '\'' +
                ", mLat=" + mLat +
                ", mLon=" + mLon +
                ", mCreatedDate=" + mCreatedDate +
                ", mConnectState='" + mConnectState + '\'' +
                '}';
    }
}
