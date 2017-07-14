package com.company.data_type;

/**
 * Created by 覃玉初 on 2017/7/14.
 */
public class DataType {

    /*经过static修饰的方法或者变量是直接唯一存在类方法区中的，可以直接使用静态变量或者类名引用*/

    /*
    * int       整型          4字节32位           默认值 0
    * long      长整型        8字节64位           默认值 0l或0L（赋值方式）
    * short     短整型        2字节16位           默认值 0
    * byte      字节型        1字节16位           默认值 0
    * 整型类型，默认整型类型的数值属于有符号整数，第一个二进制为属于0，若标识无符号则属于正整数类型，第一个二进制为属于0
    * Java中计算的数据类型一般是int类型，有时候需要强制转换
    * 整数类型一般可以八进制，十进制，十六进制赋值
    *
    * float     单精度         4字节32位          默认值 0.0f或0.0F（赋值方式）
    * float二进制数据形式SEEEEEEEEMMMMMMMMMMMMMMMMMMMMMM,S表示符号位，E表示指数，M表示底数；S：1位，E：8位，M：23位
    *
    * double    双精度         8字节64位          默认值 0.0d或0.0D（赋值方式）
    * 如果把double付给float有可能会造成精度丢失，所以必须进行强制转换
    *
    * 浮点型
    *
    * 数值类型
    *
    * char      字符型         2字节16位          默认值 '\u0000'
    * 符号类型，转义字符'\'
    *
    * boolean   布尔型         1字节8位           默认值 false
    *
    * 基本类型
    * */

    /*
    * 类类型：某个class类类型或者其子类的实例类型
    * 接口类型：接口类型是实现了这个接口的这个类类型
    * 数组类型：引用类型的数组类型
    *
    * 引用类型
    * */


    /*
    *
    * 基本类型和引用类型的区别；基本类型表示的是简单的数据类型，而引用类型表示的是复杂的数据结构类型。
    * 基本类型仅表示数据类型，引用类型引用的实例表示了复杂的数据结构和操作这些数据类型的行为
    * Java虚拟机处理引用类型和基本数据类型的方式不一样，对基本类型会分配实际占用的内存空间，儿引用类型仅仅是指向堆区中某个实例的指针
    * */

    /*
    * int 整型
    * */
    public int int_age=12;

    public static int int_number=20;

    /*
    * long 长整型
    * */
    public long long_number1=1;

    public static long long_number2=2;

    /*
    * short 短整型
    * */
    public short short_number3=3;

    public static short short_number4=4;

    /*
    * float 单精度
    * */
    public float float_number5=5;

    public static float float_number6=6;

    /*
    * double 双精度
    * */
    public double double_number7=7;

    public static  double double_number8=8;

    /*
    * byte 字节型
    * */
    public byte byte_number9=9;

    public static byte byte_number10=10;

    /*
    * char 字符型
    * */
    public char char_number11=11;

    public  static char char_number12=12;

    /*
    * boolean 布尔类型
    * */

    public boolean boolean_number13=true;

    public static boolean boolean_number114=false;

    /*
    * boolean 布尔型
    * 在Java中0代表false，大于0的代表true，由于这是属于底层的处理，虚拟机对Java源程序是透明的
    * 所以不能赋予整数或者null
    * */

    public static void main(String[] args) {
        /*类名引用*/
        System.out.println(DataType.int_number);
        /*在静态成员方法或变量的当前类可以直接引用*/

        /*不是静态变量修饰的成员变量或方法必须通过实例化类获得对象引用，当然不止实例化一种方法*/
        DataType dataType=new DataType();
        System.out.println(dataType.int_age);
    }

}
