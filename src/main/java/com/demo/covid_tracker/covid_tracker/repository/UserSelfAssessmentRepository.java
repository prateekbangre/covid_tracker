package com.demo.covid_tracker.covid_tracker.repository;

import com.demo.covid_tracker.covid_tracker.model.SelfAssessmentUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author prateek.bangre on 02/10/21.
 * @Project covid_tracker
 */
@Repository
public interface UserSelfAssessmentRepository extends CrudRepository<SelfAssessmentUser, String> {
}
