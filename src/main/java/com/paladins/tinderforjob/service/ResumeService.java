package com.paladins.tinderforjob.service;

import com.paladins.tinderforjob.models.questionnaires.Resume;
import com.paladins.tinderforjob.repo.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.NoSuchElementException;

@org.springframework.stereotype.Service
public class ResumeService implements Service<Resume> {
    private final ResumeRepository resumeRepository;

    @Autowired
    public ResumeService(ResumeRepository resumeRepository) {
        this.resumeRepository = resumeRepository;
    }

    @Override
    public Resume create(Resume entity) {
        return resumeRepository.save(entity);
    }

    @Override
    public Resume readById(Long id) {
        return resumeRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("No resume with id " + id));
    }

    @Override
    public Resume update(Long id, Resume entity) {
        Resume entityToUpdate = resumeRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("No resume with id " + id));
        entityToUpdate.setJobTitle(entity.getJobTitle());
        entityToUpdate.setEducation(entity.getEducation());
        //skillsList
        entityToUpdate.setExperience(entity.getExperience());
        return entityToUpdate;
    }

    @Override
    public void delete(Long id) {
        Resume entityToDelete = resumeRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("No resume with id " + id));
        resumeRepository.delete(entityToDelete);
    }
}
