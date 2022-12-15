package com.paladins.tinderforjob.service;

import com.paladins.tinderforjob.models.Models;

import javax.transaction.Transactional;

@org.springframework.stereotype.Service
@Transactional
public interface Service<T extends Models> {
//    create() -
//    readById() -
//    update() -
//    delete() (soft-delete) - UserStatus active/non-active

    T create(T entity);

    T readById(Long id);

    T update(Long id, T entity);

    void delete(Long id);
}
