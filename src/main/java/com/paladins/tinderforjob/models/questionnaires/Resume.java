package com.paladins.tinderforjob.models.questionnaires;

import com.paladins.tinderforjob.models.users.Candidate;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Класс для резюме
 */
@Entity
@Table(name = "resume")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Resume extends Questionnaire {
    @ManyToOne
    private Candidate candidateLink;
}