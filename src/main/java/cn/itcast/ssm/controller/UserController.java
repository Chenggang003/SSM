package cn.itcast.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.ssm.po.User;
import cn.itcast.ssm.service.UserService;

@Controller
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/showAllUser")
	@ResponseBody
	public String getAllUser(Model model){
		List<User> list = userService.getAllUser();
		model.addAttribute("list",list);
		return "index";
	}
}
