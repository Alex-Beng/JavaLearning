import java.util.*;


public class Modifier {
    public static void main(String[] args) {
        /**
         * 修饰符分类
         *      1. 访问修饰符
         *      2. 非访问修饰符
         */
    }
}

class TestModifier {
    /// 不专门说明的话，默认可以修饰 类、接口、变量、方法

    /**
     * default 缺省，同一包可见
     */
    void DoCall() {
        System.out.print("hello");
    }

    /**
     * public 对所有类可见
     */
    public TestModifier() {}

    /**
     * private 在同一类内可见。 使用对象：变量、方法
     */
    private int yayaya;

    /**
     * protected 对同一包内的类和所有子类可见 使用对象：变量、方法
     */
    protected int y233y;
}