package com.ksz.BookieZ.features.Login;

import com.ksz.BookieZ.features.UpdateCredentials.UpdateCredentials;
import com.ksz.BookieZ.repository.BookieZDB;

import java.util.Scanner;

public class Login {
    public void initLogin() {
        System.out.println("Please enter user name");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Enter password");
        String userPassword = scanner.next();

        if (new BookieZDB().isValidUser(userName, userPassword)) {
            UpdateCredentials updateCredentials = new UpdateCredentials();
            updateCredentials.init();
        } else {
            System.out.println("invalid username or password");
            System.out.println("Do you want to try again? Y/N");
            String option = scanner.next();
            if (option.equals("Y")) {
                initLogin();
            }
        }
    }
}
