package com.paladins.tinderforjob.models.questionnaires;

import com.paladins.tinderforjob.models.users.Employer;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Класс для вакансии
 */
@Entity
@Table(name = "vacancy")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vacancy extends Questionnaire {
    @ManyToOne
    private Employer companyLink;
}
