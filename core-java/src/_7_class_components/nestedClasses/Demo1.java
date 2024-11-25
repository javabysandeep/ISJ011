package _7_class_components.nestedClasses;

public class Demo1 {
    public static void main(String[] args) {
        //x is static member of Outer class
        System.out.println(Outer.x);

        //accessing static members of Static nested class :
        // OuterClass.StaticNestedClass.staticMember
        System.out.println("accessing static members of Static nested class : ");
        System.out.println(Outer.StaticNested.sv);
        Outer.StaticNested.m2();


        //accessing non-static members of Static nested class :
        // StaticNestedClassReference.nonStaticMember
        System.out.println("accessing non- static members of Static nested class : ");
        Outer.StaticNested reference = new Outer.StaticNested();
        System.out.println(reference.iv);
        reference.m1();



    }
}
