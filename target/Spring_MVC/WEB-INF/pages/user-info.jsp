<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2> User Info </h2>
<br>

<form:form action="saveUser" modelAttribute="user">

    Name <form:input type="text" path="name"/>
    <input type="text" name="name" id = "name">
    <br><br>
    Last Name <form:input path="lastName"/>
    <br><br>
    Age <form:input path="age"/>
    <br><br>
    Email <form:input path="email"/>
    <br><br>
    <input type="submit" value="OK">

</form:form>

</body>

</html>