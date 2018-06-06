package com.mr.singleton;

/**
 * 将一个类变为单例：
 * 1：提供私有的构造函数：
 *      不让其他类new对象；
 *      创建对造象肯定调用了公共的无参构函数；
 * 2：创建公共的方法提供 对象  ；
 * 3：判断，如果第一次进来，创建新的对象
 *      如果第二以后，不需要创建对象，而是将对象直接返回。
 *
 * 4：在多线程的情况下，同时进入if()判断、则会出现创建多个对象的结果
 *  加入同步锁。
 */
public class Sing01 {

    private static Sing01 sing01 = null;

    //提供私有的构造函数
    //私有的方法和属性都不能别其他类调用
    private Sing01() {

    }

    //创建公共的方法  提供  sing01
    public static Sing01 getSing() {
        if(null == sing01) {
            synchronized (Sing01.class) {
                if (sing01 == null) {//如果sing01为null
                    //创建对象
                    sing01 = new Sing01();
                }
            }
        }
        return sing01;
    }

    //私有化属性，提供公共get、set方法
    private String name;


    private String getName() {
        return "zs";
    }


}
