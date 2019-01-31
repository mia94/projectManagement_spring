package com.yi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yi.domain.ProjectContentVO;
import com.yi.domain.ProjectVO;
import com.yi.service.ProjectService;

@Controller
@RequestMapping("/project/*")//BoardController 안에 모든 url커맨드앞에 자동으로 board/가 붙는다.
public class ProjectController {
	
	@Autowired
	private ProjectService service;
	
	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);
	
	@RequestMapping(value="list", method=RequestMethod.GET)
	public void list(Model model) {
		logger.info("list ------------ GET");
		List<ProjectVO> list = service.select();
		model.addAttribute("list", list);
	}
	
	@RequestMapping(value="register", method=RequestMethod.GET)
	public void registerGet() {
		logger.info("register -------------- GET");
	}
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String registerPost(ProjectVO pVO, ProjectContentVO cVO) {
		logger.info("register -------------- POST");
		
		service.insert(pVO, cVO);
		return "redirect:/project/list";
	}
	
	
	@RequestMapping(value="modify")
	public void modify() {
		logger.info("modify -------------- GET");
	}
	
	@RequestMapping(value="read", method=RequestMethod.GET)
	public void read(@RequestParam("project_no") int project_no, Model model) {
		logger.info("read -------------- GET");
		ProjectVO vo = new ProjectVO();
		vo.setProject_no(project_no);
		vo = service.selectByNo(vo);
		
		ProjectContentVO pVO = new ProjectContentVO();
		pVO.setProject_no(project_no);
		pVO = service.selectContentByNo(pVO);
		model.addAttribute("vo", vo);
		model.addAttribute("pVO", pVO);
	}
}























