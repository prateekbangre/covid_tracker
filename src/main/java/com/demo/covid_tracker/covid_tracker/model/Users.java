package com.demo.covid_tracker.covid_tracker.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author prateek.bangre on 02/10/21.
 * @Project covid_tracker
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users")
@Embeddable
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Column(name = "name")
    private String name;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "pinCode")
    private String pinCode;

    @Column(name = "result")
    private String result="negative";

}
