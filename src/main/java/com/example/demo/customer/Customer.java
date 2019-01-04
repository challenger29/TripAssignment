package com.example.demo.customer;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="customer")
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    @Column(name="customer_id")
    private Long id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private Double avgRating;

}
