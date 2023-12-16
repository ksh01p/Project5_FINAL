<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8"%>
<%@page import="com.example.BoardVO"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>View Form</title>
</head>
<body>
<c:set var="id" value="${param.id}"/>
<c:set var="u" value="${boardDAO.getBoard(id)}"/>
<h1>세부 보기</h1>
<form>
  <table>
    <tr><td>Seq:</td><td>${u.seq}</td></tr>
    <tr><td>Title:</td><td>${u.title}</td></tr>
    <tr><td>Writer:</td><td>${u.writer}</td></tr>
    <tr><td>Publish:</td><td>${u.publish}</td></tr>
    <tr><td>Years:</td><td>${u.years}</td></tr>
    <tr><td>Symbol:</td><td>${u.symbol}</td></tr>
    <tr><td>Category:</td><td>${u.category}</td></tr>
    <tr><td>Location:</td><td>${u.location}</td></tr>
    <tr><td>Loaned:</td><td>${u.loaned}</td></tr>
    <tr><td>Regdate:</td><td>${u.regdate}</td></tr>
    <tr><td colspan="2">
      <a href="<c:url value='/board/list'/>">Back to List</a>
    </td></tr>
  </table>
</form>
</body>
</html>
