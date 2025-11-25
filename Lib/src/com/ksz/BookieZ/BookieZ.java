package com.ksz.BookieZ;

import com.ksz.BookieZ.features.Login.Login;

public class BookieZ {
    public static final String version = "0.0.1";
    public static void main(String[] args) {
       BookieZ bookieZ=new BookieZ();
       bookieZ.init();
    }
    public void init()
    {
        System.out.println("Welcome to BookieZ Application "+version);
        Login login=new Login();
        login.initLogin();
    }
}
