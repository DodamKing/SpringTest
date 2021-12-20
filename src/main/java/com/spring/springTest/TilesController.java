package com.spring.springTest;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/tiles")
public class TilesController {
	@RequestMapping("/tilesMain")
	public String tilesMainGet() {
		
		return "main/tilesMain";
	}
	
	@RequestMapping("/login")
	public String loginGet() {
		
		return "member/login";
	}
	
	@RequestMapping("/guest/guestList")
	public String guestListGet(Model model) {
		System.out.println("방명록 컨트롤러 수행중!!");
		return "guest/guestList";
	}
	
	@RequestMapping("board/boardList")
	public String boardListGet(Model model) {
		
		return "board/boardList";
	}
	
	@RequestMapping("/pds/pdsList")
	public String pdsListGet(Model model) {
		
		return "pds/pdsList";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String tilesMainPost(Model model, HttpSession session, String mid, String pwd, String nick, int level) {
		
		if (pwd.equals("1234")) {
			session.setAttribute("sMid", mid);
			session.setAttribute("sNick", nick);
			session.setAttribute("sLevel", level);
			return "main/tilesMain";
		}
		
		return "member/login";
	}
	
	@RequestMapping("/logout")
	public String logoutGet(HttpSession session) {
		session.invalidate();
		
		return "login";
	}
	
}
