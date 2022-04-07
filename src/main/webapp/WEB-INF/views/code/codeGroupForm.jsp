<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>

<form method="get" id="form" action ="/infra/code/codeGroupInst" enctype="multipart/form-data">
<!-- <form method="get" id="form" action ="/infra/code/codeGroupInst"> -->
	<input type="hidden" name="thisPage" id="thisPage" value="<c:out value="${vo.thisPage}"/>" >
	<input type="hidden" name="shValue" id="shValue" value="<c:out value="${vo.shValue}"/>" >
	<input type="hidden" name="shOption" id="shOption" value="<c:out value="${vo.shOption}"/>" >
	<input type="hidden" name="shIfcgName" id="shIfcgName" value="<c:out value="${vo.shIfcgName}"/>" >
	<input type="text" name="ifcgName" id="ifcgName" value="<c:out value="${item.ifcgName}"/>" placeholder="코드그룹">
<%-- 	<input type="text" name="ifcdName" id="ifcdName" value="<c:out value="${item.ifcdName}"/>" placeholder="코드"> --%>
	<br><input type="file" name="file" >
	<br><input type="file" name="file1">



	<br><input type="submit" name="btnSubmit" id="btnSubmit" value="제출"><br>
</form>

<a href="codeGroupList?thisPage=<c:out value="${vo.thisPage}"/>&shOption=<c:out value="${vo.shOption}"/>&shValue=<c:out value="${vo.shValue }"/>">목록</a>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="/infra/resources/js/validation.js"></script>

<script type="text/javascript">
	$("#btnSubmit").on("click",function(){
		
 		if(!checkNull($("#ifcgName"), $("#ifcgName").val(), "코드그룹을 입력하세요!")) return false;
/* 		if(!checkNull($("#ifcdName"), $("#ifcdName").val(), "코드를 입력하세요!")) return false; */
		 
		
	});
</script>