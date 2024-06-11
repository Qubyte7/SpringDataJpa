package com.shami.SpringDataJpa.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Inheritance(strategy =  InheritanceType.TABLE_PER_CLASS)//we can simply change the strategy for implementing different way of inheritance
//@DiscriminatorColumn(name = "resource_type") -- only with single table  (strategy of the inheritance is single_table.
public class Resource {
    @jakarta.persistence.Id
    @GeneratedValue
    private  Integer Id;
    private String name;
    private int size;
    private String url;
    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;
}
