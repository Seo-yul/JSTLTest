<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="" type="text/javascript"></script>
<link href="css/index.css?v=1" rel="stylesheet" type="text/css">
<title>회원가입</title>
</head>
<body>

<div class = "container" align="center">
<h1>회원가입</h1>
<form action="member" method="post">
<input type="hidden" name = "action" value = "join">
<table>
<tr>
<th>아이디 : </th>
<td><input class="input-nomal" type = "text" name = "userid" ></td>
<td class="wsize"><input class="wsize" type="button" class ="checkidbtn" value="ID중복확인" ></td>
</tr>
<tr>
<th>비밀번호 : </th>	
<td colspan="2"><input class="input-nomal" type = "password" name = "userpwd"></td>
</tr>
<tr>
<th>이름 : </th>
<td colspan="2"><input class="input-nomal" type = "text" name = "username"></td>
</tr>
<tr>
<th>성별 : </th>
<td colspan="2"><input type = "radio" class="input-nomal"  value="male" name = "gender" checked>남<input type = "radio" value="female" name = "gender">여<br></td>
</tr>
<tr>
<th>취미 : </th>
<td colspan="2"><input type="checkbox" name="hobby" value="독서">독서
				<input type="checkbox" name="hobby" value="낚시">낚시
				<input type="checkbox" name="hobby" value="잠자기">잠자기
				<input type="checkbox" name="hobby" value="TV시청">TV시청</td>
</tr><tr><th>생일 : </th>
<td colspan="2"><input type = "date" class="input-nomal"  name = "birth"></td>
</tr><tr><th>나이 : </th>
<td colspan="2"><input type = "number" class="input-nomal" name = "age"></td>
</tr><tr><th>전화번호 : </th>
<td class="wsize"><select name = "phone1">
				<option value="010">010</option>
  				<option value="011">011</option>
  				<option value="017">017</option>
  				<option value="018">018</option>
  				<option value="019">019</option>
  				</select></td><td>
				<input type = "text" class="input-nomal" name = "phone2" placeholder="-없이 숫자"></td>
</tr><tr><th>주소 : </th>
<td class="wsize"><select name = "addr1" >
				<option value="강남구">강남구</option>
  				<option value="동작구">동작구</option>
  				<option value="송파구">송파구</option>
  				<option value="관악구">관악구</option>
  				<option value="강동구">강동구</option>
  				</select></td>
			<td>	<input class="input-nomal"  name = "addr2"></td>
</tr><tr><th>자기소개 : </th>
<td colspan="2"><textarea rows="8" cols="80" name = "introduce" style = "resize:none;" ></textarea></td>
</tr><tr><td colspan="3">	<input type = "submit" value="회원가입"><input type = "reset" value="지우기"></td></tr>
</table>

	</form>
	</div>
</body>
</html>