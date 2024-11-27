package _8_oops.encapsulation;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Product {
    private int id;
    private String name;
    private double price;
}
