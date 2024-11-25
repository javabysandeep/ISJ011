package _7_class_components.nestedClasses;

public class AccessingConstants {
    public static void main(String[] args) {
        System.out.println("mysql dev credentials");
        System.out.println(Constants.Mysql.Dev.USERNAME);
        System.out.println(Constants.Mysql.Dev.PASSWORD);

        System.out.println("mysql test credentials");
        System.out.println(Constants.Mysql.Test.USERNAME);
        System.out.println(Constants.Mysql.Test.PASSWORD);


        System.out.println("mysql prod credentials");
        System.out.println(Constants.Mysql.Prod.USERNAME);
        System.out.println(Constants.Mysql.Prod.PASSWORD);

        System.out.println("oracle dev credentials");
        System.out.println(Constants.Oracle.Dev.USERNAME);
        System.out.println(Constants.Oracle.Dev.PASSWORD);

        System.out.println("oracle test credentials");
        System.out.println(Constants.Oracle.Test.USERNAME);
        System.out.println(Constants.Oracle.Test.PASSWORD);

        System.out.println("oracle prod credentials");
        System.out.println(Constants.Oracle.Prod.USERNAME);
        System.out.println(Constants.Oracle.Prod.PASSWORD);
    }
}
