<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ include file="header.html" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Repayment Schedule</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script>
  $(document).ready(function(){
    $("#clear").click(function(){
      $("#loanApplicationNo").val("");
    });
  });
  </script>
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container-fluid">

        <ul class="nav navbar-nav">
            <li><a href="#">Product</a></li>
            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Policy Setup <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="#">Page 1-1</a></li>
                    <li><a href="#">Page 1-2</a></li>
                    <li><a href="#">Page 1-3</a></li>
                </ul>
            </li>
            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown">Parameters <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="#">Page 1-1</a></li>
                    <li><a href="#">Page 1-2</a></li>
                    <li><a href="#">Page 1-3</a></li>
                </ul>
            </li>
            <li><a href="#">Application</a></li>
            <li><a href="#">Receipt</a></li>
            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown">Accounting <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="#">Page 1-1</a></li>
                    <li><a href="#">Page 1-2</a></li>
                    <li><a href="#">Page 1-3</a></li>
                </ul>
            </li>
            <li><a href="#">Customer Service</a></li>
            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown">Report <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="#">Page 1-1</a></li>
                    <li><a href="#">Page 1-2</a></li>
                    <li><a href="#">Page 1-3</a></li>
                </ul>
            </li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="#"><span class="glyphicon glyphicon-user"></span>${pageContext.request.userPrincipal.name}</a></li>
            <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
        </ul>
    </div>
</nav>
<br><br>

<div class="container">
  <div class="page-header">
    <h1>Repayment Schedule</h1>
  </div>
  <form action="generatedRepaymentSchedule">
    <div class="col-xs-3">
      <label for="loanApplicationNo">Loan Account #</label>
      <input type="input" class="form-control" id="loanApplicationNo" name="loanApplicationNo">
    </div>
    <br><br><br><br><br>
    <div class="text-right">
       <button type="submit" class="btn btn-primary"">Show Report</button>
       <button type="button" id="clear" class="btn btn-primary">Clear</button>
    </div>

  </form>
</div>

</body>
</html>
