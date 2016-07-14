package com.spring.ddd.model;

import javax.persistence.*;

/**
 * Created by luxin on 2016/7/13.
 */
@Entity
@Table(name="Dept")
public class CreateDept {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long deptno;
    private String dname;
    private String loc;

    public long getDeptno() {
        return deptno;
    }

    public String getDname() {
        return dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setDeptno(long deptno) {
        this.deptno = deptno;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
