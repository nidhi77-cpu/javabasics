
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Hello World</title>
</head>
<body>
	<title>Todo</title>
	<div> Your Todos are ${todos}
	</div>
	
	<c:forEach items="${todos}"></c:forEach>
</body>
</html>
