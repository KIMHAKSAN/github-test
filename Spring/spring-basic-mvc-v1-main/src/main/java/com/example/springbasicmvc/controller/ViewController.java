package com.example.springbasicmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// Spring Bean 이름을 URL로 설정
@Component("/view-controller")
public class ViewController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        System.out.println("view-controller가 호출 되었습니다.");

        // "test"는 논리적인 ViewName이다. ViewResolver가 물리적인 이름으로 변환해야 한다.
        return new ModelAndView("test");
    }
}
