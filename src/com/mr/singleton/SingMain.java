package com.mr.singleton;

/**
 * 多例和单例
 *      单例：只能创建一个对象 ,内存地址一样
 *
 *      多例：每次创建都是新的对象，内存地址不一样
 */
public class SingMain {

    public static void main(String[] args) {

        Sing01 sing = Sing01.getSing();
        System.out.println(sing);

        Sing01 sing2 = Sing01.getSing();
        System.out.println(sing2);
    }
}
