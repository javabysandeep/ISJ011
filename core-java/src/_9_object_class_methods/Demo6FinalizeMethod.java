package _9_object_class_methods;

public class Demo6FinalizeMethod {
    public static void main(String[] args) {
        class Student{
            @Override
            protected void finalize() throws Throwable {
                System.out.println("finalize method");
            }
        }

        Student student = new Student();
        student = null;
        System.gc();//explicit call to the garabge collector
    }
}
