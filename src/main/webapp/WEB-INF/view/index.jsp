<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Eligibility Policy</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css" />" >

</head>
<body>
  <div class="container border border-dark mt-3 p-1 ">
    <div class="row text-center">
        <div class="col">
            <h1>Login As:</h1>
        </div>
    </div>
    <div class="row text-center">
        <div class="col">
            <a href="list?role=maker"><h2>Maker</h2></a>
        </div>
        <div class="col">
            <a href="parameters?role=checker"><h2>Checker</h2></a>
        </div>
    </div>
  </div>

</body>
</html>