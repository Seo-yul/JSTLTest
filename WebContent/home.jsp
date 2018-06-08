<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인성공</title>
</head>
<body>
<h1>로그인 성공!</h1>
${userName}님 환영합니다.
<a href="/JSTLTest/board?action=boardList"><h1>게시판가기</h1></a>

<h2><c:out value="정보"/></h2>
<c:out value="아이디: ${userId}"/><br>
<c:out value="비밀번호: ${userPw}"/><br>
<c:out value="성별 : ${gender}"/><br>
<c:out value="취미 : ${hobby}"/><br>
<c:out value="생일 : ${birth}"/><br>
<c:out value="나이 : ${age}"/><br>
<c:out value="주소 : ${address}"/><br>
<c:out value="전화번호 : ${phone}"/><br>
<c:out value="소개 : ${introduce}"/><br>
</body>
</html>