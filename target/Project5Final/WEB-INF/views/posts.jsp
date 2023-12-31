<%@ page language="java" contentType="text/html; charset=UTF-8"
		 isELIgnored="false" pageEncoding="UTF-8" %>
<%@page import="com.example.BoardDAO, com.example.BoardVO,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<br>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>free board</title>
<style>
#list {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}
#list td, #list th {
  border: 1px solid #ddd;
  padding: 8px;
  text-align:center;
}
#list tr:nth-child(even){background-color: #f2f2f2;}
#list tr:hover {background-color: #ddd;}
#list th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: center;
  background-color: #006bb3;
  color: white;
}
</style>
<script>
	function delete_ok(id){
		var a = confirm("정말로 삭제하겠습니까?");
		if(a) location.href='delete/'+id;
	}
</script>
	<script>
		function view_ok(id){
			var a = confirm("자세히 보시겠습니까?");
			if(a) location.href='delete/'+id;
		}
	</script>
</head>
<body>
<h1>도서 목록</h1>
<form method ="post" action= "../login/logout">
	<button type = "submit">logout</button>
</form>

<table id="list" width="90%">
<tr>
	<th>Seq</th>
	<th>Title</th>
	<th>Writer</th>
	<th>Publish</th>
	<th>Year</th>
	<th>Symbol</th>
	<th>Category</th>
	<th>Location</th>
	<th>Loaned</th>
	<th>Regdate</th>
	<th>Edit</th>
	<th>Delete</th>
</tr>
<c:forEach items="${list}" var="u">
	<tr>
		<td>${u.getSeq()}</td>
		<td>${u.getTitle()}</td>
		<td>${u.getWriter()}</td>
		<td>${u.getPublish()}</td>
		<td>${u.getYears()}</td>
		<td>${u.getSymbol()}</td>
		<td>${u.getCategory()}</td>
		<td>${u.getLocation()}</td>
		<td>${u.getLoaned()}</td>
		<td>${u.getRegdate()}</td>
		<td><a href="editform/${u.getSeq()}">Edit</a></td>
		<td><a href="javascript:delete_ok('${u.getSeq()}')">Delete</a></td>
		<td><a href="views/${u.getSeq()}">View</a></td>
	</tr>
</c:forEach>
</table>
<br><a href="add">add new book</a></body></br>
</body>
</html>