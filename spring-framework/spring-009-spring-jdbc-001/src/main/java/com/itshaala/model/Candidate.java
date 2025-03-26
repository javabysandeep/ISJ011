package com.itshaala.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Candidate {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
}