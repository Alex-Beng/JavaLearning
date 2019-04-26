abstract class SpeakAndRun {
    public abstract void speak();

    public abstract void run();
}

class Dog extends SpeakAndRun {
    public void speak() {
        System.out.println("狗的声音:汪、汪！");
    }

    public void run() {
        System.out.println("狗用四肢跑步");
    }
}

class Person extends SpeakAndRun {
    public void speak() {
        System.out.println("人们见面时经常说:您好！");
    }

    public void run() {
        System.out.println("人用两腿跑步");
    }
}

class Bird extends SpeakAndRun {
    public void speak() {
        System.out.println("鸟儿：鸭鸭鸭");
    }

    public void run() {
        System.out.println("鸟用两条腿跳着走");
    }
}

public class TestInterfacesAbsClass {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak();
        d.run();

        Person p = new Person();
        p.speak();
        p.run();

        Bird b = new Bird();
        b.speak();
        b.run();
    }
}
