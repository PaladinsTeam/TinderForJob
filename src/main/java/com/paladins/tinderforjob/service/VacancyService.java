package com.paladins.tinderforjob.service;

import com.paladins.tinderforjob.models.questionnaires.Vacancy;
import com.paladins.tinderforjob.repo.VacancyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.NoSuchElementException;

@org.springframework.stereotype.Service
public class VacancyService implements Service<Vacancy> {

    private final VacancyRepository vacancyRepository;

    @Autowired
    public VacancyService(VacancyRepository vacancyRepository) {
        this.vacancyRepository = vacancyRepository;
    }

    @Override
    public Vacancy create(Vacancy entity) {
        return vacancyRepository.save(entity);
    }

    @Override
    public Vacancy readById(Long id) {
        return vacancyRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("No vacancy with id " + id));
    }

    @Override
    public Vacancy update(Long id, Vacancy entity) {
        Vacancy entityToUpdate = vacancyRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("No vacancy with id " + id));
        entityToUpdate.setJobTitle(entity.getJobTitle());
        entityToUpdate.setEducation(entity.getEducation());
        entityToUpdate.setExperience(entity.getExperience());
        return entityToUpdate;
    }

    @Override
    public void delete(Long id) {
        Vacancy entityToDelete = vacancyRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("No vacancy with id " + id));
        vacancyRepository.delete(entityToDelete);
    }
}
