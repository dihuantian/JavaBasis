package com.company.data_type;

/**
 * Created by 覃玉初 on 2017/7/14.
 */
public class VariableBeingCycle {

    /*
    * 变量有两种，一种是被static修的叫类变量或静态变量，一种是没有被修饰的叫实例变量或非静态变量
    * 实例变量和静态变量的区别：
    * 一：类的类变量在内存空间中只有一个存在，再加载类的过程中静态变量被分配内存空间，并位于方法区，被所有实例共享，直接通过类名访问，生命取决于类的生存周期
    * 二：每创建一个实例，虚拟机就为实例变量分配一次内存空间，其中变量位于堆区，实例变量的生命周期取决于实例的生命周期
    * */

    public String name="qinyuchu";

    public static int age=21;

    public static void main(String[] args) {
        /*静态变量的使用*/
        System.out.println(age);
        System.out.println(VariableBeingCycle.age);
        /*实例变量的使用*/
        VariableBeingCycle variableBeingCycle=new VariableBeingCycle();
        System.out.println(variableBeingCycle.name);
    }

}
