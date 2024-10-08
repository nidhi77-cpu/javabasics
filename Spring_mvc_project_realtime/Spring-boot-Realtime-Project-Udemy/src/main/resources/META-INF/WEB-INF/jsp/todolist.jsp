
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Hello World</title>
</head>
<body>
    <h1>Todo List</h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Username</th>
                <th>Description</th>
                <th>Target Date</th>
                <th>Done</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.id}</td>
                    <td>${todo.username}</td>
                    <td>${todo.description}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done ? 'Yes' : 'No'}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
