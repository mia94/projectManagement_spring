package com.yi.persistence;

import java.util.List;

import com.yi.domain.ProjectVO;

public interface ProjectDao {
	public void insert(ProjectVO project); 
	public List<ProjectVO> select();
	public int selectLastNo();
	public ProjectVO selectByNo(ProjectVO project);
	public int deleteByNo(ProjectVO project);
	public int update(ProjectVO project);
}
