package com.zking.model;

public class Specifications {
    private Integer spid;

    private String spoding;

    private String barcode;

    private Integer number;

    private Integer uid;

    private String specifcation;

    private Double price;

    private Double sale;

    private String customer;

    private Integer ssid;

    private String qrcode;

    public Specifications(Integer spid, String spoding, String barcode, Integer number, Integer uid, String specifcation, Double price, Double sale, String customer, Integer ssid, String qrcode) {
        this.spid = spid;
        this.spoding = spoding;
        this.barcode = barcode;
        this.number = number;
        this.uid = uid;
        this.specifcation = specifcation;
        this.price = price;
        this.sale = sale;
        this.customer = customer;
        this.ssid = ssid;
        this.qrcode = qrcode;
    }

    public Specifications() {
        super();
    }

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public String getSpoding() {
        return spoding;
    }

    public void setSpoding(String spoding) {
        this.spoding = spoding;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getSpecifcation() {
        return specifcation;
    }

    public void setSpecifcation(String specifcation) {
        this.specifcation = specifcation;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSale() {
        return sale;
    }

    public void setSale(Double sale) {
        this.sale = sale;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getSsid() {
        return ssid;
    }

    public void setSsid(Integer ssid) {
        this.ssid = ssid;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }
}