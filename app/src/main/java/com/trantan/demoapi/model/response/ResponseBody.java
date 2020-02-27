package com.trantan.demoapi.model.response;

import com.google.gson.annotations.SerializedName;

public class ResponseBody<T> {
    @SerializedName("code")
    private int mCode;

    @SerializedName("msg")
    private String mMessage;

    @SerializedName("data")
    private T mData;

    public ResponseBody(int mCode, String mMessage, T mData) {
        this.mCode = mCode;
        this.mMessage = mMessage;
        this.mData = mData;
    }

    public ResponseBody() {
    }

    public int getmCode() {
        return mCode;
    }

    public void setmCode(int mCode) {
        this.mCode = mCode;
    }

    public String getmMessage() {
        return mMessage;
    }

    public void setmMessage(String mMessage) {
        this.mMessage = mMessage;
    }

    public T getmData() {
        return mData;
    }

    public void setmData(T mData) {
        this.mData = mData;
    }

    @Override
    public String toString() {
        return "ResponseBody{" +
                "mCode=" + mCode +
                ", mMessage='" + mMessage + '\'' +
                ", mData=" + (mData == null? "" : mData.toString()) +
                '}';
    }
}
