package com.assessment.directtv;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponseModel {

    private List<MetaData> Items;
    private Integer Count;
    private Integer ScannedCount;

    public List<MetaData> getItems() {
        return Items;
    }

    public void setItems(List<MetaData> items) {
        Items = items;
    }

    public Integer getCount() {
        return Count;
    }

    public void setCount(Integer count) {
        Count = count;
    }

    public Integer getScannedCount() {
        return ScannedCount;
    }

    public void setScannedCount(Integer scannedCount) {
        ScannedCount = scannedCount;
    }
}
