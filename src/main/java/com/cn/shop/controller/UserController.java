package com.cn.shop.controller;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.shop.service.UserService;
import com.cn.shop.util.ThreadTest1;
import com.cn.shop.util.ThreadTest2;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userservice;
	
	public static ExecutorService exc = Executors.newFixedThreadPool(2);
	
	@Test
	@RequestMapping("/getUser")
	public ModelAndView getUser(HttpServletRequest req){
		System.out.println("33332233");
	//	exc.execute(new ThreadTest1());
	//	exc.execute(new ThreadTest2());
		String username =req.getParameter("name");
		ModelAndView mv = new ModelAndView();
		List<Map<String,Object>> list = userservice.getUser(username);
		mv.addObject("list", list);
		mv.setViewName("ok");
		return mv;
		
		
		
	}

}
