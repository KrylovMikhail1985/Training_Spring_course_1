<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>AllEmployees</title>
</head>
<body>
    <h2>All Employees</h2>
    <table>
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Department</th>
            <th>Salary</th>
            <th>Operations</th>
        </tr>
        <c:forEach var="emp" items="${allEmployees}">

            <c:url var="editButton" value="/editEmployee">
                <c:param name ="empId" value="${emp.id}"/>
            </c:url>
            <c:url var="deleteButton" value="/deleteEmployee">
                <c:param name ="empId" value="${emp.id}"/>
            </c:url>

            <tr>
                <td>${emp.name}</td>
                <td>${emp.surname}</td>
                <td>${emp.department}</td>
                <td>${emp.salary}</td>
                <td>
                    <input type="button" value="edit" onclick="window.location.href = '${editButton}'"/>
                    <input type="button" value="delete" onclick="window.location.href = '${deleteButton}'">
                </td>
            </tr>
        </c:forEach>
    </table>
<br>
<input type="button" value="add" onclick="window.location.href = 'addNewEmployee'">
</body>
</html>
