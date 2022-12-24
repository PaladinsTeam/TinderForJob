package com.paladins.tinderforjob.service;

import com.paladins.tinderforjob.models.questionnaires.Vacancy;
import com.paladins.tinderforjob.models.users.Employer;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployerServiceTest {
    @Autowired
    private Service<Employer> employerService;

    @Test
    void serviceCreate_shouldPass() {
        Employer employer = new Employer("Village");
        assertThat(employerService.create(employer)).isEqualTo(employer);
    }
}