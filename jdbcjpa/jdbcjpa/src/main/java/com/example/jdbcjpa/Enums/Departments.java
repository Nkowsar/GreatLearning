package com.example.jdbcjpa.Enums;

public enum Departments {
    T("Technology"),
    F("finance"),
    H("HR");
    private  String value;
    Departments(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
