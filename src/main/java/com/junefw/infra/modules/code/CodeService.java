package com.junefw.infra.modules.code;

import java.util.List;

public interface CodeService {

//	infrCodeGroup
	public int selectOneCount(CodeVo vo) throws Exception;
	public List<Code> selectList(CodeVo vo) throws Exception;
	public int insert(Code dto) throws Exception;
	public Code selectOne(CodeVo vo) throws Exception;
	public int update(Code dto) throws Exception; 

//	infrCode
	int selectOneCodeCount(CodeVo vo) throws Exception;	
	List<Code> selectListCode(CodeVo vo) throws Exception;
	int insertCode(Code dto) throws Exception;
	Code selectOneCode(CodeVo vo) throws Exception;	
	int updateCode(Code dto) throws Exception; 
}