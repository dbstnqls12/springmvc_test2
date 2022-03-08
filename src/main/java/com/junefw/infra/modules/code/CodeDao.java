package com.junefw.infra.modules.code;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class CodeDao {
	
	@Inject
	@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	
	private static String namespace = "com.junefw.infra.modules.code.CodeMpp";

	public List<Code> selectList(){
		List<Code> list = sqlSession.selectList(namespace + ".selectList","");
		return list;
	}

	public int insert(Code dto) { return sqlSession.insert(namespace+".insert", dto); }

	public Code selectOne(CodeVo vo) { return sqlSession.selectOne(namespace + ".selectOne", vo);}
	
	public int update(Code dto) { return sqlSession.update(namespace+".update", dto); }
	
//	infrCode------------------------------------------------------------------------------------------
	
	public List<Code> selectListCode(){
		List<Code> list = sqlSession.selectList(namespace + ".selectListCode","");							//뭉티기?로 리턴
		return list;
	}
	
	public int insertCode(Code dto) { return sqlSession.insert(namespace+".insertCode", dto); }				//영향을 미친 row값을 넘김
	
	public Code selectOneCode(CodeVo vo) { return sqlSession.selectOne(namespace + ".selectOneCode", vo);}	//객체로 리턴

	public int updateCode(Code dto) { return sqlSession.update(namespace+".updateCode", dto); }				//영향을 미친 row값을 넘김
}