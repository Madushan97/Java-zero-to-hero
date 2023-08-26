package com.company;

public class VowelsPresent {

    public boolean vowelIsPresent(String string) {
            return string.toLowerCase().matches(".*[aeiou].*") ? true : false;
    }
}
