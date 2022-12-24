package com.paladins.tinderforjob.service;

import com.paladins.tinderforjob.models.Models;

import javax.transaction.Transactional;

/**
 * Общий интерфейс для CRUD сервисов приложения
 * @param <T>
 */
@org.springframework.stereotype.Service
@Transactional
public interface Service<T extends Models> {

    /**
     * Создает новую запись в БД
     * @param entity - новая сущность
     * @return - записанная в БД сущность
     */
    T create(T entity);

    /**
     * Получает сущность, записанную в БД по id
     * @param id - id искомой сущности
     * @return - искомая сущность
     */
    T readById(Long id);

    /**
     * Обновляет значения ранее записанной сущности
     * @param id - id сущности
     * @param entity - обновленная сущность
     * @return - записанная в БД сущность
     */
    T update(Long id, T entity);

    /**
     * Удаляет запись сущности из БД
     * @param id - id удаляемой сущности
     */
    void delete(Long id);
}
