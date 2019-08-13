package net.onest.server.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

import net.onest.server.entity.Homeitem;
import net.onest.server.service.HomeitemService;

@Controller
@RequestMapping("/listView")
public class HomeitemController {

	@Autowired
	private HomeitemService homeitemService;
	
	@RequestMapping("/selectHomeitem")
	public void selectHomeitem(HttpServletRequest request, HttpServletResponse response) throws Exception{
		//得到输入流
		InputStream in = request.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in, "utf-8"));
		StringBuffer buffer = new StringBuffer();
		String str = null;
		while(null != (str = reader.readLine())) {
			buffer.append(str);
			System.out.println(buffer);
		}
		
		PrintWriter writer = response.getWriter();
		List<Homeitem> list = homeitemService.findAllHomeite();
		Gson gson = new Gson();
		if(list != null) {
			String jsonList = gson.toJson(list);
			System.out.println(jsonList);
			writer.println(jsonList);
		}
	}
	
	@RequestMapping("/search")
	public void search(HttpServletRequest request, HttpServletResponse response) throws IOException {
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
		
		Homeitem homeitem  = homeitemService.findAllHomeiteBySearch(buffer.toString());
		Gson gson = new Gson();
		if(homeitem != null) {
			String jsonList = gson.toJson(homeitem);
			writer.println(jsonList);
			
			System.out.println(jsonList);
		}
		
	}
}
