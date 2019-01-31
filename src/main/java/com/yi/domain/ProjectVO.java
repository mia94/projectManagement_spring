package com.yi.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ProjectVO {
	private int project_no;
	private String project_name;
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private Date startdate;
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private Date enddate;
	private String progress;
	
	public ProjectVO() {

	}

	public ProjectVO(int project_no, String project_name, Date startdate, Date enddate, String progress) {
		this.project_no = project_no;
		this.project_name = project_name;
		this.startdate = startdate;
		this.enddate = enddate;
		this.progress = progress;
	}

	public int getProject_no() {
		return project_no;
	}

	public void setProject_no(int project_no) {
		this.project_no = project_no;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	@Override
	public String toString() {
		return "Project [project_no=" + project_no + ", project_name=" + project_name + ", startdate=" + startdate
				+ ", enddate=" + enddate + ", progress=" + progress + "]";
	}
}
