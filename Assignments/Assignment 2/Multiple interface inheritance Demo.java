interface A {
    void methodA();
}

interface B {
    void methodB();
}

interface C extends A, B {
    void methodC();
}

class Demo implements C {

    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() {
        System.out.println("Method B");
    }

    public void methodC() {
        System.out.println("Method C");
    }
}

public class MultipleInterfaceInheritance {
    public static void main(String[] args) {

        Demo d = new Demo();

        d.methodA();
        d.methodB();
        d.methodC();
    }
}