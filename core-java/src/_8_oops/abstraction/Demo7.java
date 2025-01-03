package _8_oops.abstraction;

import java.io.Serializable;

public class Demo7 {
    public static void main(String[] args) {
        interface Shippable {
        }
        class Product implements Shippable {
        }
        class ElectronicProduct implements Shippable {
        }

        Product product = new Product();
        if (product instanceof Shippable) {
            System.out.println("product shipped");
        }


    }
}
