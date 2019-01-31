package com.yi.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.yi.domain.ProjectContentVO;

@Repository
public class ProjectContentDaoImpl implements ProjectContentDao {
	
	@Autowired
	private SqlSession sqlSession;

	private static final String namespace = "com.yi.mapper.ProjectContent";
	
	@Override
	public void insert(ProjectContentVO content) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".insert",content);
	}

	@Override
	public List<ProjectContentVO> select() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".select");
	}

	@Override
	public int selectLastNo() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".selectLastNo");
	}

	@Override
	public ProjectContentVO selectByNo(ProjectContentVO content) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".selectByNo", content);
	}

	@Override
	public int deleteByNo(ProjectContentVO content) {
		// TODO Auto-generated method stub
		return sqlSession.delete(namespace+".deleteByNo",content);
	}

	@Override
	public int update(ProjectContentVO content) {
		// TODO Auto-generated method stub
		return sqlSession.update(namespace+".update", content);
	}

}
