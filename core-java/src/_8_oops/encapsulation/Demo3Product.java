package _8_oops.encapsulation;

public class Demo3Product {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Laptop",120.56d);
        Product product2 = new Product();

        product2.setName("Mobile");
        product2.setPrice(120.56);
        product2.setId(2);

        System.out.println(product1);
        System.out.println(product2.getId()+"\t"+product2.getName()+"\t"+product2.getPrice());
    }
}
