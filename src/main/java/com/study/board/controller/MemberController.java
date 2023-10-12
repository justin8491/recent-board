package com.study.board.controller;

import com.study.board.entity.Member;
import com.study.board.service.MemberService;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MemberController {

    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

    MemberService memberService;

    @RequestMapping(value = "/user/login")
    public Map<String, Object> login(@RequestBody() Member member, String uid, String pwd){
        System.out.println("로그인 프로세스");
        System.out.println(uid);
        System.out.println(pwd);
        System.out.println(member);
        Map<String, Object> json = new HashMap<>();
        member = memberService.login(member);
        json.put("member",member);
        json.put("massage","컨트롤러 이동 성공");
        json.put("url","아무대나");
        return json;
    }

    @RequestMapping(value = "/user/home")
    public String Home(){

        return "home";
    }
}
