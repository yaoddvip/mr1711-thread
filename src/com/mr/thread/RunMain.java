package com.mr.thread;

/**
 * Created by ydd on 2018/6/6.
 */
public class RunMain {

    public static void main(String[] args) {
        //创建线程
        MyRun01 myRun01  = new MyRun01();
        MyRun02 myRun02 = new MyRun02();

        //启动线程
        Thread t1 = new Thread(myRun01);
        t1.start();

        Thread t2 = new Thread(myRun02);
        t2.start();
    }

}
