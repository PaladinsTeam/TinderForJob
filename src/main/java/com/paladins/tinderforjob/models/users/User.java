package com.paladins.tinderforjob.models.users;

import com.paladins.tinderforjob.models.Models;
import com.paladins.tinderforjob.models.enumeration.UserStatus;

import javax.persistence.*;

@MappedSuperclass
//Обозначает класс, информация о сопоставлении которого применяется к сущностям, которые наследуются от него.
public abstract class User implements Models {
    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;

    //region set-get
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    //endregion
}
