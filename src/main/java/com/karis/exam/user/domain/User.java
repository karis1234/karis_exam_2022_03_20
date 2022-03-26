package com.karis.exam.user.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
public class User {
    @Id // 주(primary) 키
    @GeneratedValue(strategy = GenerationType.IDENTITY) // mysql 전용
    private long id;
    private LocalDateTime regDate;
    private LocalDateTime updateDate;
    private String email;
    private String password;
    private String name;


}
