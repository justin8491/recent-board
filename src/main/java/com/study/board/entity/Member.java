package com.study.board.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Builder
public class Member {
    private String uid;
    private String pwd;
    private String email;
    private String age;

}
