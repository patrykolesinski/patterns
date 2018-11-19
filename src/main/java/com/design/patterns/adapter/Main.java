package com.design.patterns.adapter;

/**
 * Created by Asus on 03.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        UserServiceAdapter userService = new UserServiceAdapter();
        User user = new User("jan", "nowak");
        userService.save(user);
    }
}
