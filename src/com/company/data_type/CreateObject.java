package com.company.data_type;

/**
 * Created by 覃玉初 on 2017/7/14.
 */
public class CreateObject {

    public int age;

    public String name="qinyuchu";

    /*创建一个类的对象*/
    /*
    * 使用new关键字创建对象作用：
    * 一：为对象分配内存空间，自动初始化实例变量的变量类型默认值
    * 二：如果实例变量显示初始化，将初始化值赋给实例变量
    * 三：调用构造方法
    * 四：返回对象的引用
    * */

    public CreateObject(){

    }

    public CreateObject(int age){
        this.age=age;
    }


    public static void main(String[] args) {

        /*创建一个引用类型的变量，并显示初始化*/
        /*
        * 创建引用类型变量并出示话的过程或者步骤
        * 一：为对象分配内存空间和成员变量分配内存空间并初始化默认值
        * 二：显示初始化默认值
        * 三：调用构造方法,显示初始化默认值，比如CreateObject(int age)
        * 四：返回引用对象赋给引用变量
        * */
        CreateObject createObject=new CreateObject();

        CreateObject createObject1=new CreateObject(21);

    }
}
