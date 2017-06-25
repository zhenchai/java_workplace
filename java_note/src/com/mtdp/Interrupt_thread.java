package com.mtdp;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhenchai on 2017/6/23.
 */
public class Interrupt_thread {


    public static void main(String args[]){

        /*内嵌锁，产生死锁
        final Object o1 = new Object();
        final Object o2 = new Object();
        Thread t1 = new Thread(){
            public void run(){
                synchronized (o1){
                    try {
                        Thread.sleep(1000);
                        synchronized (o2) {};
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                synchronized (o2){
                    try {
                        Thread.sleep(1000);
                        synchronized (o1) {};
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };

        t1.start();
        t2.start();
        Thread.sleep(2000);
        System.out.println("------");
        t1.interrupt();
        t2.interrupt();
        t1.join();
        t2.join();
        System.out.println("====");*/


        final ReentrantLock l1 = new ReentrantLock();
        final ReentrantLock l2 = new ReentrantLock();

        Thread tt1 = new Thread(){
            public void run(){
                try {
                    l1.lockInterruptibly();
                    Thread.sleep(1000);
                    l2.lockInterruptibly();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };



        Thread tt2 = new Thread(){
            public void run(){
                try {
                    l2.lockInterruptibly();
                    Thread.sleep(1000);
                    l1.lockInterruptibly();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        tt1.start();
        tt2.start();
 //       Thread.sleep(2000);
        System.out.println("------");
        tt1.interrupt();
        tt2.interrupt();
 //       tt1.join();
 //       tt2.join();
        System.out.println("====");
    }
}
