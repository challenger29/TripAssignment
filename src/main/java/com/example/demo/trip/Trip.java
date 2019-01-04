package com.example.demo.trip;


import com.example.demo.customer.Customer;
import com.example.demo.driver.Driver;
import com.example.demo.rating.Rating;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@ToString
@Table(name="trip")
public class Trip extends TimeModel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long id;

    @Getter @Setter
    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinColumn(name ="driver_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Driver driver;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinColumn(name = "customer_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    protected Customer customer;

    @Getter @Setter
    @ManyToOne
    private Rating customerRating;

    @Getter @Setter
    @ManyToOne
    private Rating driverRating;
}
