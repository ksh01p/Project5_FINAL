<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<h1>Add New Post</h1>
<form action="addok" method="post">
    <table id="edit">
        <tr><td>title:</td><td><input type="text" name="title"/></td></tr>
        <tr><td>writer:</td><td><input type="text" name="writer"/></td></tr>
        <tr><td>publish:</td><td><input type="text" name="publish"/></td></tr>
        <tr><td>years:</td><td><input type="text" name="years"/></td></tr>
        <tr><td>symbol:</td><td><input type="text" name="symbol"/></td></tr>
        <tr><td>category:</td><td><input type="text" name="category"/></td></tr>
        <tr><td>location:</td><td><input type="text" name="location"/></td></tr>
        <tr><td>loaned:</td><td><input type="text" name="loaned"/></td></tr>
    </table>
        <button type="submit">등록하기</button>


 </form>
<button type="button" onclick="location.href='list'">도서 목록 보기</button>
</body>
</html>