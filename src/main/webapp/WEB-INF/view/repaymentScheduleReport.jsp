<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ include file="header.html" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Repayment Schedule</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
  <script src="https://cdn.datatables.net/1.10.4/js/jquery.dataTables.min.js"></script>
  <script src="https://cdn.datatables.net/plug-ins/9dcbecd42ad/integration/jqueryui/dataTables.jqueryui.js"></script>
  <link rel="stylesheet" href="https://cdn.datatables.net/plug-ins/9dcbecd42ad/integration/jqueryui/dataTables.jqueryui.css">
</head>
<body>
  <div class="page-header">
    <h1>Repayment Schedule</h1>
  </div>
   <c:if test = "${repaymentSchedule.isEmpty()}">
             <p>No records found!!<p>
  </c:if>
  <c:if test = "${!repaymentSchedule.isEmpty()}">
  <table id="myTable" class="table table-responsive table-striped table-bordered">
      <thead>
        <tr>
          <th>Installment No.</th>
          <th>Opening Balance</th>
          <th>Interest Component</th>
          <th>Principal Component</th>
          <th>EMI</th>
          <th>EMI Status</th>
          <th>Closing Balance</th>
          <th>Due Date</th>
        </tr>
      </thead>
      <tbody>
      <c:forEach items="${repaymentSchedule}" var="rs">
        <tr>
          <td>${rs.installmentNo}</td>
          <td>${rs.openingBalance}</td>
          <td>${rs.interestComponent}</td>
          <td>${rs.principalComponent}</td>
          <td>${rs.emi}</td>
          <td>${rs.emiStatus}</td>
          <td>${rs.closingBalance}</td>
          <td>${rs.dueDate}</td>
        </tr>
        </c:forEach>
      </tbody>
    </table>
    </c:if>
    <script>
        $(document).ready(function(){
      	$("#myTable").dataTable()
      	});
      </script>
</body>
</html>
