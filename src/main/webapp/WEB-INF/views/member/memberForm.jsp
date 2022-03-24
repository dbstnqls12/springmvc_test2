<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>

<form method="post" action ="/infra/member/memberInst">
	이름 : <input type="text" name="kbmmName" placeholder="이름"><br>
	아이디 : <input type="text" name="kbmmId" placeholder="아이디"><br>
	비밀번호 : <input type="password" name="kbmmPassword" placeholder="비밀번호"><br>
	성별 : <input type="radio" name="kbmmGenderCd" value="1">남
	<input type="radio" name="kbmmGenderCd" value="2">여
	<input type="radio" name="kbmmGenderCd" value="3">기타<br>
<%-- 	전화번호 : <input type="text" name="kbmpNumberFull" placeholder="번호만 입력">--%>
		<div class="col-md-6">
			<label class="form-label">성별</label>
			<select class="form-select form-select-sm" id="kbmmGenderCd" name="kbmmGenderCd">
				<option value="">::성별::</option>
					<c:forEach items="${CodeGender}" var="itemGender" varStatus="statusGender">
				<option value="<c:out value="${itemGender.ifcdSeq}"/>"><c:out value="${itemGender.ifcdName}"/></option>	
					</c:forEach>
			</select>
		</div>	
	<input type="submit" value="제출">
</form>