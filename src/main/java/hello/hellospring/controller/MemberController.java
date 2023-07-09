package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    // 생성자에 Autowired Annotations을 쓰면, MemberController가 생성될 때 스프링 빈에 등록돼있는 MemberService 객체를 넣어준다.
    // => Dependency Injection
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }



}
