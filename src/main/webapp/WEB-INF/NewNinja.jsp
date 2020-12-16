<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>







<div class="container">
  <div class="row">
    <div class="col-sm">
    <h1 class="text-center">NEW NINJA</h1>
    	    <form:form action="/create/ninja" method="post" modelAttribute="ninjas">
    
<%--     <select class="form-select" aria-label="Default select example">
		  <option selected>Select Student</option>
		  <c:forEach items="${dojos}" var="dojos">
		  	<option value="${dojos.id}"><c:out value="${dojos.name}"/></option>
		</c:forEach>
	</select>
     --%>
     <div class="input-group mb-3 mt-3">
  		<span class="input-group-text" id="basic-addon1">First Name</span>
  		<input name="firstName" type="text" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1">
	</div>
     <div class="input-group mb-3">
  		<span class="input-group-text" id="basic-addon1">Last Name</span>
  		<input name="lastName" type="text" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1">
	</div>
    <div class="input-group mb-3">
  		<span class="input-group-text" id="basic-addon1">Age</span>
  		<input name="age" type="text" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1">
	</div>
    <button type="submit" class="btn btn-dark">Dark</button>
    
    </form:form>
    </div>
  </div>
</div>







<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>

</body>
</html>