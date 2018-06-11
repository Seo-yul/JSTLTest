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
		<c:forEach varStatus="stat" var = "item" items="${bList}">
		<tr>
		<td>${item.boardNum}</td>
		<td>${item.userId}</td>
		<td><a href="board?action=boradRead&boardNum=${item.boardNum}">${item.title}</a></td>  
		<td>${item.hitCount}</td>
		<td>${item.regDate}</td>
		</tr>
		</c:forEach>
		</table>
		
		<form action="board">
		<input type="hidden" value="boardView" name="action">
		<input type="hidden" id="seq" value="" name="seq">
		</form>		
</body>
</html>