package com.shami.SpringDataJpa.Models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity


public class Author extends BaseEntity{
//    @SequenceGenerator(
//            name = "author_id_gen",
//            sequenceName = "author_sequence",
//            allocationSize = 1
//    )
//    @TableGenerator(
//            name = "author_id_gen",
//            table = "id_generator",
//            pkColumnName ="id_name",
//            pkColumnValue = "id_value",
//            allocationSize = 1
//    )

    @Column
    private String firstname;
    private String lastname;
    @Column(unique = true,nullable = false)
    private String email;
    private int age;
    @Column(
            updatable = false,
            nullable = false
    )
    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;


}
