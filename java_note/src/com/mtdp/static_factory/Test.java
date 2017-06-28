package com.mtdp.static_factory;

/**
 * Created by zhenchai on 2017/6/28.
 */
public class Test {

    public static void main(String[] args){
        Father father1 = Father.getInstance("ChildA");
        father1.getName();
        Father father2 = Father.getInstance("ChildB");
        father2.getName();
    }
}
