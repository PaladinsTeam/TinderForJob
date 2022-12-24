package com.paladins.tinderforjob.repo;

import com.paladins.tinderforjob.models.Models;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Общий родительский репозиторий для всех сущностей
 * @param <T>
 */
@NoRepositoryBean
public interface MainRepository<T extends Models> extends JpaRepository<T, Long> {
}
