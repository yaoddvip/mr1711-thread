package com.mr.thread;

/**
 * 使用多线，首先将一个类变为线程类
 *      1：继承 Thread  变为线程类
 *      2：重写Thread中run方法
 */
public class MyThread02 extends Thread{

    /**
     * 重写run方法
     */
    @Override
    public void run() {
        for (int j = 0; j <10000 ; j++) {
            System.out.println("j --------------- " + j  );
        }
    }
}
