<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Hello World</title>
</head>
<body>
	<title>Login Form</title>
	<pre>${errormessage}</pre>
	<form action="/submit_form" method="post">
		<div>
			<label for="username">Username:</label> <input type="text"
				id="username" name="username" required>
		</div>
		<div>
			<label for="password">Password:</label> <input type="password"
				id="password" name="password" required>
		</div>
		<div>
			<button type="submit">Submit</button>
		</div>
	</form>
</body>
</html>