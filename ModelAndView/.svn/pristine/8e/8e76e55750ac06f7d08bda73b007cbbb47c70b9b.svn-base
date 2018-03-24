package com.oaec.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.oaec.entity.User;
import com.oaec.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@Resource
	private HttpSession session;
	
	@RequestMapping("")
	
	public ModelAndView login(){
		
		 System.out.println("MAVTest.java login()....");
		 ModelAndView mav = new ModelAndView();
		 List<String> list = new ArrayList<String>();
		 list.add("java");
		 list.add("c++");
		 list.add("oracle");
		 mav.addObject("bookList", list);
		 
		 Map<String, String> map = new HashMap<String, String>();
		 map.put("zhangsan", "北京");
		 map.put("lisi", "上海");
		 map.put("wangwu", "深圳");
		 mav.addObject("map", map);
		 mav.setViewName("success");//相应的view
		 return mav;
	}
	@RequestMapping("/login")
	public String login(String username, String password,Model model){
		System.out.println(username+password);
		User user = userService.getUser(username, password);
		
		if(user != null){
			session.setAttribute("user", user);
			return "user";
		}
		
		model.addAttribute("tips","用户名或密码错误");
		
		return "login";
	}
}
