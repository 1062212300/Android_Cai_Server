package net.onest.server.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.onest.server.entity.Cai;
import net.onest.server.service.CaiService;

@Controller
public class CaiController {

	@Autowired
	private CaiService caiService;
	@RequestMapping("searchCaiFromAll")
	public ModelAndView searchCaiFromAll(HttpServletRequest request, HttpServletResponse response, Model model
			, @RequestParam("caiName") String caiName) {
		ModelAndView mv=new ModelAndView("Cai_List");
		Cai cai = new Cai();
		
		cai.setCaiName(caiName);
		List<Cai> cais=caiService.searchCaiFromAll(cai);
		mv.addObject("cais", cais);
		return mv;
		
	}
	
	@RequestMapping("searchCaiById")
	public ModelAndView findCai(String cName) {
		ModelAndView mv = new ModelAndView("Cai_detail");
		Cai c = new Cai();
		c.setCaiName(cName);
		Cai cai = caiService.searchCaiByName(c);
		mv.addObject("cai", cai);
		return mv;
	}

}
