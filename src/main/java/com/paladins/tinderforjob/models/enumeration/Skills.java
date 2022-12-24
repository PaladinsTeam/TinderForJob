package com.paladins.tinderforjob.models.enumeration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Установленный набор навыков для резюме и вакансий
 */
@Entity
public enum Skills {
    JAVA, PYTHON, UNIT_TESTS, SPRING, GIT, GITHUB, GITLAB, SQL;

    private Long id;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
