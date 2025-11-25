package com.ksz.BookieZ.repository;

import com.ksz.BookieZ.dto.Librarian;
import com.ksz.BookieZ.dto.LoginInfo;

public class BookieZDB {
    private LoginInfo credentials = new LoginInfo();
    public boolean isValidUser(String userName, String password){
        return userName.equals(credentials.getUserName()) && password.equals(credentials.getPassword());
    }



    public void insertLibrarian(Librarian librarian){
        //insert query
    }

    public Librarian getUserInfo(String id){
        //get query
        return new Librarian();
    }
}
