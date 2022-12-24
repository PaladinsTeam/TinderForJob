package com.paladins.tinderforjob.service;

import com.paladins.tinderforjob.models.users.Employer;
import com.paladins.tinderforjob.repo.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.NoSuchElementException;

@org.springframework.stereotype.Service
public class EmployerService implements Service<Employer> {

    private final EmployerRepository employerRepository;

    @Autowired
    public EmployerService(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }

    @Override
    public Employer create(Employer entity) {
        return employerRepository.save(entity);
    }

    @Override
    public Employer readById(Long id) {
        return employerRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("No employer with id " + id));
    }

    @Override
    public Employer update(Long id, Employer entity) {
        Employer entityToUpdate = employerRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("No candidate with id " + id));
        entityToUpdate.setCompanyName(entity.getCompanyName());
        return entityToUpdate;
    }

    @Override
    public void delete(Long id) {
        Employer entityToDelete = employerRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("No candidate with id " + id));
        employerRepository.delete(entityToDelete);
    }
}
