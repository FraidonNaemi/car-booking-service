package com.carBooking.User;

import java.util.ArrayList;
import java.util.UUID;

public class UserArrayDataAccessService implements UserDAO{
    private static final ArrayList<User> users = new ArrayList<>();

    static {
        users.add(new User(UUID.fromString("506a0c38-6744-4fd2-93ca-39cf6c30062a"), "John"));
        users.add(new User(UUID.fromString("852204e9-c652-4a13-9354-617d1618bd1d"), "James"));
    }

    public ArrayList<User> getAllUsers() {
        return users;
    }
}
