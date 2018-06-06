package com.mr.thread;

/**
 * Created by ydd on 2018/6/6.
 */
public class ThreadMain {

    public static void main(String[] args) {
        //创建线程
        MyThread01 myThread01 = new MyThread01();
        MyThread02 myThread02 = new MyThread02();
        //注意：如果直接调用run方法，普通方法的调用 ，
        //myThread01.run();
        //myThread02.run();

        //线程启动  调用 start 方法才是启动线程
        myThread01.start();
        myThread02.start();
    }

}
