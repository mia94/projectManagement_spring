package com.yi.persistence;

import java.util.List;

import com.yi.domain.ProjectContentVO;

public interface ProjectContentDao {
	public void insert(ProjectContentVO content);
	public List<ProjectContentVO> select();
	public int selectLastNo();
	public ProjectContentVO selectByNo(ProjectContentVO content);
	public int deleteByNo(ProjectContentVO content);
	public int update(ProjectContentVO content);
}
