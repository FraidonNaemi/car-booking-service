package com.carBooking.User;

import java.util.UUID;

public class UserService {
    private UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User[] getAllUsers() {
        return userDAO.getAllUsers();
    }

    public User getUserById(UUID id) {
        for(User user : getAllUsers()) {
            if(user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
}