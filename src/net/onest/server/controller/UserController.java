package net.onest.server.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

import net.onest.server.entity.User;
import net.onest.server.service.UserService;

@Controller
@RequestMapping("/login")
public class UserController {
	@Autowired
	private UserService userService; //注入UserService
	
	//登录
	@RequestMapping("/toFormBody")
	public void toLogin(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		User u = new User();
		u.setAccount(account);
		u.setPassword(password);
		User user  = userService.findUserByUserNameAndPassword(u); 
		PrintWriter writer = response.getWriter();
		if(user != null) {
			writer.println(user.getUserName());
			System.out.println("登录用户:账号：" + account + "，用户名："+ user.getUserName() + "，成功");
		}else {
			writer.println("error");
			System.out.println("登录用户失败");
		}
	}
	//注册
	@RequestMapping("/toRegister")
	public void toRegister(HttpServletRequest request, HttpServletResponse response) throws Exception{
		//得到输入流
		InputStream in = request.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in, "utf-8"));
		StringBuffer buffer = new StringBuffer();
		PrintWriter writer = response.getWriter();
		String str = null;
		while(null != (str = reader.readLine())) {
			buffer.append(str);
			System.out.println(buffer);
		}
		String userBean = buffer.toString();
		Gson gson = new Gson();
		User user = gson.fromJson(userBean,User.class);
		//检查是否账号重复
		User u = userService.findUserByAccount(user.getAccount());
		if(u != null) {
			writer.println("error");
			System.out.println("注册用户失败,账号重复");
		}else {
			//保存用户
			int commit = userService.insertUser(user);
			if(commit > 0) {
				writer.println("success");
				System.out.println("注册用户:" + user.getUserName() + "，成功");
			}
		}
	}
}
