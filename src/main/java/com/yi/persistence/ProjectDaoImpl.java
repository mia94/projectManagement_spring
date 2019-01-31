package com.yi.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yi.domain.ProjectVO;

@Repository
public class ProjectDaoImpl implements ProjectDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "com.yi.mapper.Project";
	
	@Override
	public void insert(ProjectVO project) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".insert", project);
	}

	@Override
	public List<ProjectVO> select() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".select");
	}

	@Override
	public int selectLastNo() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".selectLastNo");
	}

	@Override
	public ProjectVO selectByNo(ProjectVO project) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".selectByNo", project);
	}

	@Override
	public int deleteByNo(ProjectVO project) {
		// TODO Auto-generated method stub
		return sqlSession.delete(namespace+".deleteByNo", project);
	}

	@Override
	public int update(ProjectVO project) {
		// TODO Auto-generated method stub
		return sqlSession.update(namespace+".update", project);
	}

}
