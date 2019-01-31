package com.yi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yi.domain.ProjectContentVO;
import com.yi.domain.ProjectVO;
import com.yi.persistence.ProjectContentDao;
import com.yi.persistence.ProjectDao;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectDao pDao;
	@Autowired
	private ProjectContentDao cDao;
	
	
	@Override
	public void insert(ProjectVO project, ProjectContentVO content) {
		pDao.insert(project);
		System.out.println("----------------------" +project);
		content.setProject_no(project.getProject_no());
		cDao.insert(content);
	}
	
	@Override
	public List<ProjectVO> select() {
		return pDao.select();
	}
	
	@Override
	public int selectLastNo() {
		return cDao.selectLastNo();
	}
	
	@Override
	public ProjectVO selectByNo(ProjectVO project) {
		return pDao.selectByNo(project);
	}
	@Override
	public List<ProjectContentVO> selectContent() {
		return cDao.select();
	}
	@Override
	public ProjectContentVO selectContentByNo(ProjectContentVO content) {
		return cDao.selectByNo(content);
	}

	@Override
	public int deleteByNo(ProjectVO project) {
		
		ProjectContentVO content = new ProjectContentVO();
		content.setProject_no(project.getProject_no());
		cDao.deleteByNo(content);
		return pDao.deleteByNo(project);
	}

	@Override
	public int update(ProjectVO project,ProjectContentVO content) {
		// TODO Auto-generated method stub
		cDao.update(content);
		return pDao.update(project);
	}

	
	
	
}
