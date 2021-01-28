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
    <script src="<c:url value="/resources/jquery-3.3.1.slim.min.js" />" ></script>
    <script src="<c:url value="/resources/popper.min.js" />" ></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />" ></script>
    <script src="<c:url value="/resources/jquery-3.3.1.min.js" />" ></script>
    <link rel="stylesheet" href="<c:url value="/resources/jquery.dataTables.min.css" />" >
    <script src="<c:url value="/resources/jquery.dataTables.min.js" />" ></script>
</head>
<body>
  <div class="container-fluid border border-dark mt-3 m-2 p-1" style="width: auto;">
    <div class="row py-0 ">
      <div class="col">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
          <ul class="navbar-nav small">
            <li class="nav-item">
              <a class="nav-link" href="#">Product</a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#">Policy Setup</a>
              <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="list">Eligibility Policy</a></li>
              </ul>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#">Parameters</a>
              <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="#"></a></li>
              </ul>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Application</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Receipt</a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#">Accounting</a>
              <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="#"></a></li>
              </ul>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Customer Service</a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" >Report</a>
              <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="#"></a></li>
              </ul>
            </li>
          </ul>
        </nav>
      </div>
    </div>
    <div class="row py-4 border m-0">
      <div class="col-10">
        <h5> Eligibility Policies</h5>
      </div>
      <div class="col-2">
        <a class="btn btn-primary btn-sm" href="newEligibilityPolicy" role="button">New Eligibility Policy</a>
      </div>
    </div>
    <div class="row border m-0 py-4">
      <div class="col">
        <table class="table table-striped table-bordered text-truncate small" id="myTable">
          <thead>
            <tr>
              <th>Eligibility Policy Code</th>
              <th>Eligibility Policy Name</th>
              <th>Eligibility Policy Description</th>
              <th>Created By</th>
              <th>Status</th>
              <th>Reviewed By</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody>
          <c:forEach var="tempEligibilityPolicies" items="${eligibilityPolicies}">
            <!-- construct an "update" link -->
          	<c:url var="updateLink" value="showFormForUpdate">
          	    <c:param name="policyCode" value="${tempEligibilityPolicies.getPolicyCode()}" />
          	</c:url>
          	<!-- construct an "delete" link -->
          	<c:url var="deleteLink" value="delete">
          	    <c:param name="policyCode" value="${tempEligibilityPolicies.getPolicyCode()}" />
          	</c:url>
            <tr>
              <td>${tempEligibilityPolicies.policyCode} </td>
              <td>${tempEligibilityPolicies.policyName} </td>
              <td>${tempEligibilityPolicies.policyDescription} </td>
              <td> </td>
              <td>${tempEligibilityPolicies.policyStatus} </td>
              <td> </td>
              <td>
                 <a href="${updateLink}">Edit</a>
                 |
                 <a href="${deleteLink}" onclick="if (!(confirm('Are you sure you want to delete this EligibilityPolicy ?'))) return false">Delete</a></td>
            </tr>
          </c:forEach>
          </tbody>
        </table>
      </div>
    </div>
  </div>

  <script>
    $(document).ready( function () {
      $('#myTable').DataTable();
    } );
  </script>
</body>
</html>