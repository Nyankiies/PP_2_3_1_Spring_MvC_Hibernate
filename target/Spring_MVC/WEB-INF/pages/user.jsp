<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

<h2>All User</h2>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Last Name</th>
        <th>age</th>
        <th>email</th>
    </tr>
    <c:forEach var="usr" items = "${AllUser}">

        <tr>
            <td>${usr.name}</td>
            <td>${usr.lastName}</td>
            <td>${usr.age}</td>
            <td>${usr.email }</td>
        </tr>

    </c:forEach>
</table>
<br>
<input type="button" value="Add"
    onclick="window.location.href = 'addNewUser'"/>
