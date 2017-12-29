package com.psstorage.mandy.psstorage.Model;

/**
 * Created by maxch on 12/29/2017.
 */

public class CustomCell {
    public String icon;
    public String name;
    public String link;
    public String username;
    public String password;

    public CustomCell() {
        super();
    }
    public CustomCell(String icon, String name, String link, String username, String passowrd) {
        super();
        this.icon = icon;
        this.name = name;
        this.link = link;
        this.username = username;
        this.password = passowrd;
    }
}
