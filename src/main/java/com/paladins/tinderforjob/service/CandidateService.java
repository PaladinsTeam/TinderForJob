package com.paladins.tinderforjob.service;

import com.paladins.tinderforjob.models.users.Candidate;
import com.paladins.tinderforjob.repo.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.NoSuchElementException;

@org.springframework.stereotype.Service
public class CandidateService implements Service<Candidate> {

    private final CandidateRepository candidateRepository;

    @Autowired
    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @Override
    public Candidate create(Candidate entity) {
        return candidateRepository.save(entity);
    }

    @Override
    public Candidate readById(Long id) {
        return candidateRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("No candidate with id " + id));
    }

    @Override
    public Candidate update(Long id, Candidate entity) {
        Candidate entityToUpdate = candidateRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("No candidate with id " + id));
        entityToUpdate.setName(entity.getName());
        entityToUpdate.setAge(entity.getAge());
        return entityToUpdate;
    }

    @Override
    public void delete(Long id) {
        Candidate entityToDelete = candidateRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("No candidate with id " + id));
        candidateRepository.delete(entityToDelete);
    }
}
