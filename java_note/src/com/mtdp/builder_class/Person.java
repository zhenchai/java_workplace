package com.mtdp.builder_class;

/**
 * Created by zhenchai on 2017/6/26.
 * 通过构建器生成对象
 */
public class Person {

    private final String userName;
    private final int age;

    private final int moneyTotal;
    private final String address;
    private final double height;

    public static class Builder {
        private final String userName;
        private final int age;

        //optional parameters
        private int moneyTotal  = 0;
        private String address = "";
        private double height = 1.0;

        public Builder(String userName, int age){
            this.userName = userName;
            this.age = age;
        }

        public Builder moneyTotal(int moneyTotal){
            moneyTotal = moneyTotal;
            return this;
        }

        public Builder address(int address){
            address = address;
            return this;
        }

        public Builder height(int height){
            height = height;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    private Person(Builder builder){
        userName = builder.userName;
        age = builder.age;
        moneyTotal = builder.moneyTotal;
        address = builder.address;
        height = builder.height;
    }
}
