<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${name}${age}</h1>
<hr>
<h1>${list[0]}</h1>
<h1>${list[1]}</h1>
<h1>${list[2]}</h1>
<h1>${list[3]}</h1>
<hr>
<h1>${map["아침"]}</h1>
<h1>${map["점심"]}</h1>
<h1>${map["저녁"]}</h1>
<hr>
<h1>${Person.name}${Person.age}</h1>
<hr>
<h1>${PList[0].name}${PList[0].age}</h1>
<h1>${PList[1].name}${PList[1].age}</h1>
<h1>${PList[2].name}${PList[2].age}</h1>
<hr>
<h1>${pMap["친구1"].name}</h1>
<h1>${pMap["친구2"].name}</h1>
<h1>${pMap["친구3"].name}</h1>
<hr>
<c:forEach varStatus="stat" var="item" items="${list}">
	${stat.index} | ${item} | ${stat.count} | ${stat.first} <br>
</c:forEach>
<hr>
<c:forEach varStatus="stat" var="item" items="${PList}">
	${stat.index} | ${item} | ${item.name} | ${item.age}  | ${stat.count} | ${stat.first} <br>
</c:forEach>
<hr>
<c:forEach varStatus="stat" var="item" items="${pMap}">
	${stat.index} | ${item} | ${item.key} => ${item.value.name} ${item.value.age}| ${stat.count} | ${stat.first}<br>
</c:forEach>
<hr>
</body>
</html>