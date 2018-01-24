package com.fk.controller;

import com.fk.dao.UserMapper;
import com.fk.model.User;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by fk on 2018/1/24.
 */
@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    protected UserMapper service;

    private static Logger logger = LogManager.getLogger(TestController.class.getName());
    @RequestMapping(value = "test.do")
    public ModelAndView test1(HttpServletRequest request, HttpServletResponse response, ModelMap mode) throws Exception {
        User u =service.selectByPrimaryKey(1);
       // logger.info("asdasd");
        return new ModelAndView("test");
    }
}
