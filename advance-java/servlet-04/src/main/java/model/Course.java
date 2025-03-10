package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Course {
    private int id;
    private String name;
    private int price;
    private String duration;
}
