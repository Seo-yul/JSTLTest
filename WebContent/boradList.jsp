<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function viewFunc(seq) {
	document.getElementById("seq").value=seq;
	document.form1.submit();
}
</script>


</head>
<body>
		<a href="board?action=boradWrite"><h1>글쓰기</h1></a>
		<br>
		<c:if test = "${bList==null}">
		<h1>게시글이 없습니다.</h1>
		</c:if>
		<table>
		<tr>
		<td>글번호</td>
		<td>아이디</td>
		<td>제목1</td>  
		<td>제목2</td>  
		<td>조회수</td>
		<td>작성일</td>
		</tr>
		<c:forEach varStatus="stat" var = "item" items="${bList}">
		<tr>
		
		<td><c:out value="${item.boardNum}"></c:out></td>
		<td><c:out value="${item.userId}"></c:out></td>
		<td><a href="board?action=boradRead&boardNum=${item.boardNum}"><c:out value="${item.title}"></c:out></a></td>  
		<td onclick="viewFunc('${item.boardNum}')"><c:out value="${item.title}"></c:out></td>  
		<td><c:out value="${item.hitCount}"></c:out></td>
		<td><c:out value="${item.regDate}"></c:out></td>
		</tr>
		</c:forEach>
		</table>
		<c:out value="${count}"></c:out>  
		<form action="board" name="form1">
		<input type="hidden" value="boradRead" name="action">
		<input type="hidden" id="seq" value="" name="boardNum">
		</form>		
</body>
</html>