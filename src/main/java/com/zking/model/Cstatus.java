package com.zking.model;

import java.util.List;

public class Cstatus {
    private Integer csid;

    private String csname;

    private List<Commodity> commodityList;

    public Cstatus(Integer csid, String csname) {
        this.csid = csid;
        this.csname = csname;
    }

    public List<Commodity> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<Commodity> commodityList) {
        this.commodityList = commodityList;
    }

    public Cstatus() {
        super();
    }

    public Integer getCsid() {
        return csid;
    }

    public void setCsid(Integer csid) {
        this.csid = csid;
    }

    public String getCsname() {
        return csname;
    }

    public void setCsname(String csname) {
        this.csname = csname;
    }
}