package net.onest.server.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.onest.server.entity.Admin;
import net.onest.server.entity.Cai;
import net.onest.server.entity.User;
import net.onest.server.service.AdminService;
import net.onest.server.service.CaiService;
import net.onest.server.service.UserService;

@Controller
@RequestMapping("admin")
public class AdminController {

	@Autowired
	private CaiService caiService;
	@Autowired
	private UserService userService;
	@Autowired
	private AdminService adminService;
	
	//添加管理员
	@RequestMapping("adminSignIn")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, Model model,
			@RequestParam("adminName") String adminName, @RequestParam("password") String password) {
		ModelAndView mv = new ModelAndView();
		Admin admin = new Admin();
		admin.setAdminName(adminName);
		admin.setPassword(password);
		Admin findAdmin = adminService.findAdminByIdAndPassword(admin);
		if (findAdmin.getId() > 0) {
			mv.setViewName("redirect:userCRUD");
		}
		return mv;
	}
	@RequestMapping("addUser")
	public ModelAndView adduser() {
	
		ModelAndView mv = new ModelAndView("addUser");
		User u = new User();
		mv.addObject("user", u);
		return mv;
	}
	@RequestMapping("addCai")
	public ModelAndView addCai() {
	
		ModelAndView mv = new ModelAndView("addCai");
		Cai c=new Cai();
		mv.addObject("cai", c);
		return mv;
	}
	@RequestMapping("saveUser")
	public ModelAndView saveUser(User u) {
		ModelAndView mv = new ModelAndView();
		userService.insertUser(u);
		mv.setViewName("redirect:userCRUD");
		return mv;
	}
	@RequestMapping("saveCai")
	public ModelAndView saveCai(Cai c) {
		ModelAndView mv = new ModelAndView();
		caiService.insertCai(c);
		mv.setViewName("redirect:userCRUD");
		return mv;
	}
	@RequestMapping("deleteUser")
	public ModelAndView deleteUser(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView();
		User user=new User();
		user.setId(id);
		userService.delete(user);
		mv.setViewName("redirect:userCRUD");
		return mv;
	}
	@RequestMapping("userCRUD")
	public ModelAndView getUsers() {
		ModelAndView mv = new ModelAndView("userCRUD");
		List<User> users = userService.findAllUsers();
		
		mv.addObject("users", users);
		List<Cai> cais=caiService.findAllcai();
		mv.addObject("cais",cais);
		return mv;
	}
}
