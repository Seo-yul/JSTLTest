<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>읽기</title>
</head>
<body>
<c:out value="글번호 : ${BoardRead.boardNum}"></c:out><br>
<c:out value="글쓴이 : ${BoardRead.userId}"></c:out><br>
<c:out value="글제목 : ${BoardRead.title}"></c:out><br>
<c:out value="내용 : ${BoardRead.content}"></c:out><br>
<c:out value="조회수 : ${BoardRead.hitCount}"></c:out><br>
<c:out value="작성일 : ${BoardRead.regDate}"></c:out><br>

<!--
${t} //escapeXml은 기본값 false이다.
<c:set var="t" value="<script type='text/javascript'>alert(1);</script>" />
<c:out value="${t}"/>
<c:out value="${t}" escapeXml="true" />	
<c:out value="${t}" escapeXml="false" />
  -->
</body>
</html>