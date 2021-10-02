package com.demo.covid_tracker.covid_tracker.service.impl;

import com.demo.covid_tracker.covid_tracker.model.SelfAssessmentUser;
import com.demo.covid_tracker.covid_tracker.repository.UserSelfAssessmentRepository;
import com.demo.covid_tracker.covid_tracker.service.UserSelfAssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author prateek.bangre on 02/10/21.
 * @Project covid_tracker
 */
@Service
public class UserSelfAssessmentServiceImpl implements UserSelfAssessmentService {

    @Autowired
    UserSelfAssessmentRepository userSelfAssessmentRepository;

    @Override
    public int selfAssessmentTheUser(SelfAssessmentUser request) {

//        int totalSymptoms = request.getSymptoms().size();
        int totalSymptoms = request.getSymptoms();
        boolean isTravelHistory = request.isTravelHistory();
        boolean isContactWithCovidPatient = request.isContactWithCovidPatient();

        if (totalSymptoms == 1 && (isTravelHistory || isContactWithCovidPatient)){
            return 50;
        }else if (totalSymptoms == 2 && (isTravelHistory || isContactWithCovidPatient)){
            return 70;
        }else if (totalSymptoms > 2 && (isTravelHistory || isContactWithCovidPatient)){
            return 95;
        }else {
            return 5;
        }
    }
}
