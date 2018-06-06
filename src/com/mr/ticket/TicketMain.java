package com.mr.ticket;

/**
 * 火车票系统
 * 山东---》北京   200
 * <p>
 * 1：变为一个线程类
 */
public class TicketMain implements Runnable {

    //设定火车票的票数为200张
    private static int num = 200;

    @Override
    public void run() {

        for (int i = 0; i < 2000; i++) {
            synchronized (TicketMain.class) {//加入同步锁
                if (num > 0) {//如果>0说明有票
                    num--;//将票数-1
                    System.out.println("购票成功：剩余 ---" + num + "----张");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
