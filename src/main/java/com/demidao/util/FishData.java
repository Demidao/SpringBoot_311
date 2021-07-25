package com.demidao.util;

import com.demidao.models.User;

import java.util.ArrayList;
import java.util.List;

public class FishData {

    private static List<User> initUserList = new ArrayList<>();

    /*
    Password is 0
     */
    static {

        User adminUser = new User("Charlie", "Croker", 35, "admin@admin.ru", "$2y$12$TilEelQUr/VsKh8QVZ9Ocef8vYJBOUxvKD.HFX9./hqaQphXU9yOS");
        User user1 = new User("Stella", "Bridger", 30, "stella_bri@neveremail.it", "$2y$12$TilEelQUr/VsKh8QVZ9Ocef8vYJBOUxvKD.HFX9./hqaQphXU9yOS");
        User user2 = new User("Steve", "Frazelli", 38, "frazza@neveremail.it", "$2y$12$TilEelQUr/VsKh8QVZ9Ocef8vYJBOUxvKD.HFX9./hqaQphXU9yOS");

        adminUser.addRole("ROLE_ADMIN");
        user1.addRole("ROLE_USER");
        user2.addRole("ROLE_USER");

        initUserList.add(adminUser);
        initUserList.add(user1);
        initUserList.add(user2);
    }

    public static List<User> getInitUserList() {
        return initUserList;
    }
}
