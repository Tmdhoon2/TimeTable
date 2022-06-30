package com.tmdhoon.timetable;

public class Table {
    private String monday01;
    private String monday02;
    private String monday03;

    public Table(){
    }

    public String getMonday01() {
        return monday01;
    }

    public void setMonday01(String monday01) {
        this.monday01 = monday01;
    }

    public String getMonday02() {
        return monday02;
    }

    public void setMonday02(String monday02) {
        this.monday02 = monday02;
    }

    public String getMonday03() {
        return monday03;
    }

    public void setMonday03(String monday03) {
        this.monday03 = monday03;
    }

    public Table(String monday01, String monday02, String monday03) {
        this.monday01 = monday01;
        this.monday02 = monday02;
        this.monday03 = monday03;
    }
}
