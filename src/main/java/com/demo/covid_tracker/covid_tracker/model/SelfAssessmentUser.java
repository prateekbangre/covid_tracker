package com.demo.covid_tracker.covid_tracker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author prateek.bangre on 02/10/21.
 * @Project covid_tracker
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "self_assessment_user")
@Embeddable
public class SelfAssessmentUser {

    @Id
    @Column(name = "userId")
    @JsonProperty(namespace = "userId")
    private String userId;

    @Column(name = "symptoms")
    @JsonProperty(namespace = "symptoms")
//    private List<String> symptoms;
    private int symptoms;

    @Column(name = "travelHistory")
    @JsonProperty(namespace = "travelHistory")
    private boolean travelHistory=false;

    @Column(name = "contactWithCovidPatient")
    @JsonProperty(namespace = "contactWithCovidPatient")
    private boolean contactWithCovidPatient=false;

}
