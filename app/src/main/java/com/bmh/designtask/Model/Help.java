package com.bmh.designtask.Model;

public class Help {

    String title;
    String type;
    int icon;
    String helperGender;
    int helpersNum;
    String time;

    public Help(String title, String type, int icon, String helperGender, int helpersNum, String time) {
        this.title = title;
        this.type = type;
        this.icon = icon;
        this.helperGender = helperGender;
        this.helpersNum = helpersNum;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getHelperGender() {
        return helperGender;
    }

    public void setHelperGender(String helperGender) {
        this.helperGender = helperGender;
    }

    public int getHelpersNum() {
        return helpersNum;
    }

    public void setHelpersNum(int helpersNum) {
        this.helpersNum = helpersNum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
