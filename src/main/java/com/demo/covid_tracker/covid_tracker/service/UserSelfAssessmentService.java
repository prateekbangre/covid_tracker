package com.demo.covid_tracker.covid_tracker.service;

import com.demo.covid_tracker.covid_tracker.model.SelfAssessmentUser;

/**
 * @author prateek.bangre on 02/10/21.
 * @Project covid_tracker
 */
public interface UserSelfAssessmentService {
    int selfAssessmentTheUser(SelfAssessmentUser request);
}
