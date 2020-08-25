package com.cbt.utilities;

public class StringUtility {
    public static void verifyEquals( String expected, String actual){
        String dummy="";
        if(expected.equals(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
