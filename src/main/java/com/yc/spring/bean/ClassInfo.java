package com.yc.spring.bean;

public class ClassInfo {
    private Integer cid;
    private String cname;
    private Integer year;

    @Override
    public String toString() {
        return "ClassInfo{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", year=" + year +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
