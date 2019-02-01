package com.yi.projectManagement;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yi.domain.ProjectContentVO;
import com.yi.domain.ProjectVO;
import com.yi.persistence.ProjectContentDao;
import com.yi.persistence.ProjectDao;
import com.yi.service.ProjectService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProjectTest {
	
	@Autowired
	private ProjectDao pDao;
	@Autowired
	private ProjectContentDao cDao;
	
	
	@Autowired
	private ProjectService service;
	
	@Test
	public void test01insert() {

		ProjectVO project = new ProjectVO();
		project.setProject_name("테스트용 제목");
		project.setStartdate(new Date());
		project.setStartdate(new Date());
		project.setEnddate(new Date());
		project.setProgress("준비");
		
		ProjectContentVO content = new ProjectContentVO();
		content.setContent("테스트용 내용");	
		service.insert(project, content);

	}
	
	@Test
	public void test02select() {
		List<ProjectVO> plist = service.select();
		List<ProjectContentVO> clist = service.selectContent();
		Assert.assertNotNull(plist);
		Assert.assertNotNull(clist);
	}
	
	@Test
	public void test03selectByNo() {
		ProjectVO vo = new ProjectVO();
		vo.setProject_no(11);
		vo = service.selectByNo(vo);
		System.out.println(vo);
		Assert.assertNotNull(vo);
	}
	
	@Test
	public void test04update() {
		ProjectVO vo = new ProjectVO();
		vo.setProject_no(11);
		vo = service.selectByNo(vo);
		vo.setProject_name("수정이름");
		
		ProjectContentVO cVO = new ProjectContentVO();
		cVO.setProject_no(vo.getProject_no());
		cVO = cDao.selectByNo(cVO);
		cVO.setContent("수정내용");
		
		int res = service.update(vo, cVO);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test05delete() {
		ProjectVO vo = new ProjectVO();
		vo.setProject_no(11);
		
		int res = service.deleteByNo(vo);
		Assert.assertEquals(1, res);
	}
}
















