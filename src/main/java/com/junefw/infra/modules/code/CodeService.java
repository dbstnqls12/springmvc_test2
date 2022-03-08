package com.junefw.infra.modules.code;

import java.util.List;

public interface CodeService {
	
	public List<Code> selectList() throws Exception;
	public int insert(Code dto) throws Exception;
	public Code selectOne(CodeVo vo) throws Exception;
	public int update(Code dto) throws Exception; 
	
	public List<Code> selectCodeList() throws Exception;
	public int insertCode(Code dto) throws Exception;
	public Code selectCodeOne(CodeVo vo) throws Exception;	
	public int updateCode(Code dto) throws Exception; 
}