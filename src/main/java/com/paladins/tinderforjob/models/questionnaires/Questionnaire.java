package com.paladins.tinderforjob.models.questionnaires;

import com.paladins.tinderforjob.models.Models;
import com.paladins.tinderforjob.models.enumeration.JobTitle;
import com.paladins.tinderforjob.models.enumeration.Skills;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@MappedSuperclass
@NoArgsConstructor
@Data
public abstract class Questionnaire implements Models {
    @Id
    @GeneratedValue
    private Long id;

    private JobTitle jobTitle;

    private String education;

    @ManyToMany
    @Enumerated(EnumType.STRING)
    @JoinTable(name = "questionnaire_skills",
            joinColumns = {@JoinColumn(name = "questionnaire_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "skills_id", referencedColumnName = "id")})
    private List<Skills> skillsList;

    private String experience;
}
