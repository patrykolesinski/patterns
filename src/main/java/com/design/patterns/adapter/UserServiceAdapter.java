package com.design.patterns.adapter;

/**
 * Created by Asus on 03.10.2017.
 */
public class UserServiceAdapter {
    UserService service = new UserService();

    public void save(User user) {
        service.save(user.getFirstName(), user.getLastName());
    }
}
