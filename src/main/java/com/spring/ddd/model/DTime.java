package com.spring.ddd.model;


import javax.persistence.*;

/**
 * Created by luxin on 2016/7/14.
 */
@Entity
@Table(name="DTime")
public class DTime {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int tid;
    private long time;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getTime() {

        return time;
    }

    public int getTid() {
        return tid;
    }
}
