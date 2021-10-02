package com.demo.covid_tracker.covid_tracker.service;

import com.demo.covid_tracker.covid_tracker.dto.UsersDto;
import com.demo.covid_tracker.covid_tracker.model.Users;

/**
 * @author prateek.bangre on 02/10/21.
 * @Project covid_tracker
 */
public interface UsersService {

    int createNewUsers(Users usersDto);
}
