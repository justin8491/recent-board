package com.study.board.service;

import com.study.board.entity.Member;
import com.study.board.mappers.Member.MemberDAO;

public class MemberService {

    MemberDAO memberDAO;

    public Member login(Member member) {
        Member findUser = memberDAO.findMember(member.getUid());
        if(findUser != null && findUser.getPwd().equals(member.getPwd()))return findUser;
        return null;
    }
}
