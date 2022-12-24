package com.paladins.tinderforjob.models.questionnaires;

import com.paladins.tinderforjob.models.Models;
import com.paladins.tinderforjob.models.enumeration.JobTitle;
import com.paladins.tinderforjob.models.enumeration.Skills;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Общая сущность для резюме и вакансии, "анкета"
 */
@MappedSuperclass
@NoArgsConstructor
@Data
public abstract class Questionnaire implements Models {
    @Id
    @Setter
    @Getter
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
