package com.subrata;

public class SubrataException extends Exception {
   public SubrataException(String s)
    {
        super(s);  //message come to s and go to super class Exception in SubrataException e.getMessage will print this
    }
}
