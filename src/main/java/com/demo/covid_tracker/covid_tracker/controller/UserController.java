package com.demo.covid_tracker.covid_tracker.controller;

import com.demo.covid_tracker.covid_tracker.controller.response.RegisterUserResponse;
import com.demo.covid_tracker.covid_tracker.controller.response.SelfAssessmentResponse;
import com.demo.covid_tracker.covid_tracker.dto.UsersDto;
import com.demo.covid_tracker.covid_tracker.model.SelfAssessmentUser;
import com.demo.covid_tracker.covid_tracker.model.Users;
import com.demo.covid_tracker.covid_tracker.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author prateek.bangre on 02/10/21.
 * @Project covid_tracker
 */
@RestController
@RequestMapping("v1/register")
public class UserController {

    @Autowired
    UsersService usersService;

    @PostMapping("/user")
    public ResponseEntity<RegisterUserResponse> createUser(Users usersDto){

        int userId = usersService.createNewUsers(usersDto);
        RegisterUserResponse response = RegisterUserResponse.builder().userId(userId).build();
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }



}
