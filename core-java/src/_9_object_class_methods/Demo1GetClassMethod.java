package _9_object_class_methods;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo1GetClassMethod {
    public static void main(String[] args) {
        class Student {
            public static int id;
            public static String name;
            public static String address;

            static void m1() {
            }

            static void m2() {
            }

            static void m3() {
            }
        }

        Student student = new Student();
        Class studentClassInformation = student.getClass();
        System.out.println("Name of the class " + studentClassInformation.getName());
        Method[] methods = studentClassInformation.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        Field[] fields = studentClassInformation.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }


    }
}
