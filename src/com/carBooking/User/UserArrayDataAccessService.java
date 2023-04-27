package com.carBooking.User;

import java.util.UUID;

public class UserArrayDataAccessService implements UserDAO{
    private static final User[] users;

    static {
        users = new User[] {
                new User(UUID.fromString("506a0c38-6744-4fd2-93ca-39cf6c30062a"), "John"),
                new User(UUID.fromString("852204e9-c652-4a13-9354-617d1618bd1d"), "James")
        };
    }

    public User[] getAllUsers() {
        return users;
    }
}
