package com.zking.model;

import java.util.List;

public class Unit {
    private Integer uid;

    private String uname;

    private List<Commodity> commodityList;

    public Unit(Integer uid, String uname) {
        this.uid = uid;
        this.uname = uname;
    }

    public List<Commodity> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<Commodity> commodityList) {
        this.commodityList = commodityList;
    }

    public Unit() {
        super();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}