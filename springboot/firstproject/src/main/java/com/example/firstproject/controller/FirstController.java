package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    // GetMapping 괄호 안에 url 정보를 넣을 수 있다.
    @GetMapping("/hi")
    // 컨트롤러에 모델 추가
    public String niceToMeetYou(Model model){
        // 모델에서 변수 등록하기
        model.addAttribute("username","홍길동");
        return "greetings";
    }


    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("username","홍길동");
        return "goodbye";
    }
}