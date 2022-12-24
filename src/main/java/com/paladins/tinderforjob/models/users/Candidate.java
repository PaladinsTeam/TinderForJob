package com.paladins.tinderforjob.models.users;

import com.paladins.tinderforjob.models.questionnaires.Resume;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

/**
 * Класс кандидата
 */
@Entity
@Table(name = "candidate")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Candidate extends User {
    private String name;

    private Integer age;

    @OneToMany
    @JoinTable(name = "candidate_resume",
            joinColumns = {@JoinColumn(name = "candidate_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "resume_id", referencedColumnName = "id")})
    private List<Resume> resumeList;

    public Candidate(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        if (!name.equals(candidate.name) || !age.equals(candidate.age)) return false;
        assert resumeList != null;
        return resumeList.equals(candidate.resumeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, resumeList);
    }
}


