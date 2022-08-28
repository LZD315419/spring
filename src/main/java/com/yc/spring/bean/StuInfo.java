package com.yc.spring.bean;

public class StuInfo {
    private Long sid;
    private String sname;
    private Integer cid;
    private String sex;
    private Integer age;
    private String tel;

    private  ClassInfo cf;

    @Override
    public String toString() {
        return "StuInfo{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", cid=" + cid +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                ", cf=" + cf +
                '}';
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public ClassInfo getCf() {
        return cf;
    }

    public void setCf(ClassInfo cf) {
        this.cf = cf;
    }
}
