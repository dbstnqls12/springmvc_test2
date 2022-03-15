<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

codelist
<form id="" name="" method="get" action="/infra/code/codeList">
<select name="shIfcgSeq">
	<option value="">::코드그룹::</option>
		<c:forEach items="${listCodeGroup}" var="item" varStatus="status">	
	<option value="<c:out value="${item.ifcgSeq}"/>"<c:if test="${param.shIfcgSeq eq item.ifcgSeq}">selected</c:if>> <c:out value="${item.ifcgName}"></c:out></option>
		</c:forEach>	
</select>
<input type="submit" name="search">
<br>

<c:choose>
	<c:when test="${fn:length(list) eq 0}">
		<tr>
			<td class="text-center" colspan="9">There is no data!</td>
		</tr>	
	</c:when>
	<c:otherwise>
		<c:forEach items="${list}" var="item" varStatus="status">	
		
	 	<c:out value="${item.ifcdSeq}"/> | <c:out value="${item.ifcgSeq}"/> | <c:out value="${item.ifcdOrder}"/> | <a href="/infra/code/codeView?ifcdSeq=${item.ifcdSeq}"><c:out value="${item.ifcdName}"/></a> | <c:out value="${item.ifcdDelNy}"/>  <br>
		 
		
		
		</c:forEach>
	</c:otherwise>
</c:choose>	
</form>
<nav aria-label="...">
  <ul class="pagination">
    <li class="page-item disabled">
      <a class="page-link">Previous</a>
    </li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item active" aria-current="page">
      <a class="page-link" href="#">2</a>
    </li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item">
      <a class="page-link" href="#">Next</a>
    </li>
  </ul>
</nav>