package com.zking.model;

public class Commodity {
    private Integer cid;

    private Integer tid;

    private String cname;

    private String coding;

    private Integer sid;

    private String cimg;

    private Integer uid;

    private String barcode;

    private String csynopsis;

    private String cdetails;

    private Cstatus cstatus;

    private Type type;

    private Unit unit;
    ;
    public Commodity( Integer tid, String cname, String coding, Integer sid, String cimg, Integer uid, String barcode, String csynopsis, String cdetails) {
        this.tid = tid;
        this.cname = cname;
        this.coding = coding;
        this.sid = sid;
        this.cimg = cimg;
        this.uid = uid;
        this.barcode = barcode;
        this.csynopsis = csynopsis;
        this.cdetails = cdetails;
    }
    public Commodity(Integer cid, Integer tid, String cname, String coding, Integer sid, String cimg, Integer uid, String barcode, String csynopsis, String cdetails) {
        this.cid = cid;
        this.tid = tid;
        this.cname = cname;
        this.coding = coding;
        this.sid = sid;
        this.cimg = cimg;
        this.uid = uid;
        this.barcode = barcode;
        this.csynopsis = csynopsis;
        this.cdetails = cdetails;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Cstatus getCstatus() {
        return cstatus;
    }

    public void setCstatus(Cstatus cstatus) {
        this.cstatus = cstatus;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Commodity() {
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCoding() {
        return coding;
    }

    public void setCoding(String coding) {
        this.coding = coding;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getCimg() {
        return cimg;
    }

    public void setCimg(String cimg) {
        this.cimg = cimg;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getCsynopsis() {
        return csynopsis;
    }

    public void setCsynopsis(String csynopsis) {
        this.csynopsis = csynopsis;
    }

    public String getCdetails() {
        return cdetails;
    }

    public void setCdetails(String cdetails) {
        this.cdetails = cdetails;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "cid=" + cid +
                ", tid=" + tid +
                ", cname='" + cname + '\'' +
                ", coding='" + coding + '\'' +
                ", sid=" + sid +
                ", cimg='" + cimg + '\'' +
                ", uid=" + uid +
                ", barcode='" + barcode + '\'' +
                ", csynopsis='" + csynopsis + '\'' +
                ", cdetails='" + cdetails + '\'' +
                '}';
    }
}