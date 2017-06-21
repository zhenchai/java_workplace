package com.mtdp;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
        final String className = Main.class.getName();
        System.out.println("className = "+ className);
        */


        String machineIp = null;
        try {
            machineIp = Inet4Address.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println("the machineIP = "+ machineIp);




    }
}
