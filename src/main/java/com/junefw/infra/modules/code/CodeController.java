package com.junefw.infra.modules.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {
	


	@Autowired
	CodeServiceImpl service;

//	infrCodeGroup
	
	@RequestMapping(value = "/code/codeGroupList")
	public String codeGroupList(@ModelAttribute("vo") CodeVo vo, Model model) throws Exception {
		//count가져올 것
		int count = service.selectOneCount(vo);
		
		vo.setParamsPaging(count);
		
		//count가 0이 아니면 list가져오는 부분 수행 후 model 개체에 담기
		if(count!=0) {
			List<Code> list = service.selectList(vo);
			model.addAttribute("list", list);
		}else {
			//by pass
		}
		
		return "code/codeGroupList";
	}
	
	@RequestMapping(value = "/code/codeGroupForm")
	public String codeGroupForm(@ModelAttribute("vo") CodeVo vo) throws Exception {
		
		return "code/codeGroupForm";
	}

	@RequestMapping(value = "/code/codeGroupInst")
	public String codeGroupInst(CodeVo vo, Code dto) throws Exception {

		service.insert(dto);
		
		System.out.println(dto.getIfcgSeq());
		
		return "redirect:/code/codeGroupView?ifcgSeq="+dto.getIfcgSeq()+"&thisPage="+vo.getThisPage()+"&shOption="+vo.getShOption()+"&shValue="+vo.getShValue();
	}
	
	@RequestMapping(value = "/code/codeGroupView")
	public String codeGroupView(@ModelAttribute("vo") CodeVo vo, Model model) throws Exception {
		
		System.out.println(vo.getShOption());		
		System.out.println(vo.getShValue());		
		System.out.println(vo.getThisPage());		

		//디비까지 가서 한 건의 데이터 값을 가지고 온다,VO
		Code rt = service.selectOne(vo);
		
		//가지고 온 값을 jsp로 넘겨준다
		model.addAttribute("item", rt);
		
		return "code/codeGroupView";
	}
	
	@RequestMapping(value = "/code/codeGroupForm2")
	public String codeGroupForm2(@ModelAttribute("vo") CodeVo vo, Model model) throws Exception {
		
		Code rt = service.selectOne(vo);
		
		model.addAttribute("rt", rt);
		
		return "code/codeGroupForm2";
	}
	@RequestMapping(value = "/code/codeGroupUpdt")
	public String codeGroupUpdt(CodeVo vo, Code dto) throws Exception {
		
		service.update(dto);
		return "redirect:/code/codeGroupView?ifcgSeq="+dto.getIfcgSeq()+"&thisPage="+vo.getThisPage()+"&shOption="+vo.getShOption()+"&shValue="+vo.getShValue();
	}
	
//	infrCode---------------------------------------------------------------
	
	@RequestMapping(value = "/code/codeList")
	public String codeList(@ModelAttribute("vo") CodeVo vo, Model model) throws Exception {
			
		int count = service.selectOneCountCode(vo);
	
		vo.setParamsPaging(count);
		
		if(count!=0) {
			
			List<Code> list = service.selectListCode(vo);
			model.addAttribute("list", list);
			
			List<Code> listCodeGroup = service.selectListCodeGroup(vo);
			model.addAttribute("listCodeGroup", listCodeGroup);			 
		}else {
			//by pass
		}

		return "code/codeList";
	}


	@RequestMapping(value = "/code/codeForm")
	public String codeForm(CodeVo vo, Model model) throws Exception {
		
		List<Code> list = service.selectListCode(vo);
		model.addAttribute("list", list);
		
		List<Code> listCodeGroup = service.selectListCodeGroup(vo);
		model.addAttribute("listCodeGroup", listCodeGroup);
		
		return "code/codeForm";
	}

	@RequestMapping(value = "/code/codeInst")
	public String codeInst(Code dto) throws Exception {

		service.insertCode(dto);
		return "redirect:/code/codeList";
	}

	@RequestMapping(value = "/code/codeView")
	public String codeView(CodeVo vo, Model model) throws Exception {
		
		Code rt = service.selectOneCode(vo);
		
		model.addAttribute("item", rt);
		
		return "code/codeView";
	}
	
	@RequestMapping(value = "/code/codeEditForm")
	public String codeEditForm(CodeVo vo, Model model) throws Exception {
		
		Code rt = service.selectOneCode(vo);
		
		model.addAttribute("rt", rt);
		
		return "code/codeEditForm";
	}
	@RequestMapping(value = "/code/codeUpdt")
	public String codeUpdt(Code dto) throws Exception {
		
		service.updateCode(dto);
		return "redirect:/code/codeView?ifcdSeq="+dto.getIfcdSeq();
	}
	
	
}
