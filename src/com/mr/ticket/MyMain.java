package com.mr.ticket;

/**
 * Created by ydd on 2018/6/6.
 */
public class MyMain {

    public static void main(String[] args) {
        //售票口
        TicketMain t1 = new TicketMain();
        //某猪
        TicketMain t2 = new TicketMain();
        //某程
        TicketMain t3 = new TicketMain();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);

        //执行线程
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
