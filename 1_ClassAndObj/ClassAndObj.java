import java.util.*;

/**
 * SingleDog
 */
class SingleDog {
    // 成员变量 （实例变量）
    int age;

    // 类的方法
    void Xiu() {

        // 局部变量 
        String words;
    }

    void 粗鄙之语() {
        System.out.print(this.fuck_words);
    }

    // 类变量（静态变量 static 关键字）
    // 所有实例只是类变量的一个浅拷贝（或者叫引用？），类变量存放在静态储存区
    // 在一个实例中改动就会使所有实例中的跟着改动
    static String fuck_words;

    // 类的构造方法
    public SingleDog() {
        this.age = -233;
        this.fuck_words = "鸭鸭鸭";
        System.out.println("age is: "+this.age);
        System.out.print("fuck words: "+this.fuck_words+"\n");
    }
}

// 一个源文件只能有一个public类
// 但是可以有多个非public类
public class ClassAndObj {
    public static void main(String[] args) {
        // 创建对象
        SingleDog me = new SingleDog();

        // 访问类中变量
        me.age = 233;

        // 访问类中方法
        me.粗鄙之语();
    }
}