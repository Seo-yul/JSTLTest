<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/borad.css?v=1" rel="stylesheet" type="text/css">
<title>글쓰기</title>
<script type="text/javascript">
function formSubmit() {
	document.form1.submit();
	
}
</script>

</head>
<body>
<div  align="center">
<form name = "form1" action="board" method="post">
<input type="hidden" name = "action" value = "boradInput">
<table class ="tb">
<tr><td>글제목 : </td><td><input type = "text" name="title"></td></tr>
<tr><td>내용 : </td><td><textarea class=txtare name="content" rows="10" cols="10" style="resize: none;"></textarea></td></tr>
</table>
</form>
<input type = "button" value="글등록" onclick="formSubmit()">
</div>

</body>
</html>