<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>

<form method="post" action ="/infra/code/codeGroupUpdt">
	
	<label>ifcdName</label>
	<input type="text" name="ifcgName" value= <c:out value="${item.ifcgName}"/>><br>
	
	<label>ifcdDelNy</label>
	<input type="text" name="ifcgDelNy" value=<c:out value="${item.ifcgDelNy}"/>>	
		
	<input type="hidden" name="ifcgSeq" value=<c:out value="${item.ifcgSeq}"/>>
	<input type="submit" value="제출">
</form>