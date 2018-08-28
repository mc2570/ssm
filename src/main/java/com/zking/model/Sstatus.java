package com.zking.model;

public class Sstatus {
    private Integer ssid;

    private String ssname;

    public Sstatus(Integer ssid, String ssname) {
        this.ssid = ssid;
        this.ssname = ssname;
    }

    public Sstatus() {
        super();
    }

    public Integer getSsid() {
        return ssid;
    }

    public void setSsid(Integer ssid) {
        this.ssid = ssid;
    }

    public String getSsname() {
        return ssname;
    }

    public void setSsname(String ssname) {
        this.ssname = ssname;
    }
}