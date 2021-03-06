import java.util.*;

public class BasicVariableType {
    public static void main(String[] args) {
        // java 变量主要分两大类
        //      1. 内置数据类型
        //      2. 引用数据类型

        ////////////////////内置数据类型///////////////////////////
        /**
         * 1. byte 
         *      即8位有符号整数（注意是用补码储存的，所以大小范围是-128~127），默认值为0
         *      编译器貌似会检查范围2333，牛逼。
         */
        byte 鸭 = 23;
        /**
         * 2. short 
         *      16位有符号整数（也是补码，-2^15~2^15-1）,默认值为0
         */
        short 鸭鸭 = 233;
        /**
         * 3. int
         *      32位有符号整数，（补码，-2^31~2^31-1）,默认值为0
         */
        int 鸭鸭鸭 = 2333;
        /**
         * 4. long 
         *      64位有符号整数（补码，-2^63~2^63-1）,默认值为0L
         */
        long 鸭鸭鸭鸭 = 23333;
        /**
         * 5. float
         *      32位单精度浮点，默认值为0.0f
         */
        float 鸭鸭鸭鸭鸭 = 233333.f;
        /**
         * 6. double 
         *      64位双精度浮点，默认值为0.0d
         */
        double 鸭鸭鸭鸭鸭鸭 = 2333333.d;
        /**
         * 7. boolean
         *      虽然只用 1 bit 就能存，但是根据官方文档https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
         *      "This data type represents one bit of information, but its "size" isn't something that's precisely defined."
         *      所以大小未定，true/false。默认值为 false
        */
        boolean 鸭鸭鸭鸭鸭鸭鸭 = true;
        /**
         * 8. char 
         *      16位Unicode字符 /u0000~/uffff。因为是Unicode，所以存啥都可以
         */
        char 鸭鸭鸭鸭鸭鸭鸭鸭 = '鸭';

        ////////////////////引用数据类型///////////////////////////
        /**
         *      类似C/C艹的指针，
         *      数组，对象都是引用数据类型
         */

        ///////////////////Java常量////////////////////
        /**
         *      使用 final 修饰
         */
        final char の = '的';

        //////////////////类型转换////////////////////
        /**
         * 自动类型转换
         * char, byte, short → int → long → float → double
         */
        int のint = の;
        /**
         * 强制类型转换
         */
        鸭 = (byte)鸭鸭;
        System.out.print(鸭);
        /**
         * 隐强制类型转换
         *      1.整数型默认为int，赋值时会类型转换
         *      2.浮点因为要在后面加 f / d 所以没有这个问题
         */

        // 变量同C/C艹，先声明后使用，声明格式如下
        // type identifier [ = value][, identifier [= value] ...] ;
        // 不能像C艹 那样 int a(3); 对象必须是 new 出来的 

        // Java 变量类型有三种（参见 file://..\ClassAndObj\ClassAndObj.java ）
        //      1. 类变量 类中 独立于方法  用 static 修饰
        //      2. 实例变量 类中 独立于方法 无 static 修饰
        //      3. 局部变量 类中 方法中的变量
        Demostration ya = new Demostration();
    }
}

class Demostration {
    /**
     * 实例变量 
     *      对象创建的时候创建
     *      有默认值
     */
    int yayaya;
    public Demostration() {
        /**
         * 局部变量
         *      在栈上定义
         *      没有默认值，必须初始化后才能使用
         */
        int 鸭鸭鸭 = 233;
        System.out.print(鸭鸭鸭);
    }
    /**
     * 类变量
     *      储存在静态储存区
     *      对象中的类变量只是类变量的浅拷贝（或者叫引用鸭？）
     *      声明为public/private + final和static
     */
}