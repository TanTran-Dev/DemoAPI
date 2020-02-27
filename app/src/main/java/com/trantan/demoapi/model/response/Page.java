package com.trantan.demoapi.model.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Page<T> {
    @SerializedName("pageIndex")
    private int mPageIndex;

    @SerializedName("pageSize")
    private int mPageSize;

    @SerializedName("totalItems")
    private int mTotalItem;

    @SerializedName("items")
    private List<T> mItems;

    public Page(int mPageIndex, int mPageSize, int mTotalItem, List<T> mItems) {
        this.mPageIndex = mPageIndex;
        this.mPageSize = mPageSize;
        this.mTotalItem = mTotalItem;
        this.mItems = mItems;
    }

    public Page() {
    }

    public int getmPageIndex() {
        return mPageIndex;
    }

    public void setmPageIndex(int mPageIndex) {
        this.mPageIndex = mPageIndex;
    }

    public int getmPageSize() {
        return mPageSize;
    }

    public void setmPageSize(int mPageSize) {
        this.mPageSize = mPageSize;
    }

    public int getmTotalItem() {
        return mTotalItem;
    }

    public void setmTotalItem(int mTotalItem) {
        this.mTotalItem = mTotalItem;
    }

    public List<T> getmItems() {
        return mItems;
    }

    public void setmItems(List<T> mItems) {
        this.mItems = mItems;
    }

    @Override
    public String toString() {
        return "Page{" +
                "mPageIndex=" + mPageIndex +
                ", mPageSize=" + mPageSize +
                ", mTotalItem=" + mTotalItem +
                ", mItems=" + (mItems == null ? "" : mItems.toString()) +
                '}';
    }
}
