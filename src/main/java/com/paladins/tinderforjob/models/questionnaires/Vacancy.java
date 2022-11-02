package com.paladins.tinderforjob.models.questionnaires;

import com.paladins.tinderforjob.models.users.Employer;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vacancy")
public class Vacancy extends Questionnaire {
    @ManyToOne //много вакансий к одному работодателю
    private Employer companyLink;
}
