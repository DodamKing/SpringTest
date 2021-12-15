package com.spring.springTest;

import java.security.SecureRandom;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.springTest.t1215.Test6VO;

@Controller
@RequestMapping("/1215")
public class T1215Controller {
	@RequestMapping(value="/test1", method = RequestMethod.GET)
	public String test1Get() {
		
		return "1215/test1";
	}
	
	@RequestMapping(value="/test2", method = RequestMethod.GET)
	public String test2Get() {
		
		return "1215/test2";
	}
	
	@RequestMapping("/test3")
	public String test3Get(HttpServletRequest request) {
		request.setAttribute("name", "홍길동");
		request.setAttribute("age", "25");
		request.setAttribute("address", "서울시 강남구 논현동");
		
		return "1215/test3";
	}

	@RequestMapping("/test31")
	public String test31Get(Model model, HttpSession session) {
		model.addAttribute("name", "홍길동");
		model.addAttribute("age", "25");
		session.setAttribute("address", "서울시 강남구 논현동");
		
		return "1215/test3";
	}
	
	@RequestMapping("/test33")
	public String test33Get(HttpServletRequest request) {
		String name = "";
		int age = 0;
		String address ="";
		
		if (request.getParameter("name") != null) {
			name = request.getParameter("name");
		}
		if (request.getParameter("age") != null) {
			age = Integer.parseInt(request.getParameter("age"));
		}
		if (request.getParameter("address") != null) {
			address = request.getParameter("address");
		}
		
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("address", address);
		
		return "1215/test3";
	}
	
	@RequestMapping("/test34")
	public String test34Get(HttpServletRequest request, Model model) {
		String name = "";
		int age = 0;
		String address ="";
		
		if (request.getParameter("name") != null) {
			name = request.getParameter("name");
		}
		if (request.getParameter("age") != null) {
			age = Integer.parseInt(request.getParameter("age"));
		}
		if (request.getParameter("address") != null) {
			address = request.getParameter("address");
		}
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("address", address);
		
		return "1215/test3";
	}
	
	@RequestMapping("/test35")
	public String test35Get(Model model, String name, String age, String address) {
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("address", address);
		
		return "1215/test3";
	}
	
	@RequestMapping("/test4/{name}/{mid}/{pwd}")
	public String test4Get(Model model, @PathVariable String name, @PathVariable String mid, @PathVariable String pwd) {
		
		model.addAttribute("name", name);
		model.addAttribute("mid", mid);
		model.addAttribute("pwd", pwd);
		
		return "1215/test4";
	}
	
	@RequestMapping("/test42/{name}/{mid}/{pwd}")
	public String test42Get(Model model, @PathVariable String name, @PathVariable String mid, @PathVariable String pwd) {
		if (mid.equals("admin") && pwd.equals("1234")) {
			return "1215/test4Admin";
		}
		
		model.addAttribute("name", name);
		model.addAttribute("mid", mid);
		model.addAttribute("pwd", pwd);
		
		return "1215/test4";
	}
	
	@RequestMapping("/test44/{name}/{mid}/{pwd}")
	public String test44Get(Model model, @PathVariable String name, @PathVariable String mid, @PathVariable String pwd) {
		SecureRandom random = new SecureRandom();
		random.setSeed(new Date().getTime());
		int ranNo = random.nextInt(100) + 1;
		System.out.println(ranNo);
		ranNo = 5;
		
		if (pwd.equals(Integer.toString(ranNo))) {
			return "1215/test4Admin";
		}
		
		model.addAttribute("name", name);
		model.addAttribute("mid", mid);
		model.addAttribute("pwd", pwd);
		return "1215/test4";
	}
	
	@RequestMapping("/test5")
	public String test5Get() {
		
		return "1215/test5";
	}
	
	@RequestMapping("/test51")
	public String test51Get() {
		
		return "1215/test51";
	}
	
	@RequestMapping("/test6")
	public String test52Get() {
		
		return "1215/test6";
	}

	@RequestMapping("/test5Ok")
	public String test5OkGet(Model model, String mid, String pwd) {
		model.addAttribute("mid", mid);
		model.addAttribute("pwd", pwd);
		return "1215/test5Ok";
	}
	
	@RequestMapping("/test51Ok")
	public String test51OkGet(Model model, @RequestParam("mid") String mid1, @RequestParam("pwd") String pwd1) {
		model.addAttribute("mid", mid1);
		model.addAttribute("pwd", pwd1);
		return "1215/test51Ok";
	}
	
	@RequestMapping("/test6Ok")
	public String test6OkGet(Model model, Test6VO vo) {
		model.addAttribute("vo", vo);
		
		vo.setMid_("mmid");
		
		return "1215/test6Ok";
	}
	
	@RequestMapping("/test7")
	public String test7Get() {
		
		return "1215/test7";
	}

	@RequestMapping("/test7Ok")
	public ModelAndView test7OkPost(ModelAndView andView, Test6VO vo) {
		andView.addObject("vo", vo);
		andView.setViewName("1215/test7Ok");
		return andView;
	}
	
	@RequestMapping("/test8")
	public String test8Get() {
		
		return "1215/test8";
	}
	
	@RequestMapping("/test8Ok")
	public String test8OkPost(Model model, Test6VO vo) {
		model.addAttribute("vo", vo);
		return "1215/test8Ok";
	}
	
	@RequestMapping(value={"/test9"}, method = RequestMethod.GET)
	public ModelAndView test9Get(ModelAndView andView, Test6VO vo) {
		andView.addObject("vo", vo);
		andView.setViewName("1215/test9");
		return andView;
	}
	
	@RequestMapping(value={"/test9"}, method = RequestMethod.POST)
	public String test9OkPost(Model model, Test6VO vo) {
		model.addAttribute("vo", vo);
		return "1215/test9Ok";
	}
	
	@RequestMapping(value={"/redirect"}, method = RequestMethod.GET)
	public String redirect9Get(Model model, String mid, String pwd, String message) {
		model.addAttribute("message", message);
		model.addAttribute("mid", mid);
		model.addAttribute("pwd", pwd);
		return "1215/redirect";
	}
	
	@RequestMapping(value={"/redirect"}, method = RequestMethod.POST)
	public String testredirectPost(Model model, String mid, @RequestParam(name="pwd", defaultValue = "1234", required = false) int pwd) {
		if (mid.equals("admin") && pwd == 1234) {
			model.addAttribute("mid", mid);
			model.addAttribute("pwd", pwd);
			model.addAttribute("message", "성공!!");
			return "1215/redirectOk";
		}
		else {
			model.addAttribute("message", "오류!!");
			model.addAttribute("mid", mid);
			model.addAttribute("pwd", pwd);
			return "redirect:/1215/redirect";
		}
	}
	
	@RequestMapping("resources")
	public String resourcesGet() {
		
		return "resourceTest/resources";
	}
}
