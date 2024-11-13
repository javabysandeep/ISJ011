package _7_class_components;

public class Student {
    int id;
    String name;
    String email;
    static String collegeName = "MIT";

    public int getId() {
//        return this.id;
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
