package com.demo.covid_tracker.covid_tracker.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

/**
 * @author prateek.bangre on 02/10/21.
 * @Project covid_tracker
 */
@Getter
@Setter
@NoArgsConstructor
public class UsersDto {

    private String name;
    private String phoneNumber;
    private String pinCode;
}
