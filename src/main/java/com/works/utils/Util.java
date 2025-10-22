package com.works.utils;

public class Util {

    private static Util util = null;

    private Util(){
        super();
    }

    public static synchronized Util getInstance(){
        try {
            Thread.sleep(1000);
            if(util == null){
                util = new Util();
            }
        }catch (Exception e){}

        return util;
    }


}
