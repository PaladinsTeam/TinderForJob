package com.paladins.tinderforjob.models.users;

import com.paladins.tinderforjob.models.questionnaires.Vacancy;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employer")
public class Employer extends User {
    private String companyName;

    @OneToMany
    @JoinTable(name = "employer_vacancy",
            joinColumns = {@JoinColumn(name = "employer_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "vacancy_id", referencedColumnName = "id")})
    private List<Vacancy> vacancyList;
}
