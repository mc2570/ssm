package com.zking.model;

import java.util.List;

public class Type {
    private Integer tid;

    private String tname;

    private List<Commodity> commodityList;

    public Type(Integer tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    public List<Commodity> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<Commodity> commodityList) {
        this.commodityList = commodityList;
    }

    public Type() {
        super();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}