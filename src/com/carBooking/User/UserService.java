package com.carBooking.User;

import java.util.UUID;

public class UserService {
    private UserDAO userDAO = new UserDAO();

    public User[] getAllUsers() {
        return userDAO.getAllUsers();
    }

    public User getUserById(UUID id) {
        for(User user : getAllUsers()) {
            if(id.equals(user.getId())) {
                return user;
            }
        }
        return null;
    }
}