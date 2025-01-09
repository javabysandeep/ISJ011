package _9_object_class_methods;

import lombok.*;

public class Demo7CloneMethod {
    public static void main(String[] args) throws CloneNotSupportedException {
        @AllArgsConstructor
        @NoArgsConstructor
        @Getter
        @Setter
        @ToString
        class Address{
            private String street;
            private String city;
            private String state;
            private String country;
        }


        @AllArgsConstructor
        @NoArgsConstructor
        @Getter
        @Setter
        @ToString
        class Student implements Cloneable {
            private int id;
            private String name;
            private Address address;//contained object

            @Override
            public Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }

        Address address = new Address("Shivajinagar","Pune","MH","India");
        Student student1 = new Student(1,"Shivani",address);

        //Student student2 = student1;//this is not the object copying

        Student student2 = (Student) student1.clone();

        student2.address.setState("Telangana");

        System.out.println(student1);
        System.out.println(student2);
    }
}
