package com.trantan.demoapi.model.request;

import com.google.gson.annotations.SerializedName;

public class RegionDto {
    @SerializedName("id")
    private int mId;

    @SerializedName("name")
    private String mName;

    public RegionDto(int mId, String mName) {
        this.mId = mId;
        this.mName = mName;
    }

    public RegionDto() {
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
}
