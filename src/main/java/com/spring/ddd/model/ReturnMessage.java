package com.spring.ddd.model;

/**
 * Created by luxin on 2016/7/13.
 */
public class ReturnMessage {
    private int id;
    private String message;

    public void setId(int id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {

        return id;
    }

    public String getMessage() {
        return message;
    }
}
