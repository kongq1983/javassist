package com.kq.javassist.readclass;

import javassist.ClassPool;
import javassist.CtClass;

public class ReadClassDemo {

    public static void main(String[] args) throws Exception{
        ClassPool pool = ClassPool.getDefault();
        CtClass cc = pool.get("com.kq.javassist.entity.Company");
//        cc.setSuperclass(pool.get("com.kq.javassist.entity.BaseEntity"));
        cc.writeFile("D:\\javassist");
//        cc.writeFile();
    }

}
