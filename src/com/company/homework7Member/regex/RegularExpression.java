package com.company.homework7Member.regex;

final public class RegularExpression {
    public final String regUserId = "";
    public final String regPassword = "^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[#?!@$%^&*-]).{8,14}$";
    public final String regName = "^[가-힣]+$";
    public final String regEmail = "^[0-9a-zA-Z]([\\-.\\w]*[0-9a-zA-Z\\-_+])*@([0-9a-zA-Z][\\-\\w]*[0-9a-zA-Z]\\.)+[a-zA-Z]{2,9}$";
    //        "(\\\".+\\\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$/";
    //public final String regEmail = "^(([^<>()[\\]\\\\.,;:\\s@\\\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\\\"]+)*)|(\\\"\\.+\\\"))@" +
           // "((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
    public final String regEmail2 = "^[0-9a-zA-Z]([\\-.\\w]*[0-9a-zA-Z\\-_+])*@([0-9a-zA-Z][\\-\\w]*[0-9a-zA-Z]\\.)+[a-zA-Z]{2,9}$";
    public final String regPhoneNum = "^01([0|1|6|7|8|9]?)-?([0-9]{3,4})-?([0-9]{4})$";
    public final String regFileExtension = "(jpg|png|gif|bmp)";
    public final String regSearchAddress = "";
    public final String regBirth = "^((19\\d{2})|(20\\d{2}))(0[1-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1])$";

    public final String test = "^[A-z]$";
}
