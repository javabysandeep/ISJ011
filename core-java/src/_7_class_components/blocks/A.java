package _7_class_components.blocks;

public class A {
    int x;
    int y;

    static int objectCounter = 0;

    A() {
        // objectCounter++;
    }

    public A(int x) {
        this.x = x;
        //objectCounter++;
    }

    public A(int x, int y) {
        this.x = x;
        this.y = y;
        //objectCounter++;
    }

    {
        objectCounter++;
        System.out.println("instance block");
    }

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A(10);
        A a3 = new A(10, 20);
        System.out.println("Total objects created " + A.objectCounter);
    }
}
