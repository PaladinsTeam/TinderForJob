package com.paladins.tinderforjob.models.questionnaires;

import com.paladins.tinderforjob.models.users.Candidate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "resume")
public class Resume extends Questionnaire {
    @ManyToOne //много резюме к одному кандидату
    private Candidate candidateLink;
}