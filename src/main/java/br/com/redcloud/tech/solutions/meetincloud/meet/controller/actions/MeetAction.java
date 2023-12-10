package br.com.redcloud.tech.solutions.meetincloud.meet.controller.actions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.redcloud.tech.solutions.meetincloud.meet.model.Meet;
import br.com.redcloud.tech.solutions.meetincloud.meet.service.IMeetService;

@Controller
@RequestMapping("/meet/action")
public class MeetAction {
	
	private IMeetService meetService;
	
	@Autowired
	public MeetAction(IMeetService meetService) {
		this.meetService = meetService;
	}
	
	@PostMapping(path="/create")
	public ModelAndView createMeetAction(@ModelAttribute Meet meet) {
		ModelAndView mv;
		System.out.println("meet name: " + meet.getMeetingName());
		System.out.println("meet start date: " + meet.getMeetingStartDate());
		try {
			meetService.createMeet(meet);
		}catch(Exception e) {
			mv = new ModelAndView("/meet/create/index");
			mv.addObject("error", "Ocorreu algum erro durante a inserção da reunião");
			System.out.println("error: " + e.getMessage());
			return mv;
		}
		mv = new ModelAndView("/meet/create/index");
		mv.addObject("success", "Reunião agendada com sucesso!");
		return mv;
	}
}
