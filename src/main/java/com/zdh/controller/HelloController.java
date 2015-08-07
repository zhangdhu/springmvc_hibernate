package com.zdh.controller;

import com.zdh.entity.UserInfoEntity;
import com.zdh.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
    @Autowired
    private UserInfoService userInfoService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "insert";
	}

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public String insertPost(UserInfoEntity userInfoEntity) {
        userInfoService.save(userInfoEntity);
        return "success";
    }
}