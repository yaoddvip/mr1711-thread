package com.mr.thread;

/**
 * 使用多线，首先将一个类变为线程类
 *      1：继承 Thread  变为线程类
 *      2：重写Thread中run方法
 *      3：调用start()方法启动线程。
 */
public class MyThread01 extends Thread{

    /**
     * 重写run方法
     */
    @Override
    public void run() {
        for (int i = 0; i <10000 ; i++) {
            System.out.println("i = " + i  );
        }
    }
}
