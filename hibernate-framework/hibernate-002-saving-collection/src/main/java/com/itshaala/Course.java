package com.itshaala;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "course_tbl")
public class Course {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "description")
    private String description;

    @ElementCollection
    @CollectionTable(name = "course_modes",
            joinColumns = @JoinColumn(name = "course_id"))
    @Column(name = "course_mode")
    private List<String> modes = new ArrayList<>();
}
