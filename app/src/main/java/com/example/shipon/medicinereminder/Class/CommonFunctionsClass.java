package com.example.shipon.medicinereminder.Class;

public class CommonFunctionsClass {

    public static int getMonth(String date) {
        int str1 = date.indexOf("/");
        int str2 = date.lastIndexOf("/");
        String st1 = date.substring(0, str1);
        String st2 = date.substring(str1 + 1, str2);
        return Integer.parseInt(st2);
    }

    public static int getDay(String date) {
        int str1 = date.indexOf("/");
        int str2 = date.lastIndexOf("/");
        String st1 = date.substring(0, str1);
        int ind = Integer.valueOf(st1);
        return ind;
    }

    public static int getYear(String date) {
        int str1 = date.indexOf("/");
        int str2 = date.lastIndexOf("/");
        String st1 = date.substring(0, str1);
        String st2 = date.substring(str1 + 1, str2);
        String st3 = date.substring(str2 + 1, date.length());
        return Integer.parseInt(st3);
    }

    public static int getHour(String time) {
        int str1 = time.indexOf(":");
        String st1 = time.substring(0, str1);
        int h = Integer.parseInt(st1);
        // if (h >= 12) h = h % 12;
        return h;
    }

    public static int getMin(String time) {
        int str1 = time.indexOf(":");
        String st2 = time.substring(str1 + 1, time.length());
        return Integer.parseInt(st2);
    }

}
