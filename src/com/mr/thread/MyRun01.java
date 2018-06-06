package com.mr.thread;

/**
 *  第二种变为线程类的方法
 *      1：实现  Runnable 接口
 *      2：重写接口中run方法
 *
 */
public class MyRun01 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <10000 ; i++) {
            System.out.println("i = " + i  );
            Thread.yield();
           /* try {
                Thread.sleep(1000);//在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作受到系统计时器和调度程序精度和准确性的影响。
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
