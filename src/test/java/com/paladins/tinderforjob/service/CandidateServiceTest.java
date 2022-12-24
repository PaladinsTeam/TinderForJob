package com.paladins.tinderforjob.service;

import com.paladins.tinderforjob.models.users.Candidate;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class CandidateServiceTest {

    @Autowired
    private Service<Candidate> candidateService;

    @Test
    void serviceCreate_shouldPass() {
        Candidate candidate = new Candidate("test2", 36);
        assertThat(candidateService.create(candidate)).isEqualTo(candidate);
        System.out.println(candidate);
    }

    @Test
    void isNull(){
        Candidate candidate = new Candidate("Fox", 22);
        assertThat(candidate.getResumeList()).isNull();
    }
}