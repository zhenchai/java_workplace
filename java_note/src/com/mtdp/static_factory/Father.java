package com.mtdp.static_factory;

/**
 * Created by zhenchai on 2017/6/28.
 *
 *静态工厂代替构造器具有灵活性，可生成子类对象；
 */
public class Father {

    private Father(){}

    public void getName(){
        System.out.println("this is father!");
    }

    public static class ChildA extends Father{
        @Override
        public void getName() {
            System.out.println("this is ChildA");
        }
    }

    public static class ChildB extends Father{
        @Override
        public void getName() {
            System.out.println("this is ChildB");
        }
    }

    public static Father getInstance(String type){
        if(type.equals("ChildA")){
            return new ChildA();
        }else if(type.equals("ChildB")){
            return new ChildB();
        }
        return null;
    }
}
