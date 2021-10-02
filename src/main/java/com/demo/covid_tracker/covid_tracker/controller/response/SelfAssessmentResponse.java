package com.demo.covid_tracker.covid_tracker.controller.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author prateek.bangre on 02/10/21.
 * @Project covid_tracker
 */
@Builder
@Getter
@Setter
public class SelfAssessmentResponse {
    int riskPercentage;
}
