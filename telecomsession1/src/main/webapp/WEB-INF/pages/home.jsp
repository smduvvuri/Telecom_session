<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<h2>
Details of the Customer: <br></h2>
<h4>
Name is <c:out value="${user.name}"/> <br>
Mobile Number is <c:out value="${user.mobileNo}"/> <br>
Balance is <c:out value="${user.balance}"/>
</h4>
</body>
</html>