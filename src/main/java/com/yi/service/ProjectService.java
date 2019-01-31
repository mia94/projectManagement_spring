package com.yi.service;

import java.util.List;

import com.yi.domain.ProjectContentVO;
import com.yi.domain.ProjectVO;

public interface ProjectService {
	public void insert(ProjectVO project, ProjectContentVO content);
	public List<ProjectVO> select();
	public int selectLastNo();
	public ProjectVO selectByNo(ProjectVO project);
	public int deleteByNo(ProjectVO project);
	public int update(ProjectVO project, ProjectContentVO content);
	
	public List<ProjectContentVO> selectContent();
	public ProjectContentVO selectContentByNo(ProjectContentVO content);
	
}
