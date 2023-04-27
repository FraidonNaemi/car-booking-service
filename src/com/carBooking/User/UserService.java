package com.carBooking.User;

import java.util.UUID;

public class UserService {
    private UserDAO userDAO = new UserFileDataAccessService();

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