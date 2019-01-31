package com.yi.domain;

public class ProjectContentVO {
	private int project_no;
	private String content;
	
	public ProjectContentVO() {

	}

	public ProjectContentVO(int project_no, String content) {
		this.project_no = project_no;
		this.content = content;
	}


	public int getProject_no() {
		return project_no;
	}

	public void setProject_no(int project_no) {
		this.project_no = project_no;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "ProjectContent [project_no=" + project_no + ", content=" + content + "]";
	}
}
