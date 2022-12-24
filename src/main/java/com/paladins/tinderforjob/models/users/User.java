package com.paladins.tinderforjob.models.users;

import com.paladins.tinderforjob.models.Models;
import com.paladins.tinderforjob.models.enumeration.UserStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;

/**
 * Общая сущность для кандидата и работодателя
 */
@Setter
@Getter
@MappedSuperclass
public abstract class User implements Models {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Nullable
    @Enumerated(EnumType.STRING)
    private final UserStatus userStatus = UserStatus.ACTIVE;
}
