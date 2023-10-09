package com.study.board.controller;

import com.study.board.entity.Member;
import com.study.board.service.MemberService;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.HashMap;
import java.util.Map;

@RestController
public class MemberController {

    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

    MemberService memberService;

    @RequestMapping("/login")
    public Map<String, Object> login(@RequestBody Member member){
        System.out.println("로그인 프로세스");
        Map<String, Object> Json = new HashMap<>();
        member = memberService.login(member);
        Json.put("멤버정보",member);
        return Json;
    }

}
