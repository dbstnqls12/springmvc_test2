package com.junefw.infra.modules.member;

import java.util.List;

import com.junefw.infra.modules.code.Code;
import com.junefw.infra.modules.code.CodeVo;

public interface MemberService {
	
	public List<Member> selectList() throws Exception; 
	public int insert(Member dto) throws Exception;  
	public Member selectOne(MemberVo vo) throws Exception;
	public int update(Member dto) throws Exception;  

}