<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>

<c:choose>
	<c:when test="${fn:length(list) eq 0}">
		<tr>
			<td class="text-center" colspan="9">There is no data!</td>
		</tr>	
	</c:when>
	<c:otherwise>
		<c:forEach items="${list}" var="item" varStatus="status">	
		
		<c:out value="${item.kbmmSeq}"/> | <a href="/infra/member/memberView?kbmmSeq=${item.kbmmSeq}"><c:out value="${item.kbmmName}"/></a> |<c:out value="${item.kbmmId}"/> | <c:out value="${item.kbmmPassword}"/> | <c:out value="${item.kbmmAdminNy}"/> | <c:out value="${item.ifcdName}"/> | <c:out value="${item.kbmpNumberFull}"/>  <br>
		
		</c:forEach>
		<a href="memberForm">등록</a>
	</c:otherwise>
</c:choose>	