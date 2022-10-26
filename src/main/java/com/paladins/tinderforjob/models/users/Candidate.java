package com.paladins.tinderforjob.models.users;

import com.paladins.tinderforjob.models.questionnaires.Resume;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "candidate")
public class Candidate extends User {
    private String name;

    private Integer age;

    @OneToMany
    @JoinTable(name = "candidate_resume",
            joinColumns = {@JoinColumn(name = "candidate_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "resume_id", referencedColumnName = "id")})
    private List<Resume> resumeList;
}
