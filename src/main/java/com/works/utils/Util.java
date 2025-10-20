package com.works.utils;

public class Util {

    private static Util util = null;

    private Util(){
        super();
    }

    public static Util getInstance(){
        if(util == null){
            util = new Util();
        }
        return util;
    }

}
