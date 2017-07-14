package com.company.data_type;

/**
 * Created by 覃玉初 on 2017/7/14.
 */
public class DataType {

    /*
    * int 整型
    * */
    public int age=12;

    /*经过static修饰的方法或者变量是直接唯一存在类方法区中的，可以直接使用静态变量或者类名引用*/
    public static int number=20;

    /*
    * long 长整型
    * */


    public static void main(String[] args) {
        /*类名引用*/
        System.out.println(DataType.number);
        /*在静态成员方法或变量的当前类可以直接引用*/
        System.out.println(number);
    }

}
