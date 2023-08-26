package com.company;

public class ReversString {

    public void reverseString() {

        String firstName = "Madushan";
        String[] names =  firstName.split("");
        for (int name=0; name < names.length; name++) {
            System.out.println(names[names.length-1-name]);
        }
    }
}
