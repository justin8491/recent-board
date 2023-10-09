package com.study.board.mappers.Member;

import com.study.board.entity.Member;

public interface MemberDAO {
    Member findMember(String uid);
}
