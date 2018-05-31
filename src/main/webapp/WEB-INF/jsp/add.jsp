<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MyWebSErvices</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class = "container">
	<h3>This is add.jsp</h3>
  <table class="table table-dark">
      <thead>
        <tr>
            <td>UserID</td>
            <td>ID</td>
            <td>Title</td>
            <td>Body</td>
        </tr>
      </thead>
      <tbody >
      
            <tr>
            
            
                <tr>
                <td>${userId}</td>
                <td>${id}</td>
                <td>${title}</td>
                <td>${body}</td>
            </tr>
              
            </tr>
     
      </tbody>
  </table>
</div>
</body>
</html>