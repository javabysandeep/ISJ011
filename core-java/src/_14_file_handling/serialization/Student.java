package _14_file_handling.serialization;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student implements Serializable {
    private int id;
    private String name;
    private String username;
    transient private String password;
}
