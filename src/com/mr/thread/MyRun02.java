package com.mr.thread;

/**
 *  第二种变为线程类的方法
 *      1：实现  Runnable 接口
 *      2：重写接口中run方法
 *      3：创建 Thread(线程类)
 *      4：调用 thread 的 start 方法
 *
 *      5:yield() :暂停当前正在执行的线程对象，并执行其他线程。
 *      6:sleep()：在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），
 *          此操作受到系统计时器和调度程序精度和准确性的影响。
 */
public class MyRun02 implements Runnable{

    @Override
    public void run() {
        for (int j = 0; j <10000 ; j++) {
            System.out.println("j --------------- " + j  );
            /*try {
                Thread.sleep(1000);//在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作受到系统计时器和调度程序精度和准确性的影响。
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
