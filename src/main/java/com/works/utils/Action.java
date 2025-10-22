package com.works.utils;

public class Action {

    public Action() {
        System.out.println("Action Call");
    }

    public String getCity() {
        try {
            Thread.sleep(3000);
            return "İstanbul";
        }catch (Exception e){}
        return null;
    }
}
