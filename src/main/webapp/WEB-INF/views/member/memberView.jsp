<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>


<c:out value="${item.kbmmSeq}"/> | <c:out value="${item.kbmmName}"/> | <c:out value="${item.kbmmId}"/> | <c:out value="${item.kbmmPassword}"/> | <c:out value="${item.kbmmAdminNy}"/> <br>


<a href="memberEditForm?kbmmSeq=${item.kbmmSeq}">수정</a>