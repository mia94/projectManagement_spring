package com.yi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
}
