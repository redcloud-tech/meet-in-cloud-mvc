package br.com.redcloud.tech.solutions.meetincloud.meet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.redcloud.tech.solutions.meetincloud.meet.model.Meet;

@Controller
@RequestMapping("/meet")
public class MeetController {
	
	@GetMapping(path = "/create")
	public ModelAndView dispatchCreateMeetPage() {
		ModelAndView mv = new ModelAndView("meet/create/index");
		mv.addObject("meet", new Meet());
		return mv;
	}
}
