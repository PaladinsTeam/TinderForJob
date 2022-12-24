package com.paladins.tinderforjob.repo;

import com.paladins.tinderforjob.models.users.Candidate;

public interface CandidateRepository extends MainRepository<Candidate> {
    Candidate readByName(String name);
}
