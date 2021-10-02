package com.demo.covid_tracker.covid_tracker.service.impl;

import com.demo.covid_tracker.covid_tracker.dto.UsersDto;
import com.demo.covid_tracker.covid_tracker.model.Users;
import com.demo.covid_tracker.covid_tracker.repository.UsersRepository;
import com.demo.covid_tracker.covid_tracker.service.UsersService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author prateek.bangre on 02/10/21.
 * @Project covid_tracker
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public int createNewUsers(Users usersDto) {

        Users save = usersRepository.save(usersDto);
        return Math.toIntExact(save.getUserId());
    }
}
