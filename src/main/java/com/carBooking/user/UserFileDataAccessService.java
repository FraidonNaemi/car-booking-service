package com.carBooking.user;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class UserFileDataAccessService implements UserDao {

    @Override
    public List<User> getAllUsers() {
        // File file = new File("src/com/carBooking/users.csv");
        File file = new File(getClass().getClassLoader().getResource("users.csv").getPath());

        // as there are four users in users.csv, we put the array size 4
        List<User> users = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) {
                String[] split = scanner.nextLine().split(",");
                users.add(new User(UUID.fromString(split[0]), split[1]));
            }
            return users;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
