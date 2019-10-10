package cn.haina.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public ModelAndView exception(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","出错啦");
        mv.setViewName("error");

        return  mv;
    }
}
