package com.company.data_type;

import com.sun.org.apache.xpath.internal.operations.Variable;

/**
 * Created by 覃玉初 on 2017/7/14.
 */
public class VariableActionScope {

    /*变量作用域值得是变量的活动范围，只有在这个生存范围才能访问它变量
    * 其中作用域决定了变量的生命周期，生命周期指的是变量的创建并分配空间到销毁变量并清除变量占用的内存空间的过程
    *
    * 成员变量：类中声明，作用域是整个类
    * 局部变量：方法内部或者方法内部的某个代码块的内部声明，局部变量的作用域是存在某个代码块的开始代码块到结束代码块
    * 方法参数：方法或者构造方法的参数，作用域是整个方法或构造方法
    * 异常处理参数：和方法参数有一定的相识，一个是传递个方法或构造方法，一个是传递给异常处理代码块，比如catch(Exception e)
    * */

    /*类的成员变量或非静态变量*/
    public String name="qinyuchu";

    public int age=1;

    public VariableActionScope(){

    }

    public VariableActionScope(int age){
        this.age=age;
    }

    public static void main(String[] args) {
        VariableActionScope scope=new VariableActionScope(21);
        scope.sum(10);
        /*引用局部变量，无法引用*/
        /*scope.sum;sum++;*/
    }

    /*成员方法吧*/
    public String MyName(String name){
        return name;
    }

    /*异常处理参数*/
    public int sum(int i){
        /*局部变量*/
        /*除以0会发生ArithmeticException异常*/
        int sum=0;
        /*捕获处于零的异常*/
        try{
            sum=i/0;
        }catch(ArithmeticException e){
            System.out.println("不可以除以0");
        }
        return sum;
    }

}
