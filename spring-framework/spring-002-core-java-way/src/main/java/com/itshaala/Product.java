package com.itshaala;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Product {
    private int id;
    private String name;
    private int price;
}