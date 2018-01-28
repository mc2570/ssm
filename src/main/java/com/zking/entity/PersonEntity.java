package com.zking.entity;

import com.zking.base.BaseEntity;

public class PersonEntity extends BaseEntity{
    private Integer pid;
    private String pname;
    private Integer page;

    public PersonEntity() {
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", page=" + page +
                '}';
    }
}
