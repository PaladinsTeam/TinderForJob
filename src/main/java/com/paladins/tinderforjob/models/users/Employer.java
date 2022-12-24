package com.paladins.tinderforjob.models.users;

import com.paladins.tinderforjob.models.questionnaires.Vacancy;
import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Класс работодателя
 */
@Entity
@Table(name = "employer")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employer extends User {
    private String companyName;

    @OneToMany
    @JoinTable(name = "employer_vacancy",
            joinColumns = {@JoinColumn(name = "employer_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "vacancy_id", referencedColumnName = "id")})
    private List<Vacancy> vacancyList;

    public Employer(String companyName) {
        this.companyName = companyName;
    }
}
