package com.paladins.tinderforjob.repo;

import com.paladins.tinderforjob.models.Models;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository<T extends Models> extends JpaRepository<T, Long> {
}
